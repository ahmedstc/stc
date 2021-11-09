package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.ViolationPenaltyFilter;
import sa.com.stc.vms.backend.models.ViolationPenalty;
import sa.com.stc.vms.backend.repositories.IViolationPenaltyRepository;

@Service
public class IViolationPenaltyServiceImpl
        extends IBaseCustomServiceImpl<ViolationPenalty, ViolationPenaltyFilter, IViolationPenaltyRepository>
        implements IViolationPenaltyService {

    public IViolationPenaltyServiceImpl(IViolationPenaltyRepository repository) {
        super(repository);
    }
}
