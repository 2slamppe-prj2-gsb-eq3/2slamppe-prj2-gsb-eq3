/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import java.io.Serializable;
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
public class Offrir implements Serializable {

    //attribut
    @Id
    private String vis_matricule;
    @Id
    private int rap_num;
    @Id
    private String med_depotLegal;

    @Column(name = "OFF_QTE")
    private String quantite;

    public Offrir() {
    }

    public Offrir(String vis_matricule, int rap_num, String med_depotLegal, String quantite) {
        this.vis_matricule = vis_matricule;
        this.rap_num = rap_num;
        this.med_depotLegal = med_depotLegal;
        this.quantite = quantite;
    }

    public String getVis_matricule() {
        return vis_matricule;
    }

    public void setVis_matricule(String vis_matricule) {
        this.vis_matricule = vis_matricule;
    }

    public int getRap_num() {
        return rap_num;
    }

    public void setRap_num(int rap_num) {
        this.rap_num = rap_num;
    }

    public String getMed_depotLegal() {
        return med_depotLegal;
    }

    public void setMed_depotLegal(String med_depotLegal) {
        this.med_depotLegal = med_depotLegal;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Offrir{" + "vis_matricule=" + vis_matricule + ", rap_num=" + rap_num + ", med_depotLegal=" + med_depotLegal + ", quantite=" + quantite + '}';
    }

    
}
