package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.ViolationPenaltyFilter;
import sa.com.stc.vms.backend.models.ViolationPenalty;

public interface IViolationPenaltyCustomRepository extends IBaseCustomRepository<ViolationPenalty, ViolationPenaltyFilter> {
}
