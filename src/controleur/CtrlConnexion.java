package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modele.dao.DaoVisiteur;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Visiteur;
import vues.VueConnexion;

/**
 * Contrôleur de la fenêtre VueMenu
 *
 * @author bdixneuf
 * @version 20 novembre 2013
 */
public class CtrlConnexion extends CtrlAbstrait {

    private EntityManager em;
    private VueConnexion vue = new VueConnexion(this);
    private boolean connexion;

    public CtrlConnexion(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);

        // Gérer la persistance
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();

        //Ecouteurs Bouton ok
        vue.jButtonOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                valider();
            } 
        });
        
        vue.jTextFieldmdp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldmdpKeyPressed(evt);
            }
        });
        
        
             
       
        
        //Ecouteurs Bouton quitter
        vue.jButtonQuit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                quitter();
            }
        });

    }
    
    
    private void jTextFieldmdpKeyPressed(java.awt.event.KeyEvent evt) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                valider();
                
            }
    }

    /**
     * Valider une connexion Message D'erreur dans JOptionPane
     */
    public void valider() {

        // récupération du login et mot de passe pour vérification
        String login = vue.jTextFieldid.getText();
        String mdp = vue.jTextFieldmdp.getText();

        //vérification vers la bdd oracle en JPA
        connexion = DaoVisiteur.verifierLoginMdp(em, login, mdp);
        if (connexion) {            
            Visiteur unVisteur= DaoVisiteur.selectOneByLogin(em, login);
            ctrlPrincipal.setVisiteurConnecte(unVisteur);
            System.out.println(ctrlPrincipal.getVisiteurConnecte());
            ctrlPrincipal.action(EnumAction.AFFICHER_MENU);
           
            vue.setVisible(false);
            
        } else {
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Connexion invalide.");
        }
    }

    /**
     * Quitter
     */
    public void quitter() {        
        ctrlPrincipal.action(EnumAction.MENU_FICHIER_QUITTER);
    }

    @Override
    public VueConnexion getVue() {
        return vue;
    }

    public void setVue(VueConnexion vue) {
        this.vue = vue;
    }
}
