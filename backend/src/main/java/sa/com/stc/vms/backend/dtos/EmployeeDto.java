package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.configurationdefinition.dtos.ArabicEnglishLookup;
import sa.com.stc.vms.backend.models.Employee;
import sa.com.stc.vms.backend.models.UserProfile;

import java.util.UUID;

public class EmployeeDto extends BaseModelDto {
    private String employeeId;
    private String nameAr;
    private String nameEn;
    private String email;
    private String mobile;
    private String preferredLanguage;
    private String accountStatus;
    private String numberOfAssignedVehicles;
    private UserProfile userProfile;
    private UUID regionLookupId;
    private ArabicEnglishLookup regionLookup;

    public EmployeeDto() {
    }

    public EmployeeDto(UUID id) {
        super(id);
    }

    public EmployeeDto(Employee model) {
        super(model);
        this.employeeId = model.getEmployeeId();
        this.nameAr = model.getNameAr();
        this.nameEn = model.getNameEn();
        this.email = model.getEmail();
        this.mobile = model.getMobile();
        this.preferredLanguage = model.getPreferredLanguage();
        this.accountStatus = model.getAccountStatus();
        this.numberOfAssignedVehicles = model.getNumberOfAssignedVehicles();
        this.userProfile = model.getUserProfile();
        this.regionLookupId = model.getRegionLookupId();
    }

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

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public UUID getRegionLookupId() {
        return regionLookupId;
    }

    public void setRegionLookupId(UUID regionLookupId) {
        this.regionLookupId = regionLookupId;
    }

    public ArabicEnglishLookup getRegionLookup() {
        return regionLookup;
    }

    public void setRegionLookup(ArabicEnglishLookup regionLookup) {
        this.regionLookup = regionLookup;
    }
}
