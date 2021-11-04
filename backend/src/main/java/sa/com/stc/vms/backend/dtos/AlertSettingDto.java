package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.vms.backend.models.AlertSetting;

import java.util.UUID;

public class AlertSettingDto extends BaseModelDto {
    private String nameAr;
    private String nameEn;

    public AlertSettingDto() {
    }

    public AlertSettingDto(UUID id) {
        super(id);
    }

    public AlertSettingDto(AlertSetting model) {
        super(model);
        this.nameAr = model.getNameAr();
        this.nameEn = model.getNameEn();
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
}
