/*
 * DaoVisiteur
 * @author nbourgeois
 * @version 08/11/2014
 */
package modele.dao;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import modele.metier.Visiteur;

public class DaoVisiteur {

    /**
     * selectOne : lire un enregistrement dans la table Visiteur
     *
     * @param em : contexte de persistance
     * @param matricule : identifiant technique
     * @return une instance de la classe Visiteur
     */
    public static Visiteur selectOne(EntityManager em, String matricule) throws PersistenceException {
        Visiteur unVisiteur = null;
        unVisiteur = em.find(Visiteur.class, matricule);
        return unVisiteur;
    }

    /**
     * selectOneL : lire un enregistrement dans la table Visiteur
     *
     * @param em : contexte de persistance
     * @param login : nom du visiteur
     * @return une instance de la classe Visiteur
     */
    public static Visiteur selectOneByLogin(EntityManager em, String login) throws PersistenceException {
        Visiteur visiteur = null;

        try {
            Query query = em.createQuery("select v from Visiteur v where v.nom = :login");
            query.setParameter("login", login);
            return (Visiteur) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }

    }

    /**
     * lire tous les enregistrements de la table Visiteur
     *
     * @param em : contexte de persistance
     * @return une collection d'instances de la classe visiteur
     */
    public static List<Visiteur> selectAll(EntityManager em) throws PersistenceException {
        List<Visiteur> lesVisiteurs;
        Query query = em.createQuery("select v from Visiteur v");
        lesVisiteurs = query.getResultList();
        return lesVisiteurs;
    }

    /**
     * Vérifier le login d'un Visiteur
     *
     * @param em : contexte de persistance
     * @param login: nom du visiteur
     * @param mdp: date d'embauche avec format JJ-MMM-AA
     * @return une valeur boolean
     */
    public static boolean verifierLoginMdp(EntityManager em, String login, String mdp) throws PersistenceException {
        boolean ok = false;
        String dateEmbauche=null;
        Visiteur unVisiteur = selectOneByLogin(em, login);

        if (unVisiteur != null) {
            Format formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            dateEmbauche = formatter.format(unVisiteur.getDateDEmbauche());
        }

        if (dateEmbauche!=null && dateEmbauche.toLowerCase().equals(mdp)) {
            ok = true;
        }

        return ok;
    }

}
