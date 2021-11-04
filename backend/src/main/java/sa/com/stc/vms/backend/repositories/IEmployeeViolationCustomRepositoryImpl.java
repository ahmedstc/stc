package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
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
}
