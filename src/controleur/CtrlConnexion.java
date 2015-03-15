package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modele.dao.DaoVisiteur;
import modele.dao.EntityManagerFactorySingleton;
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

        //Ecouteurs Bouton quitter
        vue.jButtonQuit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                quitter();
            }
        });

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
            CtrlPrincipal ctrlP = new CtrlPrincipal();
            ctrlP.action(EnumAction.AFFICHER_MENU);
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
        CtrlPrincipal ctrlP = new CtrlPrincipal();
        ctrlP.action(EnumAction.MENU_FICHIER_QUITTER);
    }

    @Override
    public VueConnexion getVue() {
        return vue;
    }

    public void setVue(VueConnexion vue) {
        this.vue = vue;
    }
}
