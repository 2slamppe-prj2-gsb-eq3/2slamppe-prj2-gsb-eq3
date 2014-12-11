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
import modele.metier.Labo;

/**
 *
 * @author btssio
 */
public class DaoLabo {
    
    
    /**
     * 
     * @param em 
     * @param id
     * @return 
     */
    public static Labo selectOne(EntityManager em, String labCode) throws PersistenceException {
        Labo labo = null;
        labo = em.find(Labo.class, labCode);
        return labo;
    }

    public static List<Labo> selectAll(EntityManager em) throws PersistenceException  {
        List<Labo> lesLabos;
        Query query= em.createQuery("select l from Labo l");
        lesLabos = query.getResultList();
        return lesLabos;
    }
    
        
}
