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
@Table(name = "MEDICAMENT")
public class Medicament {
    
    //attribut
    @Id
    @GeneratedValue
    @Column(name = "MED_DEPOTLEGAL")
    private String depotLegal; 
    
    @Column(name = "MED_NOMCOMMERCIAL" )    
    private String nomCommercial;
    
    @Column(name = "MED_COMPOSITION" )    
    private String composition;
    
    @Column(name = "MED_EFFETS" )    
    private String effets;
    
    @Column(name = "MED_CONTREINDIC" )    
    private String contreIndic;
    
    @Column(name = "MED_PRIXECHANTILLON" )    
    private String prixEchantillon;    
    
    @OneToOne
    @JoinColumn(name ="FAM_CODE")
    private Famille famille;

    public Medicament() {
    }

    public Medicament(String depotLegal, String nomCommercial, String composition, String effets, String contreIndic, String prixEchantillon, Famille famille) {
        this.depotLegal = depotLegal;
        this.nomCommercial = nomCommercial;
        this.composition = composition;
        this.effets = effets;
        this.contreIndic = contreIndic;
        this.prixEchantillon = prixEchantillon;
        this.famille = famille;
    }

    public String getDepotLegal() {
        return depotLegal;
    }

    public void setDepotLegal(String depotLegal) {
        this.depotLegal = depotLegal;
    }

    public String getNomCommercial() {
        return nomCommercial;
    }

    public void setNomCommercial(String nomCommercial) {
        this.nomCommercial = nomCommercial;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getEffets() {
        return effets;
    }

    public void setEffets(String effets) {
        this.effets = effets;
    }

    public String getContreIndic() {
        return contreIndic;
    }

    public void setContreIndic(String contreIndic) {
        this.contreIndic = contreIndic;
    }

    public String getPrixEchantillon() {
        return prixEchantillon;
    }

    public void setPrixEchantillon(String prixEchantillon) {
        this.prixEchantillon = prixEchantillon;
    }

    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }
    
    
    
    
}
