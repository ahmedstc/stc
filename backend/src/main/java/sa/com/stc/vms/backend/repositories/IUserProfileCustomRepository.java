package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.UserProfileFilter;
import sa.com.stc.vms.backend.models.UserProfile;

public interface IUserProfileCustomRepository extends IBaseCustomRepository<UserProfile, UserProfileFilter> {
}
