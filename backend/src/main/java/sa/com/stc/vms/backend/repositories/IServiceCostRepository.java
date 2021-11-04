package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseRepository;
import sa.com.stc.vms.backend.models.ServiceCost;

public interface IServiceCostRepository extends IBaseRepository<ServiceCost>, IServiceCostCustomRepository {
}
