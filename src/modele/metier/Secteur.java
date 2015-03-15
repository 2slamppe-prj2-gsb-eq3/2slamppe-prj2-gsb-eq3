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
    @Column(name = "SEC_CODE")
    private String code;
    @Column(name = "SEC_LIBELLE")
    private String libelle;

    public Secteur() {
    }

    //constructeur
    public Secteur(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    //toString Getter Setter
    @Override
    public String toString() {
        return "Secteur{" + "code=" + code + ", libelle=" + libelle + '}';
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
