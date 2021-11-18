package sa.com.stc.vms.backend.filters;

import sa.com.stc.common.filters.BaseFilter;

import java.util.UUID;

public class EmployeeViolationFilter extends BaseFilter {
    private String name;
    private String description;
    private String noticeAr;
    private String noticeEn;
    private UUID employeeViolationTypeLookupId;

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
