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
import modele.metier.Medicament;

/**
 *
 * @author btssio
 */
public class DaoMedicament {
    
    public static Medicament selectOne(EntityManager em, String FamilleCode) throws PersistenceException {
        Medicament medicament = null;
        medicament = em.find(Medicament.class, FamilleCode);
        return medicament;
    }
    
    
    public static List<Medicament> selectAll(EntityManager em) throws PersistenceException  {
        List<Medicament> lesMedicaments;
        Query query= em.createQuery("select m from Medicament m");
        lesMedicaments = query.getResultList();
        return lesMedicaments;
    }
    
}
