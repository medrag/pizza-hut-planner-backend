package fr.ph.planner.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "periodes")
public class Periode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "per_id")
    private Long id;
    @Column(name = "per_nom")
    private String nom;
    @Column(name = "per_date_debut")
    @JsonFormat(pattern = "HH:mm")
    private Date dateDebut;
    @Column(name = "per_date_fin")
    @JsonFormat(pattern = "HH:mm")
    private Date dateFin;
}
