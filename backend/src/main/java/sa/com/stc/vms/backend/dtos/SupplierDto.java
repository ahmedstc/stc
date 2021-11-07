package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.configurationdefinition.dtos.ArabicEnglishLookup;
import sa.com.stc.vms.backend.models.Supplier;

import java.util.UUID;

public class SupplierDto extends BaseModelDto {
    private String nameAr;
    private String nameEn;
    private UUID supplierTypeLookupId;
    private ArabicEnglishLookup supplierTypeLookup;

    public SupplierDto() {
    }

    public SupplierDto(UUID id) {
        super(id);
    }

    public SupplierDto(Supplier model) {
        super(model);
        this.nameAr = model.getNameAr();
        this.nameEn = model.getNameEn();
        this.supplierTypeLookupId = model.getSupplierTypeLookupId();
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

    public UUID getSupplierTypeLookupId() {
        return supplierTypeLookupId;
    }

    public void setSupplierTypeLookupId(UUID supplierTypeLookupId) {
        this.supplierTypeLookupId = supplierTypeLookupId;
    }

    public ArabicEnglishLookup getSupplierTypeLookup() {
        return supplierTypeLookup;
    }

    public void setSupplierTypeLookup(ArabicEnglishLookup supplierTypeLookup) {
        this.supplierTypeLookup = supplierTypeLookup;
    }
}
