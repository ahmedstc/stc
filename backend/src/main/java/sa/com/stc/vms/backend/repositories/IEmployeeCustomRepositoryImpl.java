package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.EmployeeFilter;
import sa.com.stc.vms.backend.models.QEmployee;
import sa.com.stc.vms.backend.models.Employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IEmployeeCustomRepositoryImpl extends IBaseCustomRepositoryImpl<Employee, EmployeeFilter>
        implements IEmployeeCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<Employee> getEntityPath() {
        return QEmployee.employee;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public EmployeeFilter getFilterInstance() {
        return new EmployeeFilter();
    }
}
