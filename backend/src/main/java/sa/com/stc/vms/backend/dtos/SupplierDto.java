package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.vms.backend.models.Supplier;

import java.util.UUID;

public class SupplierDto extends BaseModelDto {
    private String nameAr;
    private String nameEn;

    public SupplierDto() {
    }

    public SupplierDto(UUID id) {
        super(id);
    }

    public SupplierDto(Supplier model) {
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
