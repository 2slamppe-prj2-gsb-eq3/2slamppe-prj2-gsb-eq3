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

//classe persistente
@Entity
@Table(name = "LABO")
public class Labo {
    
    //attribut
    @Id
    @GeneratedValue
    @Column(name = "LAB_CODE")
    private int id; 
    @Column(name = "LAB_NOM" )    
    private String nom;    
    @Column(name = "LAB_CHEFVENTE")
    private String chefVente;
    
    //constructeur
    public Labo(int id, String nom, String chefVente) {
        this.id = id;
        this.nom = nom;
        this.chefVente = chefVente;
    }

    // Getter Setter toString
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
