/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDaoMetier;

import modele.metier.Praticien;
import modele.metier.TypePraticien;

/**
 *
 * @author btssio
 */
public class TestPraticien {
     public static void main(String[] args) {
        Praticien unPraticien=null;
        TypePraticien unTypePra=null;
        //Test n°1: instanciation et accesseurs
        System.out.println("\nTest n°1: instanciation et accesseurs");
        unTypePra = new TypePraticien("CC", "test coucou", "local ");
        unPraticien = new Praticien("87", "Dixneuf", "Baptiste", "21 rue des tulipiers", "44330", "Vallet", 496.1f, unTypePra);
        System.out.println("Etat du Praticien: " + unPraticien);
        
        // Test n°2 : mutateurs
        System.out.println("\nTest n°2 : mutateurs");
        unPraticien.setId("88");
        unPraticien.setNom("DUPONT");
        unPraticien.setPrenom("Jean");
        unPraticien.setAdresse("1 rue des chenes");
        unPraticien.setCp("88000");
        unPraticien.setVille("NANTES");
        unPraticien.setCoef(496.2f);
        unPraticien.setTypePraticien(unTypePra);        
       
        System.out.println("Etat du Praticien : " + unPraticien);
    }
}
