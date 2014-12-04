
package controleur;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
//import modele.dao.*;
//import modele.metier.*;
import vues.VueVisiteurs;


/**
 *
 * @author btssio
 */
public class CtrlVisiteur extends CtrlAbstrait {

    public CtrlVisiteur(CtrlPrincipal l) {
        super(l);
        vue = new  VueVisiteurs(this);
        
    }

    

    
}