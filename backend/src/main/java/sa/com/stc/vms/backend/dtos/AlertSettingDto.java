package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.configurationdefinition.dtos.ArabicEnglishLookup;
import sa.com.stc.vms.backend.models.AlertSetting;

import java.util.UUID;

public class AlertSettingDto extends BaseModelDto {
    private String nameAr;
    private String nameEn;
    private UUID alertTypeLookupId;
    private ArabicEnglishLookup alertTypeLookup;

    public AlertSettingDto() {
    }

    public AlertSettingDto(UUID id) {
        super(id);
    }

    public AlertSettingDto(AlertSetting model) {
        super(model);
        this.nameAr = model.getNameAr();
        this.nameEn = model.getNameEn();
        this.alertTypeLookupId = model.getAlertTypeLookupId();
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

    public UUID getAlertTypeLookupId() {
        return alertTypeLookupId;
    }

    public void setAlertTypeLookupId(UUID alertTypeLookupId) {
        this.alertTypeLookupId = alertTypeLookupId;
    }

    public ArabicEnglishLookup getAlertTypeLookup() {
        return alertTypeLookup;
    }

    public void setAlertTypeLookup(ArabicEnglishLookup alertTypeLookup) {
        this.alertTypeLookup = alertTypeLookup;
    }
}
