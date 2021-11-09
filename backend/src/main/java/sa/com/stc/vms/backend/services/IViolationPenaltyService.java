package sa.com.stc.vms.backend.services;

import sa.com.stc.common.services.IBaseCustomService;
import sa.com.stc.vms.backend.filters.ViolationPenaltyFilter;
import sa.com.stc.vms.backend.models.ViolationPenalty;

public interface IViolationPenaltyService extends IBaseCustomService<ViolationPenalty, ViolationPenaltyFilter> {
}
