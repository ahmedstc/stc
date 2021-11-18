package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.JPQLQuery;
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

    @Override
    public <E> JPQLQuery<E> queryForFilter(EntityPath<? extends ServiceCost> pathToEntity, JPQLQuery<E> query,
                                           ServiceCostFilter filter) {
        var result = super.queryForFilter(pathToEntity, query, filter);
        var entityPath = new QServiceCost(pathToEntity.toString());

        if (filter.getNameAR() != null) {
            result = result.where(entityPath.nameAr.eq(filter.getNameAR()));
        }
        if (filter.getNameEN() != null) {
            result = result.where(entityPath.nameAr.eq(filter.getNameAR()));
        }
        if (filter.getServiceTypeLookupId() != null) {
            result = result.where(entityPath.serviceTypeLookupId.eq(filter.getServiceTypeLookupId()));
        }
        return result;
    }
}
