/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import java.util.Date;
import javax.persistence.*;
import static javax.persistence.TemporalType.DATE;

/**
 *
 * @author btssio
 */
//classe Persistente
@Entity
@Table(name = "VISITEUR")
public class Visiteur {

    //attributs
    @Id
    @GeneratedValue
    @Column(name = "VIS_MATRICULE")
    private String id;

    @Column(name = "VIS_NOM")
    private String nom;

    @Column(name = "VIS_PRENOM")
    private String prenom;

    @Column(name = "VIS_CP")
    private String cp;

    @Column(name = "VIS_ADRESSE")
    private String adresse;

    @Column(name = "VIS_VILLE")
    private String ville;

    @Temporal(DATE)
    @Column(name = "VIS_DATEEMBAUCHE")
    private java.util.Date dateDEmbauche;

    @OneToOne
    @JoinColumn(name = "SEC_CODE")
    private Secteur secteur;

    @OneToOne
    @JoinColumn(name = "LAB_CODE")
    private Labo labo;

    //constructeur
    public Visiteur() {
    }

    public Visiteur(String id, String nom, String prenom, String cp, String adresse, String ville, Date dateDEmbauche, Secteur secteur, Labo labo) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cp = cp;
        this.adresse = adresse;
        this.ville = ville;
        this.dateDEmbauche = dateDEmbauche;
        this.secteur = secteur;
        this.labo = labo;
    }

    //toString Getter Setter
    @Override
    public String toString() {
        return nom + " " + prenom;
    }

    public String toString2() {
        return "Visiteur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cp=" + cp + ", adresse=" + adresse + ", ville=" + ville + ", dateDEmbauche=" + dateDEmbauche + ", secteur=" + secteur + ", labo=" + labo + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Date getDateDEmbauche() {
        return dateDEmbauche;
    }

    public void setDateDEmbauche(Date dateDEmbauche) {
        this.dateDEmbauche = dateDEmbauche;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public Labo getLabo() {
        return labo;
    }

    public void setLabo(Labo labo) {
        this.labo = labo;
    }

}
