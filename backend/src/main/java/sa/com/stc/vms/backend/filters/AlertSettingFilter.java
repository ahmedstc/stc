package sa.com.stc.vms.backend.filters;

import sa.com.stc.common.filters.BaseFilter;

import java.util.UUID;

public class AlertSettingFilter extends BaseFilter {
    private String nameAR;
    private String nameEN;
    private UUID alertTypeLookupId;

    public String getNameAR() {
        return nameAR;
    }

    public void setNameAR(String nameAR) {
        this.nameAR = nameAR;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public UUID getAlertTypeLookupId() {
        return alertTypeLookupId;
    }

    public void setAlertTypeLookupId(UUID alertTypeLookupId) {
        this.alertTypeLookupId = alertTypeLookupId;
    }
}
