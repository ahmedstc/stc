package sa.com.stc.vms.backend.dtos;

import java.util.UUID;

public class SupplierPostUpdateDto {

    private String nameAr;
    private String nameEn;
    private UUID supplierTypeLookupId;

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

    public UUID getSupplierTypeLookupId() {
        return supplierTypeLookupId;
    }

    public void setSupplierTypeLookupId(UUID supplierTypeLookupId) {
        this.supplierTypeLookupId = supplierTypeLookupId;
    }
}
