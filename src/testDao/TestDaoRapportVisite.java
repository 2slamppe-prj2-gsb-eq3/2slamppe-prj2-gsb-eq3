/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modele.dao.DaoRapportVisite;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.RapportVisite;

/**
 *
 * @author btssio
 */
public class TestDaoRapportVisite {
     public static void main(String[] args) {
        EntityManager em;
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();
         

        //Test de selectAll
        System.out.println("Test de selectAll : \n");
        List<RapportVisite> lesRapportsVisite = new ArrayList<RapportVisite>();
        lesRapportsVisite = DaoRapportVisite.selectAll(em);
        System.out.println("Les Rapports Visite sont : ");
        for (int i = 0; i < lesRapportsVisite.size(); i++) {
            System.out.println(lesRapportsVisite.get(i));
        }

        //Test de selectOne
        System.out.println("\nTest du selectOne : \n");
        RapportVisite unRapportVisite;
        String pk = "a131";
        int cle2 = 3;
        unRapportVisite = DaoRapportVisite.selectOne(em, pk, cle2);
        System.out.println("Le  Rapport Visite qui a pour pk : " + pk + " est : \n" + unRapportVisite);
    }
}
