package sa.com.stc.vms.backend.filters;

import sa.com.stc.common.filters.BaseFilter;
import sa.com.stc.vms.backend.models.VehicleRequest;

import java.util.UUID;

public class VehicleTypeAndPriceFilter extends BaseFilter {
    private UUID vehicleTypeLookupId;
    private UUID priceSegmentLookupId;
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

    public VehicleRequest getVehicleRequest() {
        return vehicleRequest;
    }

    public void setVehicleRequest(VehicleRequest vehicleRequest) {
        this.vehicleRequest = vehicleRequest;
    }
}
