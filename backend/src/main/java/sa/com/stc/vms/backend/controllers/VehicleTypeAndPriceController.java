package sa.com.stc.vms.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.VehicleTypeAndPriceDto;
import sa.com.stc.vms.backend.dtos.VehicleTypeAndPricePostUpdateDto;
import sa.com.stc.vms.backend.filters.VehicleTypeAndPriceFilter;
import sa.com.stc.vms.backend.models.VehicleTypeAndPrice;
import sa.com.stc.vms.backend.services.IVehicleTypeAndPriceService;

@RestController
@RequestMapping("/api/vehicle-type-and-price")
public class VehicleTypeAndPriceController extends
        BaseCRUDCustomController<VehicleTypeAndPrice, VehicleTypeAndPriceDto, VehicleTypeAndPricePostUpdateDto, VehicleTypeAndPricePostUpdateDto, VehicleTypeAndPriceFilter, IVehicleTypeAndPriceService> {

    public VehicleTypeAndPriceController(IVehicleTypeAndPriceService service) {
        super(service);
    }

    @Override
    public VehicleTypeAndPriceDto MapModelToModelDto(VehicleTypeAndPrice model) {
        return new VehicleTypeAndPriceDto(model);
    }

    @Override
    public VehicleTypeAndPrice MapPostDtoToModel(VehicleTypeAndPricePostUpdateDto employeeViolationPostUpdateDto) {
        return new VehicleTypeAndPrice(employeeViolationPostUpdateDto);
    }

    @Override
    public VehicleTypeAndPrice MapUpdateDtoToModel(VehicleTypeAndPricePostUpdateDto employeeViolationPostUpdateDto) {
        return new VehicleTypeAndPrice(employeeViolationPostUpdateDto);
    }
}
