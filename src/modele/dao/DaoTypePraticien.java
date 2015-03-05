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
import modele.metier.TypePraticien;

/**
 *
 * @author btssio
 */
public class DaoTypePraticien {
    
    public static TypePraticien selectOne(EntityManager em, String typeCode) throws PersistenceException {
        TypePraticien unTypePra = null;
        unTypePra = em.find(TypePraticien.class, typeCode);
        return unTypePra;
    }
    
    public static List<TypePraticien> selectAll(EntityManager em) throws PersistenceException  {
        List<TypePraticien> lesTypPra;
        Query query= em.createQuery("select tp from Type_praticien tp");
        lesTypPra = query.getResultList();
        return lesTypPra;
    }
}
