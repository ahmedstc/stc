package sa.com.stc.vms.backend.filters;

import sa.com.stc.common.filters.BaseFilter;
import sa.com.stc.vms.backend.models.EmployeeViolation;

public class ViolationPenaltyFilter extends BaseFilter {
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
