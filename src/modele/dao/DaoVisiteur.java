/*
 * DaoVisiteur
 * @author nbourgeois
 * @version 08/11/2014
 */
package modele.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import modele.metier.Visiteur;

public class DaoVisiteur {
    
    /**
     * 
     * @param em 
     * @param id
     * @return 
     */
    public static Visiteur selectOne(EntityManager em, String matricule) throws PersistenceException {
        Visiteur unVisiteur = null;
        unVisiteur = em.find(Visiteur.class, matricule);
        return unVisiteur;
    }

    public static List<Visiteur> selectAll(EntityManager em) throws PersistenceException  {
        List<Visiteur> lesVisiteurs;
        Query query= em.createQuery("select v from Visiteur v");
        lesVisiteurs = query.getResultList();
        return lesVisiteurs;
    }

   

}