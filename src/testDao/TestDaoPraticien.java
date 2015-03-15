/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modele.dao.DaoPraticien;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Praticien;

/**
 *
 * @author btssio
 */
public class TestDaoPraticien {

    public static void main(String[] args) {
        EntityManager em;
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();

        //Test de selectAll
        System.out.println("Test de selectAll : \n");
        List<Praticien> lesPra = new ArrayList<Praticien>();
        lesPra = DaoPraticien.selectAll(em);
        System.out.println("Les Praticiens sont : ");
        for (int i = 0; i < lesPra.size(); i++) {
            System.out.println(lesPra.get(i));
        }

        //Test de selectOne
        System.out.println("\nTest du selectOne : \n");
        Praticien unPra;
        int numPra = 1;
        unPra = DaoPraticien.selectOne(em, numPra);
        System.out.println("Le type praticien qui a pour typeCode : " + numPra + " est : \n" + unPra);
    }
}
