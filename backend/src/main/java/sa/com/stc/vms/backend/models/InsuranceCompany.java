package sa.com.stc.vms.backend.models;

import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.InsuranceCompanyPostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
public class InsuranceCompany extends BaseModel {
    @Column
    private String nameAr;
    @Column
    private String nameEn;
    @Column
    private String email;

    public InsuranceCompany() {
    }

    public InsuranceCompany(UUID id) {
        super(id);
    }

    public InsuranceCompany(InsuranceCompanyPostUpdateDto dto) {
        super(UUID.randomUUID());
        this.nameAr = dto.getNameAr();
        this.nameEn = dto.getNameEn();
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
