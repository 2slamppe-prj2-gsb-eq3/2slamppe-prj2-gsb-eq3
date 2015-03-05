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
import javax.persistence.Table;

/**
 *
 * @author btssio
 */
//classe persistente
@Entity
@Table(name = "FAMILLE")
public class Famille {
    
    //attribut
    @Id
    @GeneratedValue
    @Column(name = "FAM_CODE")
    private String code; 
    
    @Column(name = "FAM_LIBELLE" )    
    private String libelle;    

    public Famille() {
    }

    public Famille(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }  
}
