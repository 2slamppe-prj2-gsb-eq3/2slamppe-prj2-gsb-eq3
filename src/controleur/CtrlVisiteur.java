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
 *
 * @author btssio
 */
public class CtrlVisiteur extends CtrlAbstrait {

    EntityManager em;
    private List<Visiteur> lesVisiteurs;
    private Visiteur unVisiteur;
    private int visiteurCourant;
    private List<Labo> lesLabos;
    private List<Secteur> lesSecteurs;
    private VueVisiteurs vue = new VueVisiteurs(this);

    public CtrlVisiteur(CtrlPrincipal l) {
        super(l);
     //   vue = new  VueVisiteurs(this);

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

        //Ecouteurs Bouton ok
        vue.jButtonok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                afficherVisteur();
            }
        });

        //Bouton fermer
        vue.jButtonfermer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        //Bouton Précédent
        vue.jButtonprec.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                visiteurCourant = vue.jComboBoxsearch.getSelectedIndex();
                visiteurCourant=visiteurCourant-1;
                unVisiteur=lesVisiteurs.get(visiteurCourant);
                vue.jComboBoxsearch.setSelectedItem(unVisiteur);
                afficherVisteur();
                
            }
        });
        
        //Bouton Suivant
        vue.jButtonsuiv.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                visiteurCourant = vue.jComboBoxsearch.getSelectedIndex();
                visiteurCourant=visiteurCourant+1;
                unVisiteur=lesVisiteurs.get(visiteurCourant);
                vue.jComboBoxsearch.setSelectedItem(unVisiteur);
                afficherVisteur();
                
            }
        });

    }
    
    public void afficherVisteur(){
        unVisiteur = (Visiteur) (vue.jComboBoxsearch.getSelectedItem());
                System.out.println(unVisiteur.getId());
                unVisiteur = DaoVisiteur.selectOne(em, unVisiteur.getId());
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

    public void afficherListeVisiteurs(List<Visiteur> lesVisiteurs) {
        vue.jComboBoxsearch.removeAllItems();
        for (int i = 0; i < lesVisiteurs.size(); i++) {
            vue.jComboBoxsearch.addItem(lesVisiteurs.get(i));
        }

    }

    /**
     * Liste des labos
     *
     * @param lesLabos
     */
    public void afficherListeLabo(List<Labo> lesLabos) {
        vue.jComboBoxlabo.removeAllItems();
        vue.jComboBoxlabo.addItem("aucun");
        for (int i = 0; i < lesLabos.size(); i++) {
            vue.jComboBoxlabo.addItem(lesLabos.get(i).getNom());
        }
    }

    public void afficherListeSecteur(List<Secteur> lesSecteurs) {
        vue.jComboBoxsecteur.removeAllItems();
        vue.jComboBoxsecteur.addItem("aucun");
        for (int i = 0; i < lesSecteurs.size(); i++) {
            vue.jComboBoxsecteur.addItem(lesSecteurs.get(i).getLibelle());
        }
    }

    public VueVisiteurs getVue() {
        return vue;
    }

    public void setVue(VueVisiteurs vue) {
        this.vue = vue;
    }

}
