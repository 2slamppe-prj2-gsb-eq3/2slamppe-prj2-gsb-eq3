package controleur;

import static controleur.EnumAction.*;
import javax.swing.JOptionPane;


/**
 * Controleur principal (ou frontal) - un lien vers chaque contrôleur de base
 *
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */
public class CtrlPrincipal {

    
    
    private CtrlConnexion ctrlConnexion = null;
    private CtrlVisiteur ctrlVisteur = null;

    /**
     * action par défaut action au démarrage de l'application
     */
   /* public void action() {
        if (ctrlConnexion == null) {
            ctrlConnexion = new CtrlConnexion(this);
        }
        ctrlConnexion.getVue().setEnabled(true);
        ctrlConnexion.getVue().setVisible(true);
    }

    public void action(EnumAction action) {        

    }*/

    /**
     * action par défaut action au démarrage de l'application
     */
     public void action() {
        if (ctrlVisteur == null) {
            ctrlVisteur = new CtrlVisiteur(this);
        }
        ctrlVisteur.getVue().setEnabled(true);
        ctrlVisteur.getVue().setVisible(true);
    }
    

   
}

