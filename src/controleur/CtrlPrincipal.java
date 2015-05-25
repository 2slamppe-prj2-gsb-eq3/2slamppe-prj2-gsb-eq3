package controleur;

import static controleur.EnumAction.*;
import javax.swing.JOptionPane;
import modele.metier.Visiteur;
import vues.VueAbstraite;
import vues.VueConnexion;
import vues.VueMenu;
import vues.VuePraticiens;
import vues.VueVisiteurs;
import vues.VueRapportsVisite;

/**
 * Controleur principal (ou frontal) - un lien vers chaque contrôleur de base
 *
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */
public class CtrlPrincipal {

    private CtrlConnexion ctrlConnexion = null;
    private CtrlMenu ctrlMenu = null;
    private CtrlVisiteur ctrlVisiteur = null;
    private CtrlRapportVisite ctrlRapportVisite = null;
    private CtrlPraticiens ctrlPraticiens = null;
    VueAbstraite vueA = null;
    CtrlAbstrait ctrlA = null;
    VueConnexion vueC = new VueConnexion(ctrlA);
    Visiteur visiteurConnecte; 

    /**
     * action par défaut action au démarrage de l'application
     */
    public void action() {
        if (ctrlConnexion == null) {
            ctrlConnexion = new CtrlConnexion(this);
        }
        ctrlConnexion.getVue().setEnabled(true);
        ctrlConnexion.getVue().setVisible(true);
    }

    /**
     * Action par défaut quand on lance une vue
     *
     * @param action
     */
    public void action(EnumAction action) {
        switch (action) {
            case AFFICHER_MENU: // activation de vueMenu depuis vueConnexion
                afficherMenu();
                break;
            case VISITEUR_AFFICHER: // activation de vueVisiteurs depuis vueMenu
                afficherVisiteurs();
                break;
            case RAPPORT_AFFICHER: // activation de vueVisiteurs depuis vueMenu
                afficherRapportsVisite();
                break;
            case PRATICIEN_AFFICHER: // activation de vueVisiteurs depuis vueMenu
                afficherPraticiens();
                break;
            case MENU_FICHIER_QUITTER: // fin de l'application depuis vueMenu
                menuFichierQuitter();
                break;
        }

    }

    /**
     * Fin définitive de l'application La demande de confirmation est gérée par
     * le contrôleur spécialisé
     */
    private void menuFichierQuitter() {
        System.exit(0);
    }

    /**
     * Transition vueMenu / vuePresence
     */
    private void afficherMenu() {
        if (ctrlConnexion == null) {
            ctrlConnexion = new CtrlConnexion(this);
        }
        VueMenu vueM = new VueMenu(ctrlA);
        ctrlMenu = new CtrlMenu(this);
        
        ctrlMenu.getVue().setVisible(true);
    }

    private void afficherVisiteurs() {
        if (ctrlMenu == null) {
            VueMenu vueM = new VueMenu(ctrlA);
            ctrlMenu = new CtrlMenu(this);
        }
        if (ctrlVisiteur == null) {
            VueVisiteurs vueV = new VueVisiteurs(ctrlA);
            ctrlVisiteur = new CtrlVisiteur(this);
        } else {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlVisiteur.afficherVisiteur();
        }
        
        ctrlVisiteur.getVue().setVisible(true);
    }

    private void afficherRapportsVisite() {
        if (ctrlMenu == null) {
            VueMenu vueM = new VueMenu(ctrlA);
            ctrlMenu = new CtrlMenu(this);
        }
        if (ctrlRapportVisite == null) {
            VueRapportsVisite vueRV = new VueRapportsVisite(ctrlA);            
            ctrlRapportVisite = new CtrlRapportVisite(this);            
        } else {
            // si le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlRapportVisite.afficherRapportVisite();
        }       
        ctrlRapportVisite.getVue().setVisible(true);
    }
    
    private void afficherPraticiens() {
        if (ctrlMenu == null) {
            VueMenu vueM = new VueMenu(ctrlA);
            ctrlMenu = new CtrlMenu(this);
        }
        if (ctrlPraticiens == null) {
            VuePraticiens vueV = new VuePraticiens(ctrlA);
            ctrlPraticiens = new CtrlPraticiens(this);
        } else {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlPraticiens.afficherPraticien();
        }
        
        ctrlPraticiens.getVue().setVisible(true);
    }

    public Visiteur getVisiteurConnecte() {
        return visiteurConnecte;
    }

    public void setVisiteurConnecte(Visiteur visiteurConnecte) {
        this.visiteurConnecte = visiteurConnecte;
    }
    
    
    

}
