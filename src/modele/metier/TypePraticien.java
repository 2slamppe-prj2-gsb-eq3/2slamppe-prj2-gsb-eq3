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
//classe Persistente
@Entity
@Table(name = "TYPE_PRATICIEN")
public class TypePraticien {
    
    //attribut
    @Id
    @GeneratedValue
    @Column(name = "TYP_CODE")
    private String code;
    
    @Column(name = "TYP_LIBELLE")
    private String libelle;
    
    @Column(name="TYP_LIEU")
    private String lieu;

    public TypePraticien() {
    }

    
    public TypePraticien(String code, String libelle, String lieu) {
        this.code = code;
        this.libelle = libelle;
        this.lieu = lieu;
    }

    @Override
    public String toString() {
        return "TypePraticien{" + "code=" + code + ", libelle=" + libelle + ", lieu=" + lieu + '}';
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

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
    
    
}
