package sa.com.stc.vms.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.PlateSettingDto;
import sa.com.stc.vms.backend.dtos.PlateSettingPostUpdateDto;
import sa.com.stc.vms.backend.filters.PlateSettingFilter;
import sa.com.stc.vms.backend.models.PlateSetting;
import sa.com.stc.vms.backend.services.IPlateSettingService;

@RestController
@RequestMapping("/api/plate-setting")
public class PlateSettingController extends
        BaseCRUDCustomController<PlateSetting, PlateSettingDto, PlateSettingPostUpdateDto, PlateSettingPostUpdateDto, PlateSettingFilter, IPlateSettingService> {

    public PlateSettingController(IPlateSettingService service) {
        super(service);
    }

    @Override
    public PlateSettingDto MapModelToModelDto(PlateSetting model) {
        return new PlateSettingDto(model);
    }

    @Override
    public PlateSetting MapPostDtoToModel(PlateSettingPostUpdateDto plateSettingPostUpdateDto) {
        return new PlateSetting(plateSettingPostUpdateDto);
    }

    @Override
    public PlateSetting MapUpdateDtoToModel(PlateSettingPostUpdateDto plateSettingPostUpdateDto) {
        return new PlateSetting(plateSettingPostUpdateDto);
    }
}
