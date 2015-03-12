package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import modele.dao.DaoLabo;
import modele.dao.DaoSecteur;
import modele.dao.DaoVisiteur;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Labo;
import modele.metier.Secteur;
import modele.metier.Visiteur;
import vues.VueVisiteurs;

/**
 * Classe Visiteur
 * @author bdixneuf
 */
public class CtrlVisiteur extends CtrlAbstrait {

    EntityManager em;
    private List<Visiteur> lesVisiteurs;
    private Visiteur unVisiteur;
    private int indiceVisiteurCourant;
    private List<Labo> lesLabos;
    private List<Secteur> lesSecteurs;
    private VueVisiteurs vue = new VueVisiteurs(this);

    public CtrlVisiteur(CtrlPrincipal l) {
        super(l);
     
        // Gérer la persistance
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();

        // Affichage
        lesVisiteurs = DaoVisiteur.selectAll(em);
        System.out.println(lesVisiteurs);
        afficherListeVisiteurs(lesVisiteurs);

        lesLabos = DaoLabo.selectAll(em);
        System.out.println(lesLabos);
        afficherListeLabo(lesLabos);

        lesSecteurs = DaoSecteur.selectAll(em);
        System.out.println(lesSecteurs);
        afficherListeSecteur(lesSecteurs);
        
        //Initialisation du premier élément
        afficherVisiteur();

        //Ecouteurs Bouton ok
        vue.jButtonok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                afficherVisiteur();
            }
        });

        //Bouton fermer
        vue.jButtonfermer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                vue.setVisible(false);
            }
        });

        //Bouton Précédent
        vue.jButtonprec.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                indiceVisiteurCourant = vue.jComboBoxsearch.getSelectedIndex();
                indiceVisiteurCourant = indiceVisiteurCourant - 1;
                //Si arrive au début de la liste
                if (indiceVisiteurCourant<0) {
                    indiceVisiteurCourant=lesVisiteurs.size()-1;
                }
                unVisiteur = lesVisiteurs.get(indiceVisiteurCourant);
                vue.jComboBoxsearch.setSelectedItem(unVisiteur);
                afficherVisiteur();

            }
        });

        //Bouton Suivant
        vue.jButtonsuiv.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                indiceVisiteurCourant = vue.jComboBoxsearch.getSelectedIndex();
                indiceVisiteurCourant = indiceVisiteurCourant + 1;
                //Si arrive à la fin de la liste
                if (indiceVisiteurCourant>lesVisiteurs.size()-1) {
                    indiceVisiteurCourant=0;
                }
                unVisiteur = lesVisiteurs.get(indiceVisiteurCourant);
                vue.jComboBoxsearch.setSelectedItem(unVisiteur);
                afficherVisiteur();

            }
        });

    }

    /*
     * Affiche un Visteur
     */
    public void afficherVisiteur() {
        //Sélectionne le visiteur
        unVisiteur = (Visiteur) (vue.jComboBoxsearch.getSelectedItem());     
        
        //Affichage
        vue.jTextFieldnom.setText(unVisiteur.getNom());
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
        }

    }

    /**
     * Liste des Visiteurs
     * @param lesVisiteurs : Liste de visiteurs
     */
     
    public void afficherListeVisiteurs(List<Visiteur> lesVisiteurs) {
        vue.jComboBoxsearch.removeAllItems();
        for (Visiteur lesVisiteur : lesVisiteurs) {
            vue.jComboBoxsearch.addItem(lesVisiteur);
        }

    }

    /**
     * Liste des labos
     * @param lesLabos : Liste de labos
     */
    public void afficherListeLabo(List<Labo> lesLabos) {
        vue.jComboBoxlabo.removeAllItems();
        vue.jComboBoxlabo.addItem("aucun");
        for (Labo lesLabo : lesLabos) {
            vue.jComboBoxlabo.addItem(lesLabo.getNom());
        }
    }

    /**
     * Liste des secteurs
     * @param lesSecteurs : Liste de Secteurs
     */
    public void afficherListeSecteur(List<Secteur> lesSecteurs) {
        vue.jComboBoxsecteur.removeAllItems();
        vue.jComboBoxsecteur.addItem("aucun");
        for (int i = 0; i < lesSecteurs.size(); i++) {
            vue.jComboBoxsecteur.addItem(lesSecteurs.get(i).getLibelle());
        }
    }

    @Override
    public VueVisiteurs getVue() {
        return vue;
    }

    public void setVue(VueVisiteurs vue) {
        this.vue = vue;
    }

}
