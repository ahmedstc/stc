package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.EmployeeViolationFilter;
import sa.com.stc.vms.backend.models.EmployeeViolation;
import sa.com.stc.vms.backend.repositories.IEmployeeViolationRepository;

@Service
public class IEmployeeViolationServiceImpl
        extends IBaseCustomServiceImpl<EmployeeViolation, EmployeeViolationFilter, IEmployeeViolationRepository>
        implements IEmployeeViolationService {

    public IEmployeeViolationServiceImpl(IEmployeeViolationRepository repository) {
        super(repository);
    }
}
