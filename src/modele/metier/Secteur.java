/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modele.metier;

import javax.persistence.*;

/**
 *
 * @author btssio
 */

//table persistente
@Entity
@Table(name = "SECTEUR")
public class Secteur {
    
    //attribut
    @Id
    @GeneratedValue
    @Column(name ="SEC_CODE")
    private int code;
    @Column(name = "SEC_LIBELLE")
    private String libelle;

    //constructeur
    public Secteur(int code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    
    //toString Getter Setter
    @Override
    public String toString() {
        return "Secteur{" + "code=" + code + ", libelle=" + libelle + '}';
    }

    
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    
}