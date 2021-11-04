package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.ServiceCostFilter;
import sa.com.stc.vms.backend.models.ServiceCost;
import sa.com.stc.vms.backend.repositories.IServiceCostRepository;

@Service
public class IServiceCostServiceImpl
        extends IBaseCustomServiceImpl<ServiceCost, ServiceCostFilter, IServiceCostRepository>
        implements IServiceCostService {

    public IServiceCostServiceImpl(IServiceCostRepository repository) {
        super(repository);
    }
}
