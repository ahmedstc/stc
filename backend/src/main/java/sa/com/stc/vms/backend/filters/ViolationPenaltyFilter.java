package sa.com.stc.vms.backend.filters;

import sa.com.stc.common.filters.BaseFilter;

import java.util.UUID;

public class ViolationPenaltyFilter extends BaseFilter {
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
