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
import modele.metier.Famille;


/**
 *
 * @author btssio
 */
public class DaoFamille {
    
    
    public static Famille selectOne(EntityManager em, String fam_code) throws PersistenceException {
        Famille famille = null;
        famille = em.find(Famille.class, fam_code);
        return famille;
    }
    
    
    public static List<Famille> selectAll(EntityManager em) throws PersistenceException  {
        List<Famille> lesFamilles;
        Query query= em.createQuery("select f from Famille f");
        lesFamilles = query.getResultList();
        return lesFamilles;
    }
    
}
