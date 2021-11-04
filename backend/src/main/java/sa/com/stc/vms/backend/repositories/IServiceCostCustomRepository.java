package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.ServiceCostFilter;
import sa.com.stc.vms.backend.models.ServiceCost;

public interface IServiceCostCustomRepository extends IBaseCustomRepository<ServiceCost, ServiceCostFilter> {
}
