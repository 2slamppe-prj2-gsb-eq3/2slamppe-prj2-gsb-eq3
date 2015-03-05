/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import modele.metier.Praticien;

/**
 *
 * @author btssio
 */
public class DaoPraticien {
    /**
     * Sélectionne un labo en fonction du labCode
     * @param em :EntityManager
     * @param labCode : String -> Code du labo
     * @return : Labo -> une instance de labo
     * @throws PersistenceException 
     */
    public static Praticien selectOne(EntityManager em, int Pra_num) throws PersistenceException {
        Praticien  unPraticien = null;
        unPraticien = em.find(Praticien.class, Pra_num);
        return unPraticien;
    }
}
