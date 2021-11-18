package sa.com.stc.vms.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.EmployeeDto;
import sa.com.stc.vms.backend.dtos.EmployeePostUpdateDto;
import sa.com.stc.vms.backend.filters.EmployeeFilter;
import sa.com.stc.vms.backend.models.Employee;
import sa.com.stc.vms.backend.services.IEmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController extends
        BaseCRUDCustomController<Employee, EmployeeDto, EmployeePostUpdateDto, EmployeePostUpdateDto, EmployeeFilter, IEmployeeService> {

    public EmployeeController(IEmployeeService service) {
        super(service);
    }

    @Override
    public EmployeeDto MapModelToModelDto(Employee model) {
        return new EmployeeDto(model);
    }

    @Override
    public Employee MapPostDtoToModel(EmployeePostUpdateDto serviceCostPostUpdateDto) {
        return new Employee(serviceCostPostUpdateDto);
    }

    @Override
    public Employee MapUpdateDtoToModel(EmployeePostUpdateDto serviceCostPostUpdateDto) {
        return new Employee(serviceCostPostUpdateDto);
    }
}
