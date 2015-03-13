/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.persistence.EntityManager;
import modele.dao.DaoLabo;
import modele.dao.DaoMedicament;
import modele.dao.DaoOffrir;
import modele.dao.DaoPraticien;
import modele.dao.DaoRapportVisite;
import modele.dao.EntityManagerFactorySingleton;
import modele.metier.Labo;
import modele.metier.Medicament;
import modele.metier.Offrir;
import modele.metier.Praticien;
import modele.metier.RapportVisite;
import modele.metier.Visiteur;
import vues.VueRapportsVisite;

/**
 *
 * @author btssio
 */
public class CtrlRapportVisite extends CtrlAbstrait {
    EntityManager em;
    private VueRapportsVisite vue = new VueRapportsVisite(this);
    private int indiceRapportVisiteCourant=0;
    private List<Praticien> lesPraticiens;
    private List<RapportVisite> lesRapportsVisite;
    private List<Medicament> lesMedicaments;
    private List<Offrir> lesOffres;
    

    public CtrlRapportVisite(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        // Gérer la persistance
        em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        em.getTransaction().begin();
        
        //Afficher les praticens
        lesPraticiens = DaoPraticien.selectAll(em);
        System.out.println(lesPraticiens);
        afficherListePraticien(lesPraticiens);
        
        
        //ON récupère tous les rapports de visite
        lesRapportsVisite = DaoRapportVisite.selectAll(em);
        System.out.println(lesRapportsVisite);
        
        //ON récupère tous les medicaments
        lesMedicaments = DaoMedicament.selectAll(em);
        System.out.println(lesMedicaments);
        
        //ON récupère toutes les offres
        lesOffres = DaoOffrir.selectAll(em);
        System.out.println(lesOffres);
        
        afficherRapportVisite();
       
        
        
        
       vue.getjButtonprec().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {                
                indiceRapportVisiteCourant = indiceRapportVisiteCourant - 1;
                //Si arrive au début de la liste
                if (indiceRapportVisiteCourant<0) {
                    indiceRapportVisiteCourant=lesRapportsVisite.size()-1;
                }               
                afficherRapportVisite();

            }

            
        });

        //Bouton Suivant
        vue.getjButtonsuiv().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {                
                indiceRapportVisiteCourant = indiceRapportVisiteCourant + 1;
                //Si arrive à la fin de la liste
                if (indiceRapportVisiteCourant>lesRapportsVisite.size()-1) {
                    indiceRapportVisiteCourant=0;
                }                
                afficherRapportVisite();

            }
        });
        
        vue.getjButtonnouv().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    
    
    
    }
  
    
    

    
        
    public void afficherRapportVisite(){
        //Sélectionne le visiteur
        RapportVisite unRapportVisite = lesRapportsVisite.get(indiceRapportVisiteCourant);        
        vue.getjTextFieldnum().setText(Integer.toString(unRapportVisite.getRap_num()));
        vue.getjTextFielddate().setText(unRapportVisite.getRap_date().toString());
        vue.getjTextFieldmotif().setText(unRapportVisite.getRap_motif());
        vue.getjTextAreabilan().setText(unRapportVisite.getRap_bilan());
        Praticien unPraticien = unRapportVisite.getPra_num();
        
        
        for(int i=0; i< lesOffres.size(); i++ ) {
            vue.getjTableoffre().setValueAt("", i, 0);
            vue.getjTableoffre().setValueAt("", i, 1);
        }
        
        int j=0;
        for (Offrir uneOffre : lesOffres) {
            if(uneOffre.getRap_num() == unRapportVisite.getRap_num()){                
                vue.getjTableoffre().setValueAt(uneOffre.getMed_depotLegal(), j, 0);
                vue.getjTableoffre().setValueAt(uneOffre.getQuantite(), j, 1);
                j++;
            }
        }
        
        
        vue.getjComboBoxpraticien().setSelectedItem(unPraticien.getNom()+" "+unPraticien.getPrenom());
    }
    
    

    public void afficherListePraticien(List<Praticien> lesPraticiens) {
        vue.getjComboBoxpraticien().removeAllItems();
        vue.getjComboBoxpraticien().addItem("aucun");
        for (Praticien unPraticien : lesPraticiens) {
            vue.getjComboBoxpraticien().addItem(unPraticien.getNom()+" "+unPraticien.getPrenom());
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
