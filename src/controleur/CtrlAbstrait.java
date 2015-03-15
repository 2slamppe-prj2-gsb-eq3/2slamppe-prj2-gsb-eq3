package controleur;

import vues.VueAbstraite;

/**
 * CtrlAbstrait modèle de contrôleur de base chaque contrôleur possède : - une
 * vue - une liaison vers le contrôleur principal
 * @author BaptisteDixneuf
 * @version 22 novembre 2013
 */
public abstract class CtrlAbstrait {

    protected VueAbstraite vue = null;
    protected CtrlPrincipal ctrlPrincipal = null;

    /**
     * 
     * @param ctrlPrincipal 
     */
    protected CtrlAbstrait(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }

    public VueAbstraite getVue() {
        return vue;
    }

    public void setVue(VueAbstraite vue) {
        this.vue = vue;
    }

    public CtrlPrincipal getCtrlPrincipal() {
        return (CtrlPrincipal) ctrlPrincipal;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }

}
