package sa.com.stc.vms.backend.services;

import sa.com.stc.common.services.IBaseCustomService;
import sa.com.stc.vms.backend.filters.EmployeeViolationFilter;
import sa.com.stc.vms.backend.models.EmployeeViolation;

public interface IEmployeeViolationService extends IBaseCustomService<EmployeeViolation, EmployeeViolationFilter> {
}
