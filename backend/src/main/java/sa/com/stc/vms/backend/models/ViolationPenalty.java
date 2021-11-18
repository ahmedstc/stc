package sa.com.stc.vms.backend.models;

import org.hibernate.annotations.Type;
import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.ViolationPenaltyPostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class ViolationPenalty extends BaseModel {
    @Column
    private Integer penaltyOrder;
    @Column
    private Integer points;
    @Column
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID employeeViolationId;

    public ViolationPenalty() {
    }

    public ViolationPenalty(UUID id) {
        super(id);
    }

    public ViolationPenalty(ViolationPenaltyPostUpdateDto dto) {
        super(UUID.randomUUID());
        this.penaltyOrder = dto.getPenaltyOrder();
        this.points = dto.getPoints();
        this.employeeViolationId = dto.getEmployeeViolationId();
    }

    public Integer getPenaltyOrder() {
        return penaltyOrder;
    }

    public void setPenaltyOrder(Integer penaltyOrder) {
        this.penaltyOrder = penaltyOrder;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public UUID getEmployeeViolationId() {
        return employeeViolationId;
    }

    public void setEmployeeViolationId(UUID employeeViolationId) {
        this.employeeViolationId = employeeViolationId;
    }
}
