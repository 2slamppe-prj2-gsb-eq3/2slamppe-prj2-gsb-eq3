/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import modele.metier.Praticien;

/**
 *
 * @author btssio
 */
public class DaoPraticien {

    /**
     * Sélectionne un Praticien en fonction du praNum
     * @param em :EntityManager
     * @param praNum : int -> numero du Praticien
     * @return : Praticien -> une instance de Praticien
     * @throws PersistenceException 
     */
    public static Praticien selectOne(EntityManager em, int praNum) throws PersistenceException {
        Praticien  unPraticien = null;
        unPraticien = em.find(Praticien.class, praNum);
        return unPraticien;
    }
    /**
     * Sélectionne tous les Praticiens
     * @param em : EntityManager
     * @return : Liste de Praticien -> Une liste de Praticien
     * @throws PersistenceException 
     */
    public static List<Praticien> selectAll(EntityManager em) throws PersistenceException  {
        List<Praticien> lesPraticiens;
        Query query= em.createQuery("select p from Praticien p");
        lesPraticiens = query.getResultList();
        return lesPraticiens;
    }
}
