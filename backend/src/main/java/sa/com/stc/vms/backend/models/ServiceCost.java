package sa.com.stc.vms.backend.models;

import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.ServiceCostPostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class ServiceCost extends BaseModel {
    @Column
    private String nameAr;
    @Column
    private String nameEn;

    public ServiceCost() {
    }

    public ServiceCost(UUID id) {
        super(id);
    }

    public ServiceCost(ServiceCostPostUpdateDto dto) {
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
}
