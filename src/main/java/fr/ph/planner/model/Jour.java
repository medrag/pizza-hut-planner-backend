package fr.ph.planner.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "jr_id")
    private List<Periode> periodes;
}
