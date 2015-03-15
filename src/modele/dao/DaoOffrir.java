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
import modele.metier.OffrirPK;
import modele.metier.Offrir;

/**
 *
 * @author btssio
 */
public class DaoOffrir {

    /**
     * Sélectionne une offre en fonction du visiteur matricule, du numero de
     * rapport et du nom du medicament
     *
     * @param em : EntityManager
     * @param vis_matricule String vis_matricule
     * @param rap_num int rap_num
     * @param med_depotLegal String med_depotLegal
     * @return Offrir -> Une instance d'une offre
     * @throws PersistenceException
     */
    public static Offrir selectOne(EntityManager em, String vis_matricule, int rap_num, String med_depotLegal) throws PersistenceException {
        Offrir uneOffre = null;
        OffrirPK clePk = new OffrirPK(vis_matricule, rap_num, med_depotLegal);
        uneOffre = em.find(Offrir.class, clePk);
        return uneOffre;
    }

    /**
     * Sélectionne tous les médicaments
     *
     * @param em : EntityManager
     * @return List Offrir -> Liste des ofrres
     * @throws PersistenceException
     */
    public static List<Offrir> selectAll(EntityManager em) throws PersistenceException {
        List<Offrir> lesOffres;
        Query query = em.createQuery("select p from Offrir p");
        lesOffres = query.getResultList();
        return lesOffres;
    }

}
