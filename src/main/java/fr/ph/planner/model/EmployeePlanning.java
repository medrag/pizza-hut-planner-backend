package fr.ph.planner.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employes_plannings")
public class EmployeePlanning {

    @EmbeddedId
    private EmployeePlanningKey id;

    @ManyToOne
    @MapsId("emp_id")
    @JoinColumn(name = "emp_id")
    private Employee employee;

    @ManyToOne
    @MapsId("plan_id")
    @JoinColumn(name = "plan_id")
    private Planning planning;
}
