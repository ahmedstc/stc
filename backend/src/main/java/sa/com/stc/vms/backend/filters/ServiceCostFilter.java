package sa.com.stc.vms.backend.filters;

import sa.com.stc.common.filters.BaseFilter;

import java.util.UUID;

public class ServiceCostFilter extends BaseFilter {
    private String nameAR;
    private String nameEN;
    private UUID serviceTypeLookupId;

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

    public UUID getServiceTypeLookupId() {
        return serviceTypeLookupId;
    }

    public void setServiceTypeLookupId(UUID serviceTypeLookupId) {
        this.serviceTypeLookupId = serviceTypeLookupId;
    }
}
