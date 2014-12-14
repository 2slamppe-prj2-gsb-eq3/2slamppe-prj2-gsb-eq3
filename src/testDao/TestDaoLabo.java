/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modele.dao.DaoLabo;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Labo;

/**
 *
 * @author btssio
 */
public class TestDaoLabo {

    public static void main(String[] args) {
        EntityManager em;
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();

        //Test de selectAll
        System.out.println("Test de selectAll : \n");
        List<Labo> lesLabos = new ArrayList<Labo>();
        lesLabos = DaoLabo.selectAll(em);
        System.out.println("Les labos sont : ");
        for (int i = 0; i < lesLabos.size(); i++) {
            System.out.println(lesLabos.get(i));
        }

        //Test de selectOne
        System.out.println("\nTest du selectOne : \n");
        Labo unLabo;
        String lab_code = "BC";
        unLabo = DaoLabo.selectOne(em, lab_code);
        System.out.println("Le labo qui a pour lab_code : " + lab_code + " est : \n" + unLabo);
    }
}
