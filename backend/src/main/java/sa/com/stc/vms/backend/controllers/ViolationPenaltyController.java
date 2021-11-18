package sa.com.stc.vms.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.ViolationPenaltyDto;
import sa.com.stc.vms.backend.dtos.ViolationPenaltyPostUpdateDto;
import sa.com.stc.vms.backend.filters.ViolationPenaltyFilter;
import sa.com.stc.vms.backend.models.ViolationPenalty;
import sa.com.stc.vms.backend.services.IViolationPenaltyService;

@RestController
@RequestMapping("/api/violation-penalty")
public class ViolationPenaltyController extends
        BaseCRUDCustomController<ViolationPenalty, ViolationPenaltyDto, ViolationPenaltyPostUpdateDto, ViolationPenaltyPostUpdateDto, ViolationPenaltyFilter, IViolationPenaltyService> {

    public ViolationPenaltyController(IViolationPenaltyService service) {
        super(service);
    }

    @Override
    public ViolationPenaltyDto MapModelToModelDto(ViolationPenalty model) {
        return new ViolationPenaltyDto(model);
    }

    @Override
    public ViolationPenalty MapPostDtoToModel(ViolationPenaltyPostUpdateDto employeeViolationPostUpdateDto) {
        return new ViolationPenalty(employeeViolationPostUpdateDto);
    }

    @Override
    public ViolationPenalty MapUpdateDtoToModel(ViolationPenaltyPostUpdateDto employeeViolationPostUpdateDto) {
        return new ViolationPenalty(employeeViolationPostUpdateDto);
    }
}
