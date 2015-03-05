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
    
    
    public static Praticien selectOne(EntityManager em, String pra_num) throws PersistenceException {
        Praticien  unPraticien = null;
        unPraticien = em.find(Praticien.class, pra_num);
        return unPraticien;
    }
    
     public static List<Praticien> selectAll(EntityManager em) throws PersistenceException  {
        List<Praticien> lesPraticiens;
        Query query= em.createQuery("select p from Praticien p");
        lesPraticiens = query.getResultList();
        return lesPraticiens;
    }
}
