package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.EmployeeViolationFilter;
import sa.com.stc.vms.backend.models.EmployeeViolation;
import sa.com.stc.vms.backend.models.QEmployeeViolation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IEmployeeViolationCustomRepositoryImpl extends IBaseCustomRepositoryImpl<EmployeeViolation, EmployeeViolationFilter>
        implements IEmployeeViolationCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<EmployeeViolation> getEntityPath() {
        return QEmployeeViolation.employeeViolation;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public EmployeeViolationFilter getFilterInstance() {
        return new EmployeeViolationFilter();
    }

    @Override
    public <E> JPQLQuery<E> queryForFilter(EntityPath<? extends EmployeeViolation> pathToEntity, JPQLQuery<E> query,
                                           EmployeeViolationFilter filter) {
        var result = super.queryForFilter(pathToEntity, query, filter);
        var entityPath = new QEmployeeViolation(pathToEntity.toString());

        if (filter.getName() != null) {
            result = result.where(entityPath.name.eq(filter.getName()));
        }
        if (filter.getDescription() != null) {
            result = result.where(entityPath.description.eq(filter.getDescription()));
        }
        if (filter.getNoticeAr() != null) {
            result = result.where(entityPath.noticeAr.eq(filter.getNoticeAr()));
        }
        if (filter.getNoticeEn() != null) {
            result = result.where(entityPath.noticeEn.eq(filter.getNoticeEn()));
        }
        if (filter.getEmployeeViolationTypeLookupId() != null) {
            result = result.where(entityPath.employeeViolationTypeLookupId.eq(filter.getEmployeeViolationTypeLookupId()));
        }
        return result;
    }
}
