package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.vms.backend.models.InsuranceCompany;

import java.util.UUID;

public class InsuranceCompanyDto extends BaseModelDto {
    private String nameAr;
    private String nameEn;
    private String email;

    public InsuranceCompanyDto() {
    }

    public InsuranceCompanyDto(UUID id) {
        super(id);
    }

    public InsuranceCompanyDto(InsuranceCompany model) {
        super(model);
        this.nameAr = model.getNameAr();
        this.nameEn = model.getNameEn();
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
}
