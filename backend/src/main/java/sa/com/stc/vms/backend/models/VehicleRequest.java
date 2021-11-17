package sa.com.stc.vms.backend.models;

import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.VehicleRequestPostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class VehicleRequest extends BaseModel {
    @Column
    private Integer requestNumber;
    @Column
    private String requestName;
    @Column
    private String requestStatus;
    @Column(length = 30000)
    private String notes;

    public VehicleRequest() {
    }

    public VehicleRequest(UUID id) {
        super(id);
    }

    public VehicleRequest(VehicleRequestPostUpdateDto dto) {
        super(UUID.randomUUID());
        this.requestNumber = dto.getRequestNumber();
        this.requestName = dto.getRequestName();
        this.requestStatus = dto.getRequestStatus();
        this.notes = dto.getNotes();
    }

    public Integer getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(Integer requestNumber) {
        this.requestNumber = requestNumber;
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
