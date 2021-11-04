package sa.com.stc.vms.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.EmployeeViolationDto;
import sa.com.stc.vms.backend.dtos.EmployeeViolationPostUpdateDto;
import sa.com.stc.vms.backend.filters.EmployeeViolationFilter;
import sa.com.stc.vms.backend.models.EmployeeViolation;
import sa.com.stc.vms.backend.services.IEmployeeViolationService;

@RestController
@RequestMapping("/api/employeeViolation")
public class EmployeeViolationController extends
        BaseCRUDCustomController<EmployeeViolation, EmployeeViolationDto, EmployeeViolationPostUpdateDto, EmployeeViolationPostUpdateDto, EmployeeViolationFilter, IEmployeeViolationService> {

    @Autowired
    IEmployeeViolationService iEmployeeViolationService;

    public EmployeeViolationController(IEmployeeViolationService service) {
        super(service);
    }

    @Override
    public EmployeeViolationDto MapModelToModelDto(EmployeeViolation model) {
        return new EmployeeViolationDto(model);
    }

    @Override
    public EmployeeViolation MapPostDtoToModel(EmployeeViolationPostUpdateDto employeeViolationPostUpdateDto) {
        return new EmployeeViolation(employeeViolationPostUpdateDto);
    }

    @Override
    public EmployeeViolation MapUpdateDtoToModel(EmployeeViolationPostUpdateDto employeeViolationPostUpdateDto) {
        return new EmployeeViolation(employeeViolationPostUpdateDto);
    }
}
