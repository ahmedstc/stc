package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.configurationdefinition.dtos.ArabicEnglishLookup;
import sa.com.stc.vms.backend.models.SupplierSetting;

import java.util.UUID;

public class SupplierSettingDto extends BaseModelDto {
    private String nameAr;
    private String nameEn;
    private UUID supplierSettingTypeLookupId;
    private ArabicEnglishLookup supplierSettingTypeLookup;
    private String projectManager;
    private String email;
    private Integer mobileNumber;

    public SupplierSettingDto() {
    }

    public SupplierSettingDto(UUID id) {
        super(id);
    }

    public SupplierSettingDto(SupplierSetting model) {
        super(model);
        this.nameAr = model.getNameAr();
        this.nameEn = model.getNameEn();
        this.supplierSettingTypeLookupId = model.getSupplierSettingTypeLookupId();
        this.projectManager = model.getProjectManager();
        this.email = model.getEmail();
        this.mobileNumber = model.getMobileNumber();
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

    public ArabicEnglishLookup getSupplierSettingTypeLookup() {
        return supplierSettingTypeLookup;
    }

    public void setSupplierSettingTypeLookup(ArabicEnglishLookup supplierSettingTypeLookup) {
        this.supplierSettingTypeLookup = supplierSettingTypeLookup;
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
