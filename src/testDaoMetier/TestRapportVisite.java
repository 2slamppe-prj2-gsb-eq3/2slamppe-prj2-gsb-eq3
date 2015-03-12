/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDaoMetier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import modele.metier.Praticien;
import modele.metier.RapportVisite;
import modele.metier.TypePraticien;

/**
 *
 * @author btssio
 */
public class TestRapportVisite {
    public static void main(String[] args) throws ParseException {
        //Test n°1: instanciation et accesseurs
        System.out.println("\nTest n°1: instanciation et accesseurs");
        TypePraticien unTypePra = new TypePraticien("CC", "test coucou", "local ");        
        Praticien unPra = new Praticien(150, "noulet", "sylvain", "adresse", "cp", "ville", Float.parseFloat("45.2"), unTypePra);
        RapportVisite unRapportVisite = new RapportVisite ("sdf8s", 1, unPra, null, null, null);        
        
        System.out.println("Offre : " + unRapportVisite);
       
        // Test n°2 : mutateurs
        System.out.println("\nTest n°2 : mutateurs");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        TypePraticien unTypePraBis = new TypePraticien("bloup", "test ", "international ");        
        Praticien unPraBis = new Praticien(25, "drapeau", "bill", "adresse", "cp", "ville", Float.parseFloat("45.2"), unTypePraBis);
        RapportVisite unRapportVisiteBis = new RapportVisite();
        unRapportVisiteBis.setVis_matricule("sw125");
        unRapportVisiteBis.setRap_num(3);
        unRapportVisiteBis.setPra_num(unPraBis);
        unRapportVisiteBis.setRap_date(sdf.parse("20/11/2012"));
        unRapportVisiteBis.setRap_bilan("c'était cool mais pas trop non plus");
        unRapportVisiteBis.setRap_motif("plus de médoc");        
        
        System.out.println("offre modifiée : " + unRapportVisiteBis);
    }
}
