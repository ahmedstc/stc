package sa.com.stc.vms.backend.models;

import org.hibernate.annotations.Type;
import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.SupplierPostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Supplier extends BaseModel {
    @Column
    private String nameAr;
    @Column
    private String nameEn;
    @Column
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID supplierTypeLookupId;

    public Supplier() {
    }

    public Supplier(UUID id) {
        super(id);
    }

    public Supplier(SupplierPostUpdateDto dto) {
        super(UUID.randomUUID());
        this.nameAr = dto.getNameAr();
        this.nameEn = dto.getNameEn();
        this.supplierTypeLookupId = dto.getSupplierTypeLookupId();
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
}
