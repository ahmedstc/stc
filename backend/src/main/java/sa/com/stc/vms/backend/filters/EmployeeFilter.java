package sa.com.stc.vms.backend.filters;

import sa.com.stc.common.filters.BaseFilter;

import java.util.UUID;

public class EmployeeFilter extends BaseFilter {
    private String employeeId;
    private String nameAr;
    private String nameEn;
    private String email;
    private String mobile;
    private String preferredLanguage;
    private String accountStatus;
    private String numberOfAssignedVehicles;
    private UUID userProfileId;
    private UUID regionLookupId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getNumberOfAssignedVehicles() {
        return numberOfAssignedVehicles;
    }

    public void setNumberOfAssignedVehicles(String numberOfAssignedVehicles) {
        this.numberOfAssignedVehicles = numberOfAssignedVehicles;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(UUID userProfileId) {
        this.userProfileId = userProfileId;
    }

    public UUID getRegionLookupId() {
        return regionLookupId;
    }

    public void setRegionLookupId(UUID regionLookupId) {
        this.regionLookupId = regionLookupId;
    }
}
