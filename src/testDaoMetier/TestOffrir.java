/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDaoMetier;

import modele.metier.Offrir;

/**
 *
 * @author btssio
 */
public class TestOffrir {

    public static void main(String[] args) {
        //Test n°1: instanciation et accesseurs
        System.out.println("\nTest n°1: instanciation et accesseurs");
        Offrir uneOffre = new Offrir("CC", 4, "test coucou", 0);
        uneOffre = new Offrir("zzz", 11, "3MYC7", 85);
        System.out.println("Offre : " + uneOffre);

        // Test n°2 : mutateurs
        System.out.println("\nTest n°2 : mutateurs");
        uneOffre.setVis_matricule("sw125");
        uneOffre.setRap_num(3);
        uneOffre.setMed_depotLegal("Emile");
        uneOffre.setQuantite(3);
        Offrir uneOffreBis = new Offrir("a117", 2, "ftuy54", 6);
        System.out.println("offre modifiée : " + uneOffreBis);
    }
}
