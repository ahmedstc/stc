package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.vms.backend.models.ServiceCost;

import java.util.UUID;

public class ServiceCostDto extends BaseModelDto {
    private String nameAr;
    private String nameEn;

    public ServiceCostDto() {
    }

    public ServiceCostDto(UUID id) {
        super(id);
    }

    public ServiceCostDto(ServiceCost model) {
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
}
