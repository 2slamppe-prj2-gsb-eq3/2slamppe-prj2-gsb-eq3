package controleur;

import controleur.CtrlAbstrait;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import modele.dao.DaoPraticien;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Labo;
import modele.metier.Praticien;
import modele.metier.Secteur;
import modele.metier.Visiteur;
import vues.VuePraticiens;
import vues.VueRapportsVisite;

public class CtrlPraticiens extends CtrlAbstrait {

    EntityManager em;    
    private VuePraticiens vue = new VuePraticiens(this);
    List<Praticien> lesPraticiens;
    Praticien unPraticien;

    public CtrlPraticiens(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        // Gérer la persistance
        try{
            em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        }catch(javax.persistence.PersistenceException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Lanceur Main - Erreur gestion persistance ", JOptionPane.ERROR_MESSAGE);
        }
        em.getTransaction().begin();
        lesPraticiens = DaoPraticien.selectAll(em);
        afficherListePraticiens(lesPraticiens);
    }
    
    
    /*
     * Affiche un Visteur
     */
    public void afficherPraticien() {
        //Sélectionne le visiteur
        unPraticien = (Praticien) (vue.getjComboBoxsearch().getSelectedItem());
        
        //Affichage
        /*vue.jTextFieldnom.setText(unVisiteur.getNom());
        vue.jTextFieldprenom.setText(unVisiteur.getPrenom());
        vue.jTextFieldadresse.setText(unVisiteur.getAdresse());
        vue.jTextFieldcdp.setText(unVisiteur.getCp());
        vue.jTextFieldville.setText(unVisiteur.getVille());
        Secteur secteur = unVisiteur.getSecteur();
        if (secteur != null) {
        vue.jComboBoxsecteur.setSelectedItem(secteur.getLibelle());
        } else {
        vue.jComboBoxsecteur.setSelectedItem("aucun");
        }
        Labo labo = unVisiteur.getLabo();
        if (labo != null) {
        vue.jComboBoxlabo.setSelectedItem(labo.getNom());
        } else {
        vue.jComboBoxlabo.setSelectedItem("aucun");
        }*/

    }
    
    
    /**
     * Liste des Praticiens
     *
     * @param lesPraticiens : Liste de praticiens
     */
    public void afficherListePraticiens(List<Praticien> lesPraticiens) {
        vue.getjComboBoxsearch().removeAllItems();
        for (Praticien lePraticien : lesPraticiens) {
            vue.getjComboBoxsearch().addItem(lePraticien);
        }

    }
    
    @Override
    public VuePraticiens getVue() {
        return vue;
    }

    public void setVue(VuePraticiens vue) {
        this.vue = vue;
    }
}
