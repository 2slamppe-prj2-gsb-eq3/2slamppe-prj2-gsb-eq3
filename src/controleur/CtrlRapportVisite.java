/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modele.dao.DaoMedicament;
import modele.dao.DaoOffrir;
import modele.dao.DaoPraticien;
import modele.dao.DaoRapportVisite;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Medicament;
import modele.metier.Offrir;
import modele.metier.Praticien;
import modele.metier.RapportVisite;
import vues.VueRapportsVisite;

/**
 *
 * @author btssio
 */
public class CtrlRapportVisite extends CtrlAbstrait {

    EntityManager em;
    private VueRapportsVisite vue = new VueRapportsVisite(this);
    private int indiceRapportVisiteCourant = 0;
    private List<Praticien> lesPraticiens;
    private List<RapportVisite> lesRapportsVisite;
    private List<Medicament> lesMedicaments;
    private List<Offrir> lesOffres;

    public CtrlRapportVisite(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);

        // Gérer la persistance
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();
        chargementDonnees();               
        em.getTransaction().commit();

        /*
         ----------------------------------------
         --- Ajout des écouteurs sur la vue
         ----------------------------------------
         */
        //Bouton Précédent
        vue.getjButtonprec().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                indiceRapportVisiteCourant = indiceRapportVisiteCourant - 1;
                //Si arrive au début de la liste
                if (indiceRapportVisiteCourant < 0) {
                    indiceRapportVisiteCourant = lesRapportsVisite.size() - 1;
                }
                afficherRapportVisite();

            }

        });

        //Bouton Suivant
        vue.getjButtonSuiv().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                indiceRapportVisiteCourant = indiceRapportVisiteCourant + 1;
                //Si arrive à la fin de la liste
                if (indiceRapportVisiteCourant > lesRapportsVisite.size() - 1) {
                    indiceRapportVisiteCourant = 0;
                }
                afficherRapportVisite();

            }
        });

        //Bouton Nouveau
        vue.getjButtonNouv().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nouveau();
            }

        });

        //Bouton sauvegarder
        vue.getjButtonSauvegarder().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                enregistrer();
            }

        });

        //Bouton fermer
        vue.getjButtonFermer().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                vue.setVisible(false);
            }
        });

    }
    
    public void chargementDonnees(){
        /*
         ----------------------------------------
         --- On récupềre les données pour Initialiser la vue
         ----------------------------------------
         */
        //Afficher les praticens
        lesPraticiens = DaoPraticien.selectAll(em);
        afficherListePraticien(lesPraticiens);

        //On récupère tous les rapports de visite
        lesRapportsVisite = DaoRapportVisite.selectAll(em);

        //On récupère tous les medicaments
        lesMedicaments = DaoMedicament.selectAll(em);

        //On récupère toutes les offres
        lesOffres = DaoOffrir.selectAll(em);

        //Initialisation du premier élément
        afficherRapportVisite(); 
    }

    /**
     * Permet de modifier le formualire pour pouvoir enregistrer un nouveau
     * rapport de visite
     */
    public void nouveau() {        
        vue.getjButtonNouv().setVisible(false);
        vue.getjButtonprec().setVisible(false);
        vue.getjButtonSuiv().setVisible(false);    
        vue.getjButtonSauvegarder().setVisible(true); 
        vue.getjTextFieldNum().setText("");
        vue.getjTextFieldNum().setEditable(false);
        vue.getjComboBoxpraticien().removeItem("aucun");
        vue.getjTextFieldDate().setText("");
        vue.getjTextFieldMotif().setText("");
        vue.getjTextAreabilan().setText("");
    }

    /**
     * Permet d'enregistrer un rapport de visite
     */
    public void enregistrer() {
        Praticien unPraticien = (Praticien) getVue().getjComboBoxpraticien().getSelectedItem() ;       
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	String dateInString = vue.getjTextFieldDate().getText(); 
	
        try { 
            date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));
            String motif =vue.getjTextFieldMotif().getText();
            String bilan =vue.getjTextAreabilan().getText();
            
            if(motif.isEmpty() || bilan.isEmpty()){
                JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                JOptionPane.showMessageDialog(frame, "Un champ est vide");
            }else{
                RapportVisite unRapportVisite = new RapportVisite(ctrlPrincipal.getVisiteurConnecte().getId(), unPraticien, date, bilan, motif);
                DaoRapportVisite.insert(em, unRapportVisite);
            
                JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                JOptionPane.showMessageDialog(frame, "Rapport sauvegardé");
        
                chargementDonnees();
            }
        
           
 
	} catch (ParseException e) {
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Le format de la date n'est pas valide(jj/mm/aaaa)");
	}
        
       
        
        
    }

    /**
     * Permet d'afficher un rappport de viste
     */
    public void afficherRapportVisite() {
        vue.getjTextFieldNum().setEditable(true);
        vue.getjButtonNouv().setVisible(true);
        vue.getjButtonprec().setVisible(true);
        vue.getjButtonSuiv().setVisible(true);    
        vue.getjButtonSauvegarder().setVisible(false);
        //Sélectionne le visiteur
        RapportVisite unRapportVisite = lesRapportsVisite.get(indiceRapportVisiteCourant);
        vue.getjTextFieldNum().setText(Integer.toString(unRapportVisite.getRap_num()));
        vue.getjTextFieldDate().setText(unRapportVisite.getRap_date().toString());
        vue.getjTextFieldMotif().setText(unRapportVisite.getRap_motif());
        vue.getjTextAreabilan().setText(unRapportVisite.getRap_bilan());
        Praticien unPraticien = unRapportVisite.getPra_num();

        for (int i = 0; i < lesOffres.size(); i++) {
            vue.getjTableOffre().setValueAt("", i, 0);
            vue.getjTableOffre().setValueAt("", i, 1);
        }

        int j = 0;
        for (Offrir uneOffre : lesOffres) {
            if (uneOffre.getRap_num() == unRapportVisite.getRap_num()) {
                vue.getjTableOffre().setValueAt(uneOffre.getMed_depotLegal(), j, 0);
                vue.getjTableOffre().setValueAt(uneOffre.getQuantite(), j, 1);
                j++;
            }
        }

        vue.getjComboBoxpraticien().setSelectedItem(unPraticien);
    }

    /**
     * Initialise la liste des praticiens dans le comboBox
     *
     * @param lesPraticiens
     */
    public void afficherListePraticien(List<Praticien> lesPraticiens) {
        vue.getjComboBoxpraticien().removeAllItems();
        vue.getjComboBoxpraticien().addItem("aucun");
        for (Praticien unPraticien : lesPraticiens) {
            vue.getjComboBoxpraticien().addItem(unPraticien);
        }
    }

    @Override
    public VueRapportsVisite getVue() {
        return vue;
    }

    public void setVue(VueRapportsVisite vue) {
        this.vue = vue;
    }

}
