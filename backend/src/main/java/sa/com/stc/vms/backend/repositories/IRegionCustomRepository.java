package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.RegionFilter;
import sa.com.stc.vms.backend.models.Region;

public interface IRegionCustomRepository  extends IBaseCustomRepository<Region, RegionFilter> {
}
