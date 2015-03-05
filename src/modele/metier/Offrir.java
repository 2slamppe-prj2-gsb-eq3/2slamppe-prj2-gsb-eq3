/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author btssio
 */

//classe persistente
@Entity
@Table(name = "OFFRIR")
public class Offrir {
    
    //attribut
    @Id    
    @JoinColumn(name="VIS_MATRICULE")
    private Visiteur visiteur;
    @Id 
    @JoinColumn(name="RAP_NUM")
    private RapportVisite rapportVisite;
    @Id 
    @JoinColumn(name="MED_DEPOTLEGAL")
    private Medicament medicament;
        
    @Column(name="OFF_QTE")
    private String quantite;

    public Offrir(){
    }
    
    public Offrir(Visiteur visiteur, RapportVisite rapportVisite, Medicament medicament, String quantite) {
        this.visiteur = visiteur;
        this.rapportVisite = rapportVisite;
        this.medicament = medicament;
        this.quantite = quantite;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }

    public RapportVisite getRapportVisite() {
        return rapportVisite;
    }

    public void setRapportVisite(RapportVisite rapportVisite) {
        this.rapportVisite = rapportVisite;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }    
    
}
