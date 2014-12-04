package controleur;

import javax.swing.JOptionPane;
import vues.menu;

/**
 * Contrôleur de la fenêtre VueMenu
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */

public class CtrlMenu extends CtrlAbstrait {

    public CtrlMenu(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new menu(this);
    }
    
    
    @Override
    public menu getVue() {
        return (menu) vue;
    }
}
