package controleur;

import javax.swing.JOptionPane;
import vues.VueMenu;

/**
 * Contrôleur de la fenêtre VueMenu
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */

public class CtrlMenu extends CtrlAbstrait {

    public CtrlMenu(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new VueMenu(this);
    }
    
    
    @Override
    public VueMenu getVue() {
        return (VueMenu) vue;
    }
    
    
    
}
