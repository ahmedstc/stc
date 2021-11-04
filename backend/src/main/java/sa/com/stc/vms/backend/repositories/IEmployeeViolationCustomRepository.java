package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.EmployeeViolationFilter;
import sa.com.stc.vms.backend.models.EmployeeViolation;

public interface IEmployeeViolationCustomRepository extends IBaseCustomRepository<EmployeeViolation, EmployeeViolationFilter> {
}
