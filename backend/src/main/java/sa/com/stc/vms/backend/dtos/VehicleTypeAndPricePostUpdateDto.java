package sa.com.stc.vms.backend.dtos;

import java.util.UUID;

public class VehicleTypeAndPricePostUpdateDto {

    private UUID vehicleTypeLookupId;
    private UUID priceSegmentLookupId;
    private UUID priceStatusLookupId;
    private Integer dailyRentForPriceSegment;
    private Boolean isSuggested;
    private Boolean isActual;
    private UUID vehicleRequestId;

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

    public Boolean getSuggested() {
        return isSuggested;
    }

    public void setSuggested(Boolean suggested) {
        isSuggested = suggested;
    }

    public Boolean getActual() {
        return isActual;
    }

    public void setActual(Boolean actual) {
        isActual = actual;
    }

    public UUID getVehicleRequestId() {
        return vehicleRequestId;
    }

    public void setVehicleRequestId(UUID vehicleRequestId) {
        this.vehicleRequestId = vehicleRequestId;
    }
}
