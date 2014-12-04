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
public class Visiteur {
	
	private int id;
	private String nom;
	private String adresse;
	private String ville;
        
	private Secteur secteur;
        
	private Labo labo;

    public Visiteur(int id, String nom, String adresse, String ville, Secteur secteur, Labo labo) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.ville = ville;
        this.secteur = secteur;
        this.labo = labo;
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

    @Override
    public String toString() {
        return "Visiteur{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", ville=" + ville + ", secteur=" + secteur + ", labo=" + labo + '}';
    }
        
        
	
	

}
