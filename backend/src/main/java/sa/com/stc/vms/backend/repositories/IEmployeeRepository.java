package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseRepository;
import sa.com.stc.vms.backend.models.Employee;

public interface IEmployeeRepository extends IBaseRepository<Employee>, IEmployeeCustomRepository {
}
