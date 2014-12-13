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
import modele.metier.Secteur;

/**
 *
 * @author btssio
 */
public class DaoSecteur {
    
    /**
     * Sélectionne un secteur en fonction du sec_code
     * @param em : EntityManager
     * @param sec_code : String -> Idenfiant du secteur
     * @return : Secteur -> Une instance de secteur
     * @throws PersistenceException 
     */
    public static Secteur selectOne(EntityManager em, String sec_code) throws PersistenceException {
        Secteur unSecteur = null;
        unSecteur = em.find(Secteur.class, sec_code);
        return unSecteur;
    }
    
    /**
     * Sélectionne tous les labos
     * @param em : EntityManager
     * @return : Liste de Secteur -> Une liste de secteur
     * @throws PersistenceException 
     */
    public static List<Secteur> selectAll(EntityManager em) throws PersistenceException  {
        List<Secteur> lesSecteurs;
        Query query= em.createQuery("select s from Secteur s");
        lesSecteurs = query.getResultList();
        return lesSecteurs;
    }

}
