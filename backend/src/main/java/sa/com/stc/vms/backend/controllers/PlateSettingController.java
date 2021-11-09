package sa.com.stc.vms.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.PlateSettingDto;
import sa.com.stc.vms.backend.dtos.PlateSettingPostUpdateDto;
import sa.com.stc.vms.backend.filters.PlateSettingFilter;
import sa.com.stc.vms.backend.models.PlateSetting;
import sa.com.stc.vms.backend.services.IPlateSettingService;

@RestController
@RequestMapping("/api/plateSetting")
public class PlateSettingController extends
        BaseCRUDCustomController<PlateSetting, PlateSettingDto, PlateSettingPostUpdateDto, PlateSettingPostUpdateDto, PlateSettingFilter, IPlateSettingService> {

    @Autowired
    IPlateSettingService iPlateSettingService;

    public PlateSettingController(IPlateSettingService service) {
        super(service);
    }

    @Override
    public PlateSettingDto MapModelToModelDto(PlateSetting model) {
        return new PlateSettingDto(model);
    }

    @Override
    public PlateSetting MapPostDtoToModel(PlateSettingPostUpdateDto employeeViolationPostUpdateDto) {
        return new PlateSetting(employeeViolationPostUpdateDto);
    }

    @Override
    public PlateSetting MapUpdateDtoToModel(PlateSettingPostUpdateDto employeeViolationPostUpdateDto) {
        return new PlateSetting(employeeViolationPostUpdateDto);
    }
}
