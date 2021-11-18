package sa.com.stc.vms.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.VehicleRequestDto;
import sa.com.stc.vms.backend.dtos.VehicleRequestPostUpdateDto;
import sa.com.stc.vms.backend.filters.VehicleRequestFilter;
import sa.com.stc.vms.backend.models.VehicleRequest;
import sa.com.stc.vms.backend.services.IVehicleRequestService;

@RestController
@RequestMapping("/api/vehicle-request")
public class VehicleRequestController extends
        BaseCRUDCustomController<VehicleRequest, VehicleRequestDto, VehicleRequestPostUpdateDto, VehicleRequestPostUpdateDto, VehicleRequestFilter, IVehicleRequestService> {

    public VehicleRequestController(IVehicleRequestService service) {
        super(service);
    }

    @Override
    public VehicleRequestDto MapModelToModelDto(VehicleRequest model) {
        return new VehicleRequestDto(model);
    }

    @Override
    public VehicleRequest MapPostDtoToModel(VehicleRequestPostUpdateDto employeeViolationPostUpdateDto) {
        return new VehicleRequest(employeeViolationPostUpdateDto);
    }

    @Override
    public VehicleRequest MapUpdateDtoToModel(VehicleRequestPostUpdateDto employeeViolationPostUpdateDto) {
        return new VehicleRequest(employeeViolationPostUpdateDto);
    }
}
