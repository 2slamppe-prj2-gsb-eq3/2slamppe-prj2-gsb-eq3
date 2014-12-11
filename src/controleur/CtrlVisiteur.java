
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import modele.dao.DaoLabo;
import modele.dao.DaoVisiteur;
//import modele.dao.*;
//import modele.metier.*;
import vues.VueVisiteurs;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Labo;
import modele.metier.Visiteur;

/**
 *
 * @author btssio
 */
public class CtrlVisiteur extends CtrlAbstrait {
    
     EntityManager em;
     private List<Visiteur> lesVisteurs;
     private List<Labo> lesLabos;
     private VueVisiteurs vue = new  VueVisiteurs(this);
     

    public CtrlVisiteur(CtrlPrincipal l) {
        super(l);
     //   vue = new  VueVisiteurs(this);
        
        // Gérer la persistance
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();

        
        lesVisteurs = DaoVisiteur.selectAll(em);
        System.out.println(lesVisteurs);
        
        lesLabos = DaoLabo.selectAll(em);
        System.out.println(lesLabos);
        afficherListeLabo(lesLabos);
        
    }
    
    
    /**
     * Liste des labos
     * @param lesLabos 
     */
    public void afficherListeLabo(List<Labo> lesLabos){
        vue.jComboBoxlabo.removeAllItems();
        for(int i=0; i<lesLabos.size(); i++ ){            
            vue.jComboBoxlabo.addItem(lesLabos.get(i).getNom());
        }
        
    }

    public VueVisiteurs getVue() {
        return vue;
    }

    public void setVue(VueVisiteurs vue) {
        this.vue = vue;
    }
    
    public void search(){
    
        vue.jButtonok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("coucou labi");
                
            }
        });
    }
    
    
    

    

    
}