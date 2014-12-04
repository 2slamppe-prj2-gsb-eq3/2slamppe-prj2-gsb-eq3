/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author btssio
 */
@Entity
@Table(name = "VISITEUR")
public class Visiteur {
    
    @Id
    @GeneratedValue
    @Column(name ="VIS_MATRICULE")
    private int id;
    @Column(name ="VIS_NOM")
    private String nom;
    @Column(name ="VIS_PRENOM")
    private String prenom;
    @Column(name ="VIS_CP")
    private String cp;
    @Column(name ="VIS_ADRESSE")
    private String adresse;
    @Column(name ="VIS_VILLE")
    private String ville;
    @Column(name ="VIS_DATEEMBAUCHE")
    private Date dateDEmbauche;
    
    @OneToOne
    private Secteur secteur;
    
    @OneToOne
    private Labo labo;

    public Visiteur(int id, String nom, String prenom, String cp, String adresse, String ville, Date dateDEmbauche, Secteur secteur, Labo labo) {
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

    @Override
    public String toString() {
        return "Visiteur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cp=" + cp + ", adresse=" + adresse + ", ville=" + ville + ", dateDEmbauche=" + dateDEmbauche + ", secteur=" + secteur + ", labo=" + labo + '}';
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

}
