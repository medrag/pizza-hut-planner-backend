package fr.ph.planner.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "jours")
public class Jour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jr_id")
    private Long id;
    @Column(name = "jr_nom")
    private String nom;
    @Column(name = "jr_date")
    private Date date;
    @ManyToOne
    @JoinColumn(name = "plan_id", nullable = false)
    private Planning planning;
}
