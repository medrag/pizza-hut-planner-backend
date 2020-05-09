package fr.ph.planner.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "employes")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private Long id;
    @Column(name = "emp_nom_complet")
    private String nomComplet;
    @Column(name = "emp_date_naissance")
    private Date dateNaissance;
    @Column(name = "emp_date_entree")
    private Date dateEntree;
    @Column(name = "emp_adresse")
    private String adresse;
    @Column(name = "emp_tel")
    private String tel;
    @Column(name = "emp_mail")
    private String mail;
    @Column(name = "emp_contrat")
    private int contrat;
    @Column(name = "emp_poste")
    private String poste;
    @ManyToOne()
    @JoinColumn(name = "mag_id")
    private Magasin magasin;
}
