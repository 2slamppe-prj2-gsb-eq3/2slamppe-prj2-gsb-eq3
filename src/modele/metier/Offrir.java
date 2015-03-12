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
import javax.persistence.IdClass;
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
@IdClass(OffrirPK.class)
public class Offrir {
    
    //attribut
    @Id    
    private Visiteur vis_matricule;
    @Id 
    private RapportVisite rap_num;
    @Id
    private Medicament med_depotLegal;
        
    @Column(name="OFF_QTE")
    private String quantite;

    public Offrir(){
    }

    public Offrir(Visiteur vis_matricule, RapportVisite rap_num, Medicament med_depotLegal, String quantite) {
        this.vis_matricule = vis_matricule;
        this.rap_num = rap_num;
        this.med_depotLegal = med_depotLegal;
        this.quantite = quantite;
    }

    public Visiteur getVis_matricule() {
        return vis_matricule;
    }

    public void setVis_matricule(Visiteur vis_matricule) {
        this.vis_matricule = vis_matricule;
    }

    public RapportVisite getRap_num() {
        return rap_num;
    }

    public void setRap_num(RapportVisite rap_num) {
        this.rap_num = rap_num;
    }

    public Medicament getMed_depotLegal() {
        return med_depotLegal;
    }

    public void setMed_depotLegal(Medicament med_depotLegal) {
        this.med_depotLegal = med_depotLegal;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }
    
    
    
}
