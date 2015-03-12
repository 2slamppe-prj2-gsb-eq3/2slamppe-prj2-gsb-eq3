/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modele.metier;

import java.util.Objects;

/**
 *
 * @author btssio
 */
public class RapportVisitePk implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    private String vis_matricule;
    private int rap_num;
    
    public RapportVisitePk(){
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

    public RapportVisitePk(String vis_matricule, int rap_num) {
        this.vis_matricule = vis_matricule;
        this.rap_num = rap_num;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.vis_matricule);
        hash = 97 * hash + this.rap_num;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RapportVisitePk other = (RapportVisitePk) obj;
        if (!Objects.equals(this.vis_matricule, other.vis_matricule)) {
            return false;
        }
        if (this.rap_num != other.rap_num) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RapportVisitePk{" + "vis_matricule=" + vis_matricule + ", rap_num=" + rap_num + '}';
    }
    
    
}
