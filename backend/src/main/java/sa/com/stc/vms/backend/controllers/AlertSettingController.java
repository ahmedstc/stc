package sa.com.stc.vms.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.AlertSettingDto;
import sa.com.stc.vms.backend.dtos.AlertSettingPostUpdateDto;
import sa.com.stc.vms.backend.filters.AlertSettingFilter;
import sa.com.stc.vms.backend.models.AlertSetting;
import sa.com.stc.vms.backend.services.IAlertSettingService;

@RestController
@RequestMapping("/api/alertSetting")
public class AlertSettingController extends
        BaseCRUDCustomController<AlertSetting, AlertSettingDto, AlertSettingPostUpdateDto, AlertSettingPostUpdateDto, AlertSettingFilter, IAlertSettingService> {

    @Autowired
    IAlertSettingService iAlertSettingService;

    public AlertSettingController(IAlertSettingService service) {
        super(service);
    }

    @Override
    public AlertSettingDto MapModelToModelDto(AlertSetting model) {
        return new AlertSettingDto(model);
    }

    @Override
    public AlertSetting MapPostDtoToModel(AlertSettingPostUpdateDto insuranceCompanyPostUpdateDto) {
        return new AlertSetting(insuranceCompanyPostUpdateDto);
    }

    @Override
    public AlertSetting MapUpdateDtoToModel(AlertSettingPostUpdateDto insuranceCompanyPostUpdateDto) {
        return new AlertSetting(insuranceCompanyPostUpdateDto);
    }
}
