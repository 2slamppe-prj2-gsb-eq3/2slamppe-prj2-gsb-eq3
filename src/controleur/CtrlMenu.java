package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modele.dao.EntityManagerFactorySingleton;
import vues.VueConnexion;
import vues.VueMenu;

/**
 * Contrôleur de la fenêtre VueMenu
 *
 * @author bdixneuf
 * @version 20 novembre 2013
 */
public class CtrlMenu extends CtrlAbstrait {

    private EntityManager em;
    private VueMenu vue = new VueMenu(this);

    /**
     * Controleur principale CtrlMenu
     *
     * @param ctrlPrincipal
     */
    public CtrlMenu(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);

        // Gérer la persistance
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();

        //Ecouteurs Bouton Comptes-Rendues
        vue.jButtonComptesRendus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                afficherRapportVisite();
            }
        });

        //Ecouteurs Bouton Visiteurs
        vue.jButtonVisteurs.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                afficherVisiteur();
            }
        });

        //Ecouteurs Bouton Praticiens
        vue.jButtonPraticiens.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                JOptionPane.showMessageDialog(frame, "Fonctionnalité Praticiens - Bientôt.");
            }
        });

        //Ecouteurs Bouton Medicaments
        vue.jButtonMedicaments.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                JOptionPane.showMessageDialog(frame, "Fonctionnalité Medicaments - Bientôt.");
            }
        });

        //Ecouteurs Bouton Quitter
        vue.jButtonQuitter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                quitter();
            }
        });
    }

    /**
     * Ouvre la fenetre de gestion des Visiteurs
     */
    public void afficherVisiteur() {
        CtrlPrincipal ctrlP = new CtrlPrincipal();
        ctrlP.action(EnumAction.VISITEUR_AFFICHER);
    }

    public void afficherRapportVisite() {
        CtrlPrincipal ctrlP = new CtrlPrincipal();
        ctrlP.action(EnumAction.RAPPORT_AFFICHER);
    }

    /**
     * Quitter l'application
     */
    public void quitter() {
        System.exit(0);
    }

    public VueMenu getVue() {
        return vue;
    }

    public void setVue(VueMenu vue) {
        this.vue = vue;
    }

}
