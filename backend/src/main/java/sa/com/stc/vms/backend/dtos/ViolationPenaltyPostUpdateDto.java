package sa.com.stc.vms.backend.dtos;

import java.util.UUID;

public class ViolationPenaltyPostUpdateDto {

    private Integer penaltyOrder;
    private Integer points;
    private UUID employeeViolationId;

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
