package controleur;

import javax.swing.JOptionPane;
import vues.VueConnexion;

/**
 * Contrôleur de la fenêtre VueMenu
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */

public class CtrlConnexion extends CtrlAbstrait {

    public CtrlConnexion(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new VueConnexion(this);
    }
    
    
    @Override
    public VueConnexion getVue() {
        return (VueConnexion) vue;
    }
}
