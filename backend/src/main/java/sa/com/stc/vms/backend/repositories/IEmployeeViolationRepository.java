package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseRepository;
import sa.com.stc.vms.backend.models.EmployeeViolation;

public interface IEmployeeViolationRepository extends IBaseRepository<EmployeeViolation>, IEmployeeViolationCustomRepository {
}
