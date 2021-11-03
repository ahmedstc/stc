package sa.com.stc.vms.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import sa.com.stc.common.helpers.IAsynchronizer;
import sa.com.stc.profile.exceptions.InvalidLoginExpetion;
import sa.com.stc.profile.models.ResourcePermission;
import sa.com.stc.profile.models.resource.ExternalUserResource;
import sa.com.stc.profile.repositories.IExternalAuthenticatorRepository;
import sa.com.stc.profile.repositories.IExternalUserResourceRepository;
import sa.com.stc.profile.repositories.IResourcePermissionRepository;
import sa.com.stc.profile.services.IAuthenticationManager;
import sa.com.stc.profile.utils.JwtTokenUtil;

import java.util.UUID;

@RestController
@RequestMapping("authentication/custom-for-vms")
public class VMSCustomLoginController {

    @Autowired
    private IAsynchronizer asynchronizer;
    @Autowired
    private IAuthenticationManager authenticationManager;
    @Autowired
    private WebClient webClient;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private IExternalAuthenticatorRepository externalAuthenticatorRepository;
    @Autowired
    private IExternalUserResourceRepository externalUserResourceRepository;
    @Autowired
    private IResourcePermissionRepository resourcePermissionRepository;


    @PostMapping
    public Mono<JwtResponse> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
        var ssmsExternalAuthFilter = this.externalAuthenticatorRepository.getFilterInstance();
        ssmsExternalAuthFilter.setCode("ssms");

        return this.asynchronizer
                .wrapForJDBCOperationSignle(
                        () -> this.externalAuthenticatorRepository.findOneByFilter(ssmsExternalAuthFilter))
                .filter(x -> x.isPresent()).map(x -> x.get()).flatMap(extetrnalAuth -> {
                    var authenticationLink = extetrnalAuth.getAuthenticationUrlSchema()
                            .replaceAll("\\{username\\}", authenticationRequest.getUsername())
                            .replaceAll("\\{password\\}", authenticationRequest.getPassword());
                    return this.webClient.post().uri(authenticationLink).retrieve().bodyToMono(Boolean.class)
                            .flatMap(result -> {
                                if (result)
                                    return Mono.just(authenticationRequest.getUsername());
                                else
                                    return Mono.error(new InvalidLoginExpetion());
                            })
                            // to create user in profile database if not exists
                            .flatMap(username -> {
                                var externalUsersFilter = this.externalUserResourceRepository.getFilterInstance();
                                externalUsersFilter.setUsername(username);
                                externalUsersFilter.setAuthenticatorFilter(ssmsExternalAuthFilter);

                                return this.asynchronizer.wrapForJDBCOperationSignle(
                                                () -> this.externalUserResourceRepository.findOneByFilter(externalUsersFilter))
                                        .flatMap(externalUser -> {
                                            // in case the external user is present
                                            if (externalUser.isPresent()) {
                                                if (externalUser.get().getIsLocked()
                                                        || externalUser.get().getIsDisabled())
                                                    return Mono.error(new InvalidLoginExpetion());
                                                else
                                                    return Mono.just(externalUser.get());
                                            }
                                            // if there's no user defined yet
                                            else {
                                                var externalUserToAdd = new ExternalUserResource();
                                                externalUserToAdd.setId(UUID.randomUUID());
                                                externalUserToAdd.setUsername(username);
                                                externalUserToAdd.setAuthenticator(extetrnalAuth);

                                                return this.asynchronizer.wrapForJDBCOperationSignle(
                                                                () -> this.externalUserResourceRepository
                                                                        .save(externalUserToAdd))
                                                        .flatMap(newUserAdded -> {
                                                            var resourcePermissions = new ResourcePermission();
                                                            resourcePermissions.setId(UUID.randomUUID());
                                                            resourcePermissions.setClassPermission(null);
                                                            resourcePermissions.setMethodPermission(null);
                                                            resourcePermissions.setResource(newUserAdded);

                                                            return this.asynchronizer.wrapForJDBCOperationSignle_withTransaction(() -> this.resourcePermissionRepository.save(resourcePermissions))
                                                                    .map(unused -> newUserAdded);
                                                        });
                                            }
                                        });
                            });
                }).flatMap(x -> this.authenticationManager.buildToken(x)).map(x -> this.jwtTokenUtil.generateToken(x))
                .map(x -> new JwtResponse(x));
    }
}

class JwtRequest {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class JwtResponse {
    private String token;

    public JwtResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}