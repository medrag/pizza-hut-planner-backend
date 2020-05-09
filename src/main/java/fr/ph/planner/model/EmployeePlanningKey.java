package fr.ph.planner.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class EmployeePlanningKey implements Serializable {
    @Column(name = "emp_id")
    private Long employeeId;
    @Column(name = "plan_id")
    private Long planningId;
}
