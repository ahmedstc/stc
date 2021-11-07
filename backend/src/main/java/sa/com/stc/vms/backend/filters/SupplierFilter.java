package sa.com.stc.vms.backend.filters;

import sa.com.stc.common.filters.BaseFilter;

import java.util.UUID;

public class SupplierFilter extends BaseFilter {
    private String nameAR;
    private String nameEN;
    private UUID supplierTypeLookupId;

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

    public UUID getSupplierTypeLookupId() {
        return supplierTypeLookupId;
    }

    public void setSupplierTypeLookupId(UUID supplierTypeLookupId) {
        this.supplierTypeLookupId = supplierTypeLookupId;
    }
}
