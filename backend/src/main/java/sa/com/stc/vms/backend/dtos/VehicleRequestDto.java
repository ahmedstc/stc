package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.vms.backend.models.VehicleRequest;

import java.util.UUID;

public class VehicleRequestDto extends BaseModelDto {
    private Integer requestNumber;
    private String requestName;
    private String requestStatus;
    private String notes;

    public VehicleRequestDto() {
    }

    public VehicleRequestDto(UUID id) {
        super(id);
    }

    public VehicleRequestDto(VehicleRequest model) {
        super(model);
        this.requestNumber = model.getRequestNumber();
        this.requestName = model.getRequestName();
        this.requestStatus = model.getRequestStatus();
        this.notes = model.getNotes();
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
