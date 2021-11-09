package sa.com.stc.vms.backend.models;

import org.hibernate.annotations.Type;
import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.EmployeeViolationPostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class EmployeeViolation extends BaseModel {
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String noticeAr;
    @Column
    private String noticeEn;
    @Column
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID employeeViolationTypeLookupId;

    public EmployeeViolation() {
    }

    public EmployeeViolation(UUID id) {
        super(id);
    }

    public EmployeeViolation(EmployeeViolationPostUpdateDto dto) {
        super(UUID.randomUUID());
        this.name = dto.getName();
        this.description = dto.getDescription();
        this.noticeAr = dto.getNoticeAr();
        this.noticeEn = dto.getNoticeEn();
        this.employeeViolationTypeLookupId = dto.getEmployeeViolationTypeLookupId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNoticeAr() {
        return noticeAr;
    }

    public void setNoticeAr(String noticeAr) {
        this.noticeAr = noticeAr;
    }

    public String getNoticeEn() {
        return noticeEn;
    }

    public void setNoticeEn(String noticeEn) {
        this.noticeEn = noticeEn;
    }

    public UUID getEmployeeViolationTypeLookupId() {
        return employeeViolationTypeLookupId;
    }

    public void setEmployeeViolationTypeLookupId(UUID employeeViolationTypeLookupId) {
        this.employeeViolationTypeLookupId = employeeViolationTypeLookupId;
    }
}
