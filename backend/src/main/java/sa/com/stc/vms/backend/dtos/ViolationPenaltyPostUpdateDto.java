package sa.com.stc.vms.backend.dtos;

import sa.com.stc.vms.backend.models.EmployeeViolation;

public class ViolationPenaltyPostUpdateDto {

    private Integer penaltyOrder;
    private Integer points;
    private EmployeeViolation employeeViolation;

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
