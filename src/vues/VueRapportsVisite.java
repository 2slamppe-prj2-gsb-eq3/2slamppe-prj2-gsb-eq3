/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vues;
import controleur.CtrlAbstrait;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author btssio
 */
public class VueRapportsVisite extends VueAbstraite {

    /**
     * Creates new form rapports_visite
     */
    public VueRapportsVisite(CtrlAbstrait ctrl) {
        super(ctrl);
        initComponents();
        this.setLocation(500, 200);
    }

    public JButton getjButtondetais() {
        return jButtondetais;
    }

    public void setjButtondetais(JButton jButtondetais) {
        this.jButtondetais = jButtondetais;
    }

    public JButton getjButtonfermer() {
        return jButtonfermer;
    }

    public void setjButtonfermer(JButton jButtonfermer) {
        this.jButtonfermer = jButtonfermer;
    }

    public JButton getjButtonnouv() {
        return jButtonnouv;
    }

    public void setjButtonnouv(JButton jButtonnouv) {
        this.jButtonnouv = jButtonnouv;
    }

    public JButton getjButtonprec() {
        return jButtonprec;
    }

    public void setjButtonprec(JButton jButtonprec) {
        this.jButtonprec = jButtonprec;
    }

    public JButton getjButtonsuiv() {
        return jButtonsuiv;
    }

    public void setjButtonsuiv(JButton jButtonsuiv) {
        this.jButtonsuiv = jButtonsuiv;
    }

    public JComboBox getjComboBoxpraticien() {
        return jComboBoxpraticien;
    }

    public void setjComboBoxpraticien(JComboBox jComboBoxpraticien) {
        this.jComboBoxpraticien = jComboBoxpraticien;
    }

    public JLabel getjLabelbilan() {
        return jLabelbilan;
    }

    public void setjLabelbilan(JLabel jLabelbilan) {
        this.jLabelbilan = jLabelbilan;
    }

    public JLabel getjLabeldate() {
        return jLabeldate;
    }

    public void setjLabeldate(JLabel jLabeldate) {
        this.jLabeldate = jLabeldate;
    }

    public JLabel getjLabelmotif() {
        return jLabelmotif;
    }

    public void setjLabelmotif(JLabel jLabelmotif) {
        this.jLabelmotif = jLabelmotif;
    }

    public JLabel getjLabelnum() {
        return jLabelnum;
    }

    public void setjLabelnum(JLabel jLabelnum) {
        this.jLabelnum = jLabelnum;
    }

    public JLabel getjLabeloffre() {
        return jLabeloffre;
    }

    public void setjLabeloffre(JLabel jLabeloffre) {
        this.jLabeloffre = jLabeloffre;
    }

    public JLabel getjLabelpraticien() {
        return jLabelpraticien;
    }

    public void setjLabelpraticien(JLabel jLabelpraticien) {
        this.jLabelpraticien = jLabelpraticien;
    }

    public JLabel getjLabeltitre() {
        return jLabeltitre;
    }

