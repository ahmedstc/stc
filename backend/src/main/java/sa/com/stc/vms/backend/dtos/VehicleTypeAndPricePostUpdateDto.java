package sa.com.stc.vms.backend.dtos;

import sa.com.stc.configurationdefinition.dtos.ArabicEnglishLookup;
import sa.com.stc.vms.backend.models.VehicleRequest;

import java.util.UUID;

public class VehicleTypeAndPricePostUpdateDto {

    private UUID vehicleTypeLookupId;
    private UUID priceSegmentLookupId;
    private UUID priceStatusLookupId;
    private Integer dailyRentForPriceSegment;
    private Boolean isSuggested;
    private Boolean isActual;
    private VehicleRequest vehicleRequest;

    public UUID getVehicleTypeLookupId() {
        return vehicleTypeLookupId;
    }

    public void setVehicleTypeLookupId(UUID vehicleTypeLookupId) {
        this.vehicleTypeLookupId = vehicleTypeLookupId;
    }

    public UUID getPriceSegmentLookupId() {
        return priceSegmentLookupId;
    }

    public void setPriceSegmentLookupId(UUID priceSegmentLookupId) {
        this.priceSegmentLookupId = priceSegmentLookupId;
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

    public VehicleRequest getVehicleRequest() {
        return vehicleRequest;
    }

    public void setVehicleRequest(VehicleRequest vehicleRequest) {
        this.vehicleRequest = vehicleRequest;
    }
}
