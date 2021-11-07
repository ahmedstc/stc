package sa.com.stc.vms.backend.filters;

import sa.com.stc.common.filters.BaseFilter;

import java.util.UUID;

public class SupplierSettingFilter extends BaseFilter {
    private String nameAR;
    private String nameEN;
    private UUID supplierSettingTypeLookupId;
    private String projectManager;
    private String email;
    private Integer mobileNumber;

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
