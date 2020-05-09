package fr.ph.planner.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "magasins")
public class Magasin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mag_id")
    private Long id;
    @Column(name = "mag_nom")
    private String nom;
    @Column(name = "mag_adresse")
    private String adresse;
    @Column(name = "mag_entreprise")
    private String entreprise;
    @Column(name = "mag_tel")
    private String tel;
}
