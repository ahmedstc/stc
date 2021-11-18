package sa.com.stc.vms.backend.models;

import org.hibernate.annotations.Type;
import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.VehicleTypeAndPricePostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class VehicleTypeAndPrice extends BaseModel {
    @Column
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID vehicleTypeLookupId;
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID priceSegmentLookupId;
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID priceStatusLookupId;
    @Column
    private Integer dailyRentForPriceSegment;
    @Column
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID vehicleRequestId;

    public VehicleTypeAndPrice() {
    }

    public VehicleTypeAndPrice(UUID id) {
        super(id);
    }

    public VehicleTypeAndPrice(VehicleTypeAndPricePostUpdateDto dto) {
        super(UUID.randomUUID());
        this.vehicleTypeLookupId = dto.getVehicleTypeLookupId();
        this.priceSegmentLookupId = dto.getPriceSegmentLookupId();
        this.priceStatusLookupId = dto.getPriceStatusLookupId();
        this.dailyRentForPriceSegment = dto.getDailyRentForPriceSegment();
        this.vehicleRequestId = dto.getVehicleRequestId();
    }


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

    public UUID getPriceStatusLookupId() {
        return priceStatusLookupId;
    }

    public void setPriceStatusLookupId(UUID priceStatusLookupId) {
        this.priceStatusLookupId = priceStatusLookupId;
    }

    public UUID getVehicleRequestId() {
        return vehicleRequestId;
    }

    public void setVehicleRequestId(UUID vehicleRequestId) {
        this.vehicleRequestId = vehicleRequestId;
    }
}
