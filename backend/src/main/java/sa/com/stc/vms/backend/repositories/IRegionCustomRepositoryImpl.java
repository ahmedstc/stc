package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.RegionFilter;
import sa.com.stc.vms.backend.models.QRegion;
import sa.com.stc.vms.backend.models.Region;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IRegionCustomRepositoryImpl extends IBaseCustomRepositoryImpl<Region, RegionFilter>
        implements IRegionCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<Region> getEntityPath() {
        return QRegion.region;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public RegionFilter getFilterInstance() {
        return new RegionFilter();
    }
}
