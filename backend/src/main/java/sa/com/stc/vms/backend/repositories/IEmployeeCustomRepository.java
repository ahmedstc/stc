package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.EmployeeFilter;
import sa.com.stc.vms.backend.models.Employee;

public interface IEmployeeCustomRepository extends IBaseCustomRepository<Employee, EmployeeFilter> {
}
