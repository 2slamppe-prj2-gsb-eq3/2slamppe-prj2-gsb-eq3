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
     * Sélectionne un labo en fonction du labCode
     * @param em :EntityManager
     * @param labCode : String -> Code du labo
     * @return : Labo -> une instance de labo
     * @throws PersistenceException 
     */
    public static Labo selectOne(EntityManager em, String labCode) throws PersistenceException {
        Labo labo = null;
        labo = em.find(Labo.class, labCode);
        return labo;
    }
    /**
     * 
     * @param em :EntityManager
     * @return : List Labo -> Liste de labo
     * @throws PersistenceException 
     */
    public static List<Labo> selectAll(EntityManager em) throws PersistenceException  {
        List<Labo> lesLabos;
        Query query= em.createQuery("select l from Labo l");
        lesLabos = query.getResultList();
        return lesLabos;
    }
    
        
}
