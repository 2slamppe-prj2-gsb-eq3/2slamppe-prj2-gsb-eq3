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
        List<Praticien> lesPraticiens = new ArrayList<Praticien>();
        lesPraticiens = DaoPraticien.selectAll(em);
        System.out.println("Les praticiens sont : ");
        for (int i = 0; i < lesPraticiens.size(); i++) {
            System.out.println(lesPraticiens.get(i));
        }

        //Test de selectOne
        System.out.println("\nTest du selectOne : \n");
        Praticien unPraticien;
        String id = "1";
        unPraticien = DaoPraticien.selectOne(em, id);
        System.out.println("Le  praticien qui a pour pra_code : " + id + " est : \n" + unPraticien);
    }
}
