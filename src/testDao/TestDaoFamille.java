/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modele.dao.DaoFamille;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Famille;

/**
 *
 * @author btssio
 */
public class TestDaoFamille {
    
    public static void main(String[] args) {
        EntityManager em;
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();

        //Test de selectAll
        System.out.println("Test de selectAll : \n");
        List<Famille> lesFamilles = new ArrayList<Famille>();
        lesFamilles = DaoFamille.selectAll(em);
        System.out.println("Les familles sont : ");
        for (int i = 0; i < lesFamilles.size(); i++) {
            System.out.println(lesFamilles.get(i));
        }

        //Test de selectOne
        System.out.println("\nTest du selectOne : \n");
        Famille uneFamille;
        String fam_code = "AA";
        uneFamille = DaoFamille.selectOne(em, fam_code);
        System.out.println("La famille qui a pour fam_code : " + fam_code + " est : \n" + uneFamille);
    }
}
