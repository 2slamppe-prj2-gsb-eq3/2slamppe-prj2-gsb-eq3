/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
import javax.persistence.Table;
import static javax.persistence.TemporalType.DATE;

/**
 *
 * @author btssio
 */
//classe Persistente
@Entity
@Table(name = "RAPPORT_VISITE")
@IdClass(RapportVisitePk.class)
public class RapportVisite implements Serializable {

    //Attributs
    @Id
    private String vis_matricule;

    @Id
    private int rap_num;

    @OneToOne
    @JoinColumn(name = "PRA_NUM")
    private Praticien pra_num;

    @Temporal(TemporalType.DATE)
    @Column(name = "RAP_DATE")
    private Date rap_date;

    @Column(name = "RAP_BILAN")
    private String rap_bilan;

    @Column(name = "RAP_MOTIF")
    private String rap_motif;

    public RapportVisite() {
    }
    
    public RapportVisite(String vis_matricule, int rap_num, Praticien pra_num, Date rap_date, String rap_bilan, String rap_motif) {
        this.vis_matricule = vis_matricule;
        this.rap_num = rap_num;
        this.pra_num = pra_num;
        this.rap_date = rap_date;
        this.rap_bilan = rap_bilan;
        this.rap_motif = rap_motif;
    }
    
    public RapportVisite(String vis_matricule, Praticien pra_num, Date rap_date, String rap_bilan, String rap_motif) {
        this.vis_matricule = vis_matricule;        
        this.pra_num = pra_num;
        this.rap_date = rap_date;
        this.rap_bilan = rap_bilan;
        this.rap_motif = rap_motif;
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

    public Praticien getPra_num() {
        return pra_num;
    }

    public void setPra_num(Praticien pra_num) {
        this.pra_num = pra_num;
    }

    public Date getRap_date() {
        return rap_date;
    }

    public void setRap_date(Date rap_date) {
        this.rap_date = rap_date;
    }

    public String getRap_bilan() {
        return rap_bilan;
    }

    public void setRap_bilan(String rap_bilan) {
        this.rap_bilan = rap_bilan;
    }

    public String getRap_motif() {
        return rap_motif;
    }

    public void setRap_motif(String rap_motif) {
        this.rap_motif = rap_motif;
    }

   

    @Override
    public String toString() {
        return "RapportVisite{" + "vis_matricule=" + vis_matricule + ", rap_num=" + rap_num + ", pra_num=" + pra_num + ", rap_date=" + rap_date + ", rap_bilan=" + rap_bilan + ", rap_motif=" + rap_motif + '}';
    }

}
