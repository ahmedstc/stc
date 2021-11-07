package sa.com.stc.vms.backend.dtos;

import java.util.UUID;

public class AlertSettingPostUpdateDto {

    private String nameAr;
    private String nameEn;
    private UUID alertTypeLookupId;

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
}
