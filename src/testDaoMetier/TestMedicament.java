/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDaoMetier;

import modele.metier.Famille;
import modele.metier.Labo;
import modele.metier.Medicament;

/**
 *
 * @author btssio
 */
public class TestMedicament {

    public static void main(String[] args) {
        Medicament medicament = null;
        Famille famille = null;
        //Test n°1: instanciation et accesseurs
        System.out.println("\nTest n°1: instanciation et accesseurs");
        famille = new Famille("GYC", "Gyverni");
        medicament = new Medicament("TES", "TUESPORAL", "HO+CH+FG", "douleur", "Non", "3.00", famille);
        System.out.println("Etat du medicament: " + medicament);

        // Test n°2 : mutateurs
        System.out.println("\nTest n°2 : mutateurs");
        medicament.setDepotLegal("BC");
        medicament.setNomCommercial("Bichat");
        medicament.setComposition("CH");
        medicament.setEffets("DOULEUR");
        medicament.setContreIndic("OUI");
        medicament.setPrixEchantillon("5.0");
        medicament.setFamille(famille);
        System.out.println("Etat du medicament: " + medicament);
    }
}
