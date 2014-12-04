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
public class Labo {
    private int id;
    private String nom;
    private String chefVente;

    public Labo(int id, String nom, String chefVente) {
        this.id = id;
        this.nom = nom;
        this.chefVente = chefVente;
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

    public String getChefVente() {
        return chefVente;
    }

    public void setChefVente(String chefVente) {
        this.chefVente = chefVente;
    }

    @Override
    public String toString() {
        return "Labo{" + "id=" + id + ", nom=" + nom + ", chefVente=" + chefVente + '}';
    }
    
    
}
