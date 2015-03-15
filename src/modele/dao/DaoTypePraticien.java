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

    /**
     * Sélectionne un TypePraticien en fonction du typeCode
     *
     * @param em :EntityManager
     * @param typeCode : String -> code du TypePraticien
     * @return : TypePraticien -> une instance de TypePraticien
     * @throws PersistenceException
     */
    public static TypePraticien selectOne(EntityManager em, String typeCode) throws PersistenceException {
        TypePraticien unTypePra = null;
        unTypePra = em.find(TypePraticien.class, typeCode);
        return unTypePra;
    }

    /**
     * Sélectionne tous les TypePraticiens
     *
     * @param em : EntityManager
     * @return : Liste de TypePraticien -> Une liste de TypePraticien
     * @throws PersistenceException
     */
    public static List<TypePraticien> selectAll(EntityManager em) throws PersistenceException {
        List<TypePraticien> lesTypPra;
        Query query = em.createQuery("select tp from TypePraticien tp");
        lesTypPra = query.getResultList();
        return lesTypPra;
    }
}
