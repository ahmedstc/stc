package sa.com.stc.vms.backend.models;

import org.hibernate.annotations.Type;
import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.EmployeePostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class Employee extends BaseModel {
    @Column
    private String employeeId;
    @Column
    private String nameAr;
    @Column
    private String nameEn;
    @Column
    private String email;
    @Column
    private String mobile;
    @Column
    private String preferredLanguage;
    @Column
    private String accountStatus;
    @Column
    private String numberOfAssignedVehicles;
    @Column
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID userProfileId;
    @Column
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID regionLookupId;

    public Employee() {
    }

    public Employee(UUID id) {
        super(id);
    }

    public Employee(EmployeePostUpdateDto dto) {
        super(UUID.randomUUID());
        this.employeeId = dto.getEmployeeId();
        this.nameAr = dto.getNameAr();
        this.nameEn = dto.getNameEn();
        this.email = dto.getEmail();
        this.mobile = dto.getMobile();
        this.preferredLanguage = dto.getPreferredLanguage();
        this.accountStatus = dto.getAccountStatus();
        this.numberOfAssignedVehicles = dto.getNumberOfAssignedVehicles();
        this.userProfileId = dto.getUserProfileId();
        this.regionLookupId = dto.getRegionLookupId();
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
