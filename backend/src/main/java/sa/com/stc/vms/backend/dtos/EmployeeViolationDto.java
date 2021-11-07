package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.configurationdefinition.dtos.ArabicEnglishLookup;
import sa.com.stc.vms.backend.models.EmployeeViolation;

import java.util.UUID;

public class EmployeeViolationDto extends BaseModelDto {
    private String nameAr;
    private String nameEn;
    private UUID employeeViolationTypeLookupId;
    private ArabicEnglishLookup employeeViolationTypeLookup;

    public EmployeeViolationDto() {
    }

    public EmployeeViolationDto(UUID id) {
        super(id);
    }

    public EmployeeViolationDto(EmployeeViolation model) {
        super(model);
        this.nameAr = model.getNameAr();
        this.nameEn = model.getNameEn();
        this.employeeViolationTypeLookupId = model.getEmployeeViolationTypeLookupId();
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
