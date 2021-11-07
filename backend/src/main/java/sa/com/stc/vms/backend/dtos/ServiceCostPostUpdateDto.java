package sa.com.stc.vms.backend.dtos;


import java.util.UUID;

public class ServiceCostPostUpdateDto {

    private String nameAr;
    private String nameEn;
    private UUID serviceTypeLookupId;

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
}
