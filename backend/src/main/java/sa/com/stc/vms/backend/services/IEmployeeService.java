package sa.com.stc.vms.backend.services;

import sa.com.stc.common.services.IBaseCustomService;
import sa.com.stc.vms.backend.filters.EmployeeFilter;
import sa.com.stc.vms.backend.models.Employee;

public interface IEmployeeService extends IBaseCustomService<Employee, EmployeeFilter> {
}
