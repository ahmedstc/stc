package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.vms.backend.models.EmployeeViolation;
import sa.com.stc.vms.backend.models.ViolationPenalty;

import java.util.UUID;

public class ViolationPenaltyDto extends BaseModelDto {

    private Integer penaltyOrder;
    private Integer points;
    private EmployeeViolation employeeViolation;

    public ViolationPenaltyDto() {
    }

    public ViolationPenaltyDto(UUID id) {
        super(id);
    }

    public ViolationPenaltyDto(ViolationPenalty model) {
        super(model);
        this.penaltyOrder = model.getPenaltyOrder();
        this.points = model.getPoints();
        this.employeeViolation = model.getEmployeeViolation();
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
