package sa.com.stc.vms.backend.services;

import sa.com.stc.common.services.IBaseCustomService;
import sa.com.stc.vms.backend.filters.UserProfileFilter;
import sa.com.stc.vms.backend.models.UserProfile;

public interface IUserProfileService extends IBaseCustomService<UserProfile, UserProfileFilter> {
}
