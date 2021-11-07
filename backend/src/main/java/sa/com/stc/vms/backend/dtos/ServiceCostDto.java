package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.configurationdefinition.dtos.ArabicEnglishLookup;
import sa.com.stc.vms.backend.models.ServiceCost;

import java.util.UUID;

public class ServiceCostDto extends BaseModelDto {
    private String nameAr;
    private String nameEn;
    private UUID serviceTypeLookupId;
    private ArabicEnglishLookup serviceTypeLookup;

    public ServiceCostDto() {
    }

    public ServiceCostDto(UUID id) {
        super(id);
    }

    public ServiceCostDto(ServiceCost model) {
        super(model);
        this.nameAr = model.getNameAr();
        this.nameEn = model.getNameEn();
        this.serviceTypeLookupId = model.getServiceTypeLookupId();
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

    public UUID getServiceTypeLookupId() {
        return serviceTypeLookupId;
    }

    public void setServiceTypeLookupId(UUID serviceTypeLookupId) {
        this.serviceTypeLookupId = serviceTypeLookupId;
    }

    public ArabicEnglishLookup getServiceTypeLookup() {
        return serviceTypeLookup;
    }

    public void setServiceTypeLookup(ArabicEnglishLookup serviceTypeLookup) {
        this.serviceTypeLookup = serviceTypeLookup;
    }
}
