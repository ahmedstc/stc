package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.EmployeeFilter;
import sa.com.stc.vms.backend.models.Employee;
import sa.com.stc.vms.backend.models.QEmployee;

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

    @Override
    public <E> JPQLQuery<E> queryForFilter(EntityPath<? extends Employee> pathToEntity, JPQLQuery<E> query,
                                           EmployeeFilter filter) {
        var result = super.queryForFilter(pathToEntity, query, filter);
        var entityPath = new QEmployee(pathToEntity.toString());

        if (filter.getEmployeeId() != null) {
            result = result.where(entityPath.employeeId.eq(filter.getEmployeeId()));
        }
        if (filter.getNameAr() != null) {
            result = result.where(entityPath.nameAr.eq(filter.getNameAr()));
        }
        if (filter.getNameEn() != null) {
            result = result.where(entityPath.nameEn.eq(filter.getNameEn()));
        }
        if (filter.getEmail() != null) {
            result = result.where(entityPath.email.eq(filter.getEmail()));
        }
        if (filter.getPreferredLanguage() != null) {
            result = result.where(entityPath.preferredLanguage.eq(filter.getPreferredLanguage()));
        }
        if (filter.getAccountStatus() != null) {
            result = result.where(entityPath.accountStatus.eq(filter.getAccountStatus()));
        }
        if (filter.getNumberOfAssignedVehicles() != null) {
            result = result.where(entityPath.numberOfAssignedVehicles.eq(filter.getNumberOfAssignedVehicles()));
        }
        if (filter.getUserProfileId() != null) {
            result = result.where(entityPath.userProfileId.eq(filter.getUserProfileId()));
        }
        if (filter.getRegionLookupId() != null) {
            result = result.where(entityPath.regionLookupId.eq(filter.getRegionLookupId()));
        }
        return result;
    }
}
