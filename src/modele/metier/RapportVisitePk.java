/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modele.metier;

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
    
    public RapportVisitePk(String vis_matricule, int rap_num) {
    this.vis_matricule = vis_matricule;
    this.rap_num = rap_num;
  }

  public String getNom() {
    return this.vis_matricule;
  }

  public void setNom(String vis_matricule) {
    this.vis_matricule = vis_matricule;
  }

  public int getRap_num() {
    return rap_num;
  }

  public void setPrevis_matricule(String rap_num) {
    this.vis_matricule = rap_num;
  }

    @Override
  public boolean equals(Object obj) {
    boolean resultat = false;

    if (obj == this) {
      resultat = true;
    } else {
      if (!(obj instanceof RapportVisitePk)) {
        resultat = false;
      } else {
        RapportVisitePk autre = (RapportVisitePk) obj;
        if (!vis_matricule.equals(autre.vis_matricule)) {
          resultat = false;
        } else {
          if (rap_num != autre.rap_num) {
            resultat = false;
          } else {
            resultat = true;
          }
        }
      }
    }
    return resultat;
  }

    @Override
  public int hashCode() {
    return (vis_matricule + rap_num).hashCode();
  }
}
