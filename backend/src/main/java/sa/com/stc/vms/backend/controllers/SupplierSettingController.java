package sa.com.stc.vms.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.SupplierSettingDto;
import sa.com.stc.vms.backend.dtos.SupplierSettingPostUpdateDto;
import sa.com.stc.vms.backend.filters.SupplierSettingFilter;
import sa.com.stc.vms.backend.models.SupplierSetting;
import sa.com.stc.vms.backend.services.ISupplierSettingService;

@RestController
@RequestMapping("/api/supplier-setting")
public class SupplierSettingController extends
        BaseCRUDCustomController<SupplierSetting, SupplierSettingDto, SupplierSettingPostUpdateDto, SupplierSettingPostUpdateDto, SupplierSettingFilter, ISupplierSettingService> {

    public SupplierSettingController(ISupplierSettingService service) {
        super(service);
    }

    @Override
    public SupplierSettingDto MapModelToModelDto(SupplierSetting model) {
        return new SupplierSettingDto(model);
    }

    @Override
    public SupplierSetting MapPostDtoToModel(SupplierSettingPostUpdateDto supplierSettingPostUpdateDto) {
        return new SupplierSetting(supplierSettingPostUpdateDto);
    }

    @Override
    public SupplierSetting MapUpdateDtoToModel(SupplierSettingPostUpdateDto supplierSettingPostUpdateDto) {
        return new SupplierSetting(supplierSettingPostUpdateDto);
    }
}
