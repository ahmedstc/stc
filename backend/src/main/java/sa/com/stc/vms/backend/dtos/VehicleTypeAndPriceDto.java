package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.configurationdefinition.dtos.ArabicEnglishLookup;
import sa.com.stc.vms.backend.models.VehicleTypeAndPrice;

import java.util.UUID;

public class VehicleTypeAndPriceDto extends BaseModelDto {
    private UUID vehicleTypeLookupId;
    private ArabicEnglishLookup vehicleTypeLookup;
    private UUID priceSegmentLookupId;
    private ArabicEnglishLookup priceSegmentLookup;
    private UUID priceStatusLookupId;
    private ArabicEnglishLookup priceStatusLookup;
    private Integer dailyRentForPriceSegment;
    private UUID vehicleRequestId;

    public VehicleTypeAndPriceDto() {
    }

    public VehicleTypeAndPriceDto(UUID id) {
        super(id);
    }

    public VehicleTypeAndPriceDto(VehicleTypeAndPrice model) {
        super(model);
        this.vehicleTypeLookupId = model.getVehicleTypeLookupId();
        this.priceSegmentLookupId = model.getPriceSegmentLookupId();
        this.priceStatusLookupId = model.getPriceStatusLookupId();
        this.dailyRentForPriceSegment = model.getDailyRentForPriceSegment();
        this.vehicleRequestId = model.getVehicleRequestId();
    }

    public UUID getVehicleTypeLookupId() {
        return vehicleTypeLookupId;
    }

    public void setVehicleTypeLookupId(UUID vehicleTypeLookupId) {
        this.vehicleTypeLookupId = vehicleTypeLookupId;
    }

    public ArabicEnglishLookup getVehicleTypeLookup() {
        return vehicleTypeLookup;
    }

    public void setVehicleTypeLookup(ArabicEnglishLookup vehicleTypeLookup) {
        this.vehicleTypeLookup = vehicleTypeLookup;
    }

    public UUID getPriceSegmentLookupId() {
        return priceSegmentLookupId;
    }

    public void setPriceSegmentLookupId(UUID priceSegmentLookupId) {
        this.priceSegmentLookupId = priceSegmentLookupId;
    }

    public ArabicEnglishLookup getPriceSegmentLookup() {
        return priceSegmentLookup;
    }

    public void setPriceSegmentLookup(ArabicEnglishLookup priceSegmentLookup) {
        this.priceSegmentLookup = priceSegmentLookup;
    }

    public UUID getPriceStatusLookupId() {
        return priceStatusLookupId;
    }

    public void setPriceStatusLookupId(UUID priceStatusLookupId) {
        this.priceStatusLookupId = priceStatusLookupId;
    }

    public Integer getDailyRentForPriceSegment() {
        return dailyRentForPriceSegment;
    }

    public void setDailyRentForPriceSegment(Integer dailyRentForPriceSegment) {
        this.dailyRentForPriceSegment = dailyRentForPriceSegment;
    }

    public ArabicEnglishLookup getPriceStatusLookup() {
        return priceStatusLookup;
    }

    public void setPriceStatusLookup(ArabicEnglishLookup priceStatusLookup) {
        this.priceStatusLookup = priceStatusLookup;
    }

    public UUID getVehicleRequestId() {
        return vehicleRequestId;
    }

    public void setVehicleRequestId(UUID vehicleRequestId) {
        this.vehicleRequestId = vehicleRequestId;
    }
}
