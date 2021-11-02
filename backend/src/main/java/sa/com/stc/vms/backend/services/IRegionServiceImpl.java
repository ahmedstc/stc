package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.RegionFilter;
import sa.com.stc.vms.backend.models.Region;
import sa.com.stc.vms.backend.repositories.IRegionRepository;

@Service
public class IRegionServiceImpl
        extends IBaseCustomServiceImpl<Region, RegionFilter, IRegionRepository>
        implements IRegionService {

    public IRegionServiceImpl(IRegionRepository repository) {
        super(repository);
    }
}
