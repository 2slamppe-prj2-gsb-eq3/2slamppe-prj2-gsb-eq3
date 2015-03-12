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
public class OffrirPK implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    private String vis_matricule;
    private String rap_num;
    private String med_depotLegal;

    public OffrirPK() {
    }

    public OffrirPK(String vis_matricule, String rap_num, String med_depotLegal) {
        this.vis_matricule = vis_matricule;
        this.rap_num = rap_num;
        this.med_depotLegal = med_depotLegal;
    }
    
    public String getVis_matricule() {
        return vis_matricule;
    }

    public void setVis_matricule(String vis_matricule) {
        this.vis_matricule = vis_matricule;
    }

    public String getRap_num() {
        return rap_num;
    }

    public void setRap_num(String rap_num) {
        this.rap_num = rap_num;
    }

    public String getMed_depotLegal() {
        return med_depotLegal;
    }

    public void setMed_depotLegal(String med_depotLegal) {
        this.med_depotLegal = med_depotLegal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.vis_matricule);
        hash = 89 * hash + Objects.hashCode(this.rap_num);
        hash = 89 * hash + Objects.hashCode(this.med_depotLegal);
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
        final OffrirPK other = (OffrirPK) obj;
        if (!Objects.equals(this.vis_matricule, other.vis_matricule)) {
            return false;
        }
        if (!Objects.equals(this.rap_num, other.rap_num)) {
            return false;
        }
        if (!Objects.equals(this.med_depotLegal, other.med_depotLegal)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
