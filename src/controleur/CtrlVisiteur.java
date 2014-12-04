
package controleur;

import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import modele.dao.DaoVisiteur;
//import modele.dao.*;
//import modele.metier.*;
import vues.VueVisiteurs;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Visiteur;

/**
 *
 * @author btssio
 */
public class CtrlVisiteur extends CtrlAbstrait {
    
     EntityManager em;
     private List<Visiteur> lesVisteurs;

    public CtrlVisiteur(CtrlPrincipal l) {
        super(l);
        vue = new  VueVisiteurs(this);
        
        // Gérer la persistance
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();

        
        lesVisteurs = DaoVisiteur.selectAll(em);
        System.out.println(lesVisteurs);
        
    }

    

    
}