package sa.com.stc.vms.backend.models;

import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.ViolationPenaltyPostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class ViolationPenalty extends BaseModel {
    @Column
    private Integer penaltyOrder;
    @Column
    private Integer points;
    @ManyToOne(optional = false)
    private EmployeeViolation employeeViolation;

    public ViolationPenalty() {
    }

    public ViolationPenalty(UUID id) {
        super(id);
    }

    public ViolationPenalty(ViolationPenaltyPostUpdateDto dto) {
        super(UUID.randomUUID());
        this.penaltyOrder = dto.getPenaltyOrder();
        this.points = dto.getPoints();
        this.employeeViolation = dto.getEmployeeViolation();
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

    public EmployeeViolation getEmployeeViolation() {
        return employeeViolation;
    }

    public void setEmployeeViolation(EmployeeViolation employeeViolation) {
        this.employeeViolation = employeeViolation;
    }
}
