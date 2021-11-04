package sa.com.stc.vms.backend.services;

import sa.com.stc.common.services.IBaseCustomService;
import sa.com.stc.vms.backend.filters.ServiceCostFilter;
import sa.com.stc.vms.backend.models.ServiceCost;

public interface IServiceCostService extends IBaseCustomService<ServiceCost, ServiceCostFilter> {
}
