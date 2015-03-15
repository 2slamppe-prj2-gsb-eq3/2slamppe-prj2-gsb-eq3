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
//classe Persistente
@Entity
@Table(name = "PRATICIEN")
public class Praticien {

    //attribut
    @Id
    @GeneratedValue
    @Column(name = "PRA_NUM")
    private int id;
    @Column(name = "PRA_NOM")
    private String nom;
    @Column(name = "PRA_PRENOM")
    private String prenom;
    @Column(name = "PRA_ADRESSE")
    private String adresse;
    @Column(name = "PRA_CP")
    private String cp;
    @Column(name = "PRA_VILLE")
    private String ville;
    @Column(name = "PRA_COEFNOTORIETE")
    private float coef;

    @OneToOne
    @JoinColumn(name = "TYP_CODE")
    private TypePraticien typePraticien;

    public Praticien() {
    }

    public Praticien(int id, String nom, String prenom, String adresse, String cp, String ville, float coef, TypePraticien typePraticien) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.coef = coef;
        this.typePraticien = typePraticien;
    }

    @Override
    public String toString() {
        return "Praticien{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", cp=" + cp + ", ville=" + ville + ", coef=" + coef + ", typePraticien=" + typePraticien + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public float getCoef() {
        return coef;
    }

    public void setCoef(float coef) {
        this.coef = coef;
    }

    public TypePraticien getTypePraticien() {
        return typePraticien;
    }

    public void setTypePraticien(TypePraticien typePraticien) {
        this.typePraticien = typePraticien;
    }

}
