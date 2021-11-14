package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.EmployeeFilter;
import sa.com.stc.vms.backend.models.Employee;
import sa.com.stc.vms.backend.repositories.IEmployeeRepository;

@Service
public class IEmployeeServiceImpl
        extends IBaseCustomServiceImpl<Employee, EmployeeFilter, IEmployeeRepository>
        implements IEmployeeService {

    public IEmployeeServiceImpl(IEmployeeRepository repository) {
        super(repository);
    }
}