    public void setjLabeltitre(JLabel jLabeltitre) {
        this.jLabeltitre = jLabeltitre;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTable getjTableoffre() {
        return jTableoffre;
    }

    public void setjTableoffre(JTable jTableoffre) {
        this.jTableoffre = jTableoffre;
    }

    public JTextArea getjTextAreabilan() {
        return jTextAreabilan;
    }

    public void setjTextAreabilan(JTextArea jTextAreabilan) {
        this.jTextAreabilan = jTextAreabilan;
    }

    public JTextField getjTextFielddate() {
        return jTextFielddate;
    }

    public void setjTextFielddate(JTextField jTextFielddate) {
        this.jTextFielddate = jTextFielddate;
    }

    public JTextField getjTextFieldmotif() {
        return jTextFieldmotif;
    }

    public void setjTextFieldmotif(JTextField jTextFieldmotif) {
        this.jTextFieldmotif = jTextFieldmotif;
    }

    public JTextField getjTextFieldnum() {
        return jTextFieldnum;
    }

    public void setjTextFieldnum(JTextField jTextFieldnum) {
        this.jTextFieldnum = jTextFieldnum;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabeltitre = new javax.swing.JLabel();
        jLabelnum = new javax.swing.JLabel();
        jLabelpraticien = new javax.swing.JLabel();
        jLabeldate = new javax.swing.JLabel();
        jLabelmotif = new javax.swing.JLabel();
        jLabelbilan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreabilan = new javax.swing.JTextArea();
        jTextFieldmotif = new javax.swing.JTextField();
        jTextFielddate = new javax.swing.JTextField();
        jTextFieldnum = new javax.swing.JTextField();
        jComboBoxpraticien = new javax.swing.JComboBox();
        jButtondetais = new javax.swing.JButton();
        jButtonprec = new javax.swing.JButton();
        jButtonsuiv = new javax.swing.JButton();
        jButtonnouv = new javax.swing.JButton();
        jButtonfermer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableoffre = new javax.swing.JTable();
        jLabeloffre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabeltitre.setText("RAPPORTS DE VISITE");

        jLabelnum.setText("Numéro Rapport");

        jLabelpraticien.setText("Praticien");

        jLabeldate.setText("Date Rapport");

        jLabelmotif.setText("Motif Visite");

        jLabelbilan.setText("BILAN");

        jTextAreabilan.setColumns(20);
        jTextAreabilan.setRows(5);
        jScrollPane1.setViewportView(jTextAreabilan);

        jTextFieldnum.setEditable(false);

        jComboBoxpraticien.setEditable(true);
        jComboBoxpraticien.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtondetais.setText("Détails");

        jButtonprec.setText("Précédent");

        jButtonsuiv.setText("Suivant");

        jButtonnouv.setText("Nouveau");

        jButtonfermer.setText("Fermer");

        jTableoffre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Médicament", "Nb. Echantillons"
            }
        ));
        jScrollPane2.setViewportView(jTableoffre);

        jLabeloffre.setText("Offre d'échantillons");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabeltitre))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jButtonprec)
                            .addGap(26, 26, 26)
                            .addComponent(jButtonsuiv)
                            .addGap(73, 73, 73)
                            .addComponent(jButtonnouv)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonfermer))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelpraticien)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelnum)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jComboBoxpraticien, 0, 198, Short.MAX_VALUE)
                                                .addComponent(jTextFieldnum)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabeldate)
                                                    .addGap(35, 35, 35))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabelmotif)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFielddate, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                                .addComponent(jTextFieldmotif))))
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtondetais))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelbilan)
                                    .addGap(86, 86, 86)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabeloffre)))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabeltitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelnum)
                            .addComponent(jTextFieldnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxpraticien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtondetais))
                            .addComponent(jLabelpraticien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabeldate)
                            .addComponent(jTextFielddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelmotif, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldmotif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabelbilan))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabeloffre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonprec)
                    .addComponent(jButtonsuiv)
                    .addComponent(jButtonnouv)
                    .addComponent(jButtonfermer))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtondetais;
    private javax.swing.JButton jButtonfermer;
    private javax.swing.JButton jButtonnouv;
    private javax.swing.JButton jButtonprec;
    private javax.swing.JButton jButtonsuiv;
    private javax.swing.JComboBox jComboBoxpraticien;
    private javax.swing.JLabel jLabelbilan;
    private javax.swing.JLabel jLabeldate;
    private javax.swing.JLabel jLabelmotif;
    private javax.swing.JLabel jLabelnum;
    private javax.swing.JLabel jLabeloffre;
    private javax.swing.JLabel jLabelpraticien;
    private javax.swing.JLabel jLabeltitre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableoffre;
    private javax.swing.JTextArea jTextAreabilan;
    private javax.swing.JTextField jTextFielddate;
    private javax.swing.JTextField jTextFieldmotif;
    private javax.swing.JTextField jTextFieldnum;
    // End of variables declaration//GEN-END:variables
}
