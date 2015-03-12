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
import modele.metier.RapportVisitePk;
import modele.metier.Praticien;
import modele.metier.RapportVisite;

/**
 *
 * @author btssio
 */
public class DaoRapportVisite {
    
    public static RapportVisite selectOne(EntityManager em, String vis_matricule, int rap_num) throws PersistenceException {
        RapportVisite  unRapportVisite = null;
        RapportVisitePk clePk = new RapportVisitePk(vis_matricule, rap_num);
        
        unRapportVisite = em.find(RapportVisite.class, clePk);
//        unRapportVisite = em.createQuery("select p from RapportVisite p where p.vis_matricule = '" + vis_matricule + "'", RapportVisite.class);
        return unRapportVisite;
    }
    
     public static List<RapportVisite> selectAll(EntityManager em) throws PersistenceException  {
        List<RapportVisite> lesRapportsVisite;
        Query query= em.createQuery("select p from RapportVisite p");
        lesRapportsVisite = query.getResultList();
        return lesRapportsVisite;
    }
}
