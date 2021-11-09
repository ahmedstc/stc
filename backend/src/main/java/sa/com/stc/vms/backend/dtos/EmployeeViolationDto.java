package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.configurationdefinition.dtos.ArabicEnglishLookup;
import sa.com.stc.vms.backend.models.EmployeeViolation;

import java.util.UUID;

public class EmployeeViolationDto extends BaseModelDto {
    private String name;
    private String description;
    private String noticeAr;
    private String noticeEn;
    private UUID employeeViolationTypeLookupId;
    private ArabicEnglishLookup employeeViolationTypeLookup;

    public EmployeeViolationDto() {
    }

    public EmployeeViolationDto(UUID id) {
        super(id);
    }

    public EmployeeViolationDto(EmployeeViolation model) {
        super(model);
        this.name = model.getName();
        this.description = model.getDescription();
        this.noticeAr = model.getNoticeAr();
        this.noticeEn = model.getNoticeEn();
        this.employeeViolationTypeLookupId = model.getEmployeeViolationTypeLookupId();
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

    public ArabicEnglishLookup getEmployeeViolationTypeLookup() {
        return employeeViolationTypeLookup;
    }

    public void setEmployeeViolationTypeLookup(ArabicEnglishLookup employeeViolationTypeLookup) {
        this.employeeViolationTypeLookup = employeeViolationTypeLookup;
    }
}
