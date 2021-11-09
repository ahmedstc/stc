package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.UserProfileFilter;
import sa.com.stc.vms.backend.models.UserProfile;
import sa.com.stc.vms.backend.repositories.IUserProfileRepository;

@Service
public class IUserProfileServiceImpl
        extends IBaseCustomServiceImpl<UserProfile, UserProfileFilter, IUserProfileRepository>
        implements IUserProfileService {

    public IUserProfileServiceImpl(IUserProfileRepository repository) {
        super(repository);
    }
}
