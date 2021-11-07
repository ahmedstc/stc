package sa.com.stc.vms.backend.dtos;

import javax.persistence.Column;
import java.util.UUID;

public class SupplierSettingPostUpdateDto {

    private String nameAr;
    private String nameEn;
    private UUID supplierSettingTypeLookupId;
    private String projectManager;
    private String email;
    private Integer mobileNumber;

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
