/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDaoMetier;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modele.dao.DaoVisiteur;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Visiteur;

/**
 *
 * @author btssio
 */
public class TestDaoVisiteur {

    public static void main(String[] args) {
        EntityManager em;
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();

        //Test de selectAll
        System.out.println("Test de selectAll : \n");
        List<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();
        lesVisiteurs = DaoVisiteur.selectAll(em);
        System.out.println("Les visiteurs sont : ");
        for (int i = 0; i < lesVisiteurs.size(); i++) {
            System.out.println(lesVisiteurs.get(i).toString2());
        }
        
        //Test de selectOne
        System.out.println("\nTest du selectOne : \n");
        Visiteur unVisiteur;
        String matricule = "a131";
        unVisiteur = DaoVisiteur.selectOne(em, matricule);
        System.out.println("Le visiteur qui a pour matricule : " + matricule + " est : \n" + unVisiteur.toString2());
    }
}
