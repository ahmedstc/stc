package sa.com.stc.vms.backend.models;

import org.hibernate.annotations.Type;
import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.SupplierSettingPostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class SupplierSetting extends BaseModel {
    @Column
    private String nameAr;
    @Column
    private String nameEn;
    @Column
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID supplierSettingTypeLookupId;
    @Column
    private String projectManager;
    @Column
    private String email;
    @Column
    private Integer mobileNumber;

    public SupplierSetting() {
    }

    public SupplierSetting(UUID id) {
        super(id);
    }

    public SupplierSetting(SupplierSettingPostUpdateDto dto) {
        super(UUID.randomUUID());
        this.nameAr = dto.getNameAr();
        this.nameEn = dto.getNameEn();
        this.supplierSettingTypeLookupId = dto.getSupplierSettingTypeLookupId();
        this.projectManager = dto.getProjectManager();
        this.email = dto.getEmail();
        this.mobileNumber = dto.getMobileNumber();
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

    public UUID getSupplierSettingTypeLookupId() {
        return supplierSettingTypeLookupId;
    }

    public void setSupplierSettingTypeLookupId(UUID supplierSettingTypeLookupId) {
        this.supplierSettingTypeLookupId = supplierSettingTypeLookupId;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
