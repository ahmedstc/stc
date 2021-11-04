package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.ServiceCostFilter;
import sa.com.stc.vms.backend.models.QServiceCost;
import sa.com.stc.vms.backend.models.ServiceCost;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IServiceCostCustomRepositoryImpl extends IBaseCustomRepositoryImpl<ServiceCost, ServiceCostFilter>
        implements IServiceCostCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<ServiceCost> getEntityPath() {
        return QServiceCost.serviceCost;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public ServiceCostFilter getFilterInstance() {
        return new ServiceCostFilter();
    }
}
