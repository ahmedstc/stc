package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.ViolationPenaltyFilter;
import sa.com.stc.vms.backend.models.QViolationPenalty;
import sa.com.stc.vms.backend.models.ViolationPenalty;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IViolationPenaltyCustomRepositoryImpl extends IBaseCustomRepositoryImpl<ViolationPenalty, ViolationPenaltyFilter>
        implements IViolationPenaltyCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<ViolationPenalty> getEntityPath() {
        return QViolationPenalty.violationPenalty;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public ViolationPenaltyFilter getFilterInstance() {
        return new ViolationPenaltyFilter();
    }

    @Override
    public <E> JPQLQuery<E> queryForFilter(EntityPath<? extends ViolationPenalty> pathToEntity, JPQLQuery<E> query,
                                           ViolationPenaltyFilter filter) {
        var result = super.queryForFilter(pathToEntity, query, filter);
        var entityPath = new QViolationPenalty(pathToEntity.toString());

        if (filter.getPenaltyOrder() != null) {
            result = result.where(entityPath.penaltyOrder.eq(filter.getPenaltyOrder()));
        }
        if (filter.getPoints() != null) {
            result = result.where(entityPath.points.eq(filter.getPoints()));
        }
        if (filter.getEmployeeViolationId() != null) {
            result = result.where(entityPath.employeeViolationId.eq(filter.getEmployeeViolationId()));
        }
        return result;
    }
}
