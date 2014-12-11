
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import modele.dao.DaoLabo;
import modele.dao.DaoSecteur;
import modele.dao.DaoVisiteur;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Labo;
import modele.metier.Secteur;
import modele.metier.Visiteur;
import vues.VueVisiteurs;

/**
 *
 * @author btssio
 */
public class CtrlVisiteur extends CtrlAbstrait {
    
     EntityManager em;
     private List<Visiteur> lesVisiteurs;
     private List<Labo> lesLabos;
     private List<Secteur> lesSecteurs;
     private VueVisiteurs vue = new  VueVisiteurs(this);
     

    public CtrlVisiteur(CtrlPrincipal l) {
        super(l);
     //   vue = new  VueVisiteurs(this);
        
        // Gérer la persistance
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();
        
        
        lesVisiteurs = DaoVisiteur.selectAll(em);
        System.out.println(lesVisiteurs);
        afficherListeVisiteurs(lesVisiteurs);
        
        lesLabos = DaoLabo.selectAll(em);
        System.out.println(lesLabos);
        afficherListeLabo(lesLabos);
        
        lesSecteurs = DaoSecteur.selectAll(em);
        System.out.println(lesSecteurs);
        afficherListeSecteur(lesSecteurs);
        
    }
    public void afficherListeVisiteurs(List<Visiteur> lesVisiteurs){
        System.out.println("coucou");
        vue.jComboBoxsearch.removeAllItems();
        for(int i=0; i<lesVisiteurs.size(); i++ ){            
            vue.jComboBoxsearch.addItem(lesVisiteurs.get(i).getNom()+" "+lesVisiteurs.get(i).getPrenom());
        }
        
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
    
    public void afficherListeSecteur(List<Secteur> lesSecteurs){
        vue.jComboBoxsecteur.removeAllItems();
        for(int i=0; i<lesSecteurs.size(); i++ ){            
            vue.jComboBoxsecteur.addItem(lesSecteurs.get(i).getLibelle());
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
