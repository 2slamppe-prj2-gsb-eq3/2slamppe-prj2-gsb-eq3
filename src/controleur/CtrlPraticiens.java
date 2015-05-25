package controleur;

import controleur.CtrlAbstrait;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import modele.dao.DaoPraticien;
import modele.dao.DaoTypePraticien;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Labo;
import modele.metier.Praticien;
import modele.metier.Secteur;
import modele.metier.TypePraticien;
import modele.metier.Visiteur;
import vues.VuePraticiens;
import vues.VueRapportsVisite;

public class CtrlPraticiens extends CtrlAbstrait {

    EntityManager em;    
    private VuePraticiens vue = new VuePraticiens(this);
    List<Praticien> lesPraticiens;
    List<TypePraticien> lesTypePraticiens;
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
        
        lesTypePraticiens = DaoTypePraticien.selectAll(em);
        afficherListeTypePraticiens(lesTypePraticiens);
        
        afficherPraticien();
        
        /*
         ----------------------------------------
         --- Ajout des écouteurs sur la vue
         ----------------------------------------
         */
        //Ecouteurs Bouton ok
        vue.getjButtonok().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                afficherPraticien();
            }
        });

        //Bouton fermer
        vue.getjButtonfermer().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                vue.setVisible(false);
            }
        });
    }
    
    
    /*
     * Affiche un Visteur
     */
    public void afficherPraticien() {
        //Sélectionne le visiteur
        unPraticien = (Praticien) (vue.getjComboBoxsearch().getSelectedItem());                      
        
        //Affichage
        vue.getjTextFieldnum().setText(Integer.toString(unPraticien.getId()));
        vue.getjTextFieldnom().setText(unPraticien.getNom());
        vue.getjTextFieldprenom().setText(unPraticien.getPrenom());
        vue.getjTextFieldadresse().setText(unPraticien.getAdresse());
        vue.getjTextFieldcdp().setText(unPraticien.getCp());
        vue.getjTextFieldville().setText(unPraticien.getVille());
        vue.getjTextFieldcoeff().setText(Float.toString(unPraticien.getCoef()));
        TypePraticien typePraticien = unPraticien.getTypePraticien();
        if (typePraticien != null) {
            vue.getjComboBoxlieu().setSelectedItem(typePraticien.getLibelle());
        } else {
            vue.getjComboBoxlieu().setSelectedItem("aucun");
        }

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
    
    
    /**
     * Liste des TypePraticiens
     *
     * @param lesTypePraticiens : Liste de praticiens
     */
    public void afficherListeTypePraticiens(List<TypePraticien> lesTypePraticiens) {
        vue.getjComboBoxlieu().removeAllItems();
        vue.getjComboBoxlieu().addItem("aucun");
        for (TypePraticien leTypePraticien : lesTypePraticiens) {
            vue.getjComboBoxlieu().addItem(leTypePraticien.getLibelle());
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
