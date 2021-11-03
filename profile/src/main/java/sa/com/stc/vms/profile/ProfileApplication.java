package sa.com.stc.vms.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import sa.com.stc.common.annotations.EnableStcCommon;
import sa.com.stc.profile.models.resource.ExternalAuthenticator;
import sa.com.stc.profile.repositories.IExternalAuthenticatorRepository;

import javax.annotation.PostConstruct;
import java.util.UUID;

@SpringBootApplication(scanBasePackages = "sa.com.stc")
@EnableStcCommon
@EnableJpaRepositories("sa.com.stc")
@EntityScan("sa.com.stc")
public class ProfileApplication {

    @Autowired
    private IExternalAuthenticatorRepository externalAuthenticatorRepository;
    public static void main(String[] args) {
        SpringApplication.run(ProfileApplication.class, args);
    }

    @PostConstruct
    private void buildInitialAccounts() {
        var externalAuthFilter = this.externalAuthenticatorRepository.getFilterInstance();
        externalAuthFilter.setCode("vms");
        if (this.externalAuthenticatorRepository.existsByFilter(externalAuthFilter))
            return;

        var externalAuthenticator = new ExternalAuthenticator();
        externalAuthenticator.setId(UUID.randomUUID());
        externalAuthenticator.setAuthenticationUrlSchema("lb://WEBMETHODS/profile/authenticate/{username}/{password}");
        externalAuthenticator.setGetProfileUrlSchema("lb://WEBMETHODS/profile/{username}");
        externalAuthenticator.setGetProfilesUrlSchema("lb://WEBMETHODS/profile");
        externalAuthenticator.setCode("vms");

        this.externalAuthenticatorRepository.saveAndFlush(externalAuthenticator);
    }
}
