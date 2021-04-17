package fr.ph.planner.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "plannings")
public class Planning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id")
    private Long id;
    @Column(name = "plan_semaine")
    private String semaine;
    @ManyToOne
    @JoinColumn(name="emp_id", nullable = false)
    private Employee employee;
}
