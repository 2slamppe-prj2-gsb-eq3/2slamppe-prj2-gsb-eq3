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
import modele.metier.Offrir;


/**
 *
 * @author btssio
 */
public class DaoOffrir {
    
    
    
    public static Offrir selectOne(EntityManager em, int praNum) throws PersistenceException {
        Offrir  uneOffre = null;
        uneOffre = em.find(Offrir.class, praNum);
        return uneOffre;
    }
    
    
    public static List<Offrir> selectAll(EntityManager em) throws PersistenceException  {
        List<Offrir> lesOffres;
        Query query= em.createQuery("select p from Offre p");
        lesOffres = query.getResultList();
        return lesOffres;
    }
    
   
}
