package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseRepository;
import sa.com.stc.vms.backend.models.UserProfile;

public interface IUserProfileRepository extends IBaseRepository<UserProfile>, IUserProfileCustomRepository {
}
