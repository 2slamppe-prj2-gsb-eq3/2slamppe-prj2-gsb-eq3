/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vues;
import controleur.CtrlAbstrait;

/**
 *
 * @author btssio
 */
public class rapports_visite extends VueAbstraite {

    /**
     * Creates new form rapports_visite
     */
    public rapports_visite(CtrlAbstrait ctrl) {
        super(ctrl);
        initComponents();
        this.setLocation(500, 200);
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

        jComboBoxpraticien.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtondetais.setText("Détails");

        jButtonprec.setText("Précédent");

        jButtonsuiv.setText("Suivant");

        jButtonnouv.setText("Nouveau");

        jButtonfermer.setText("Fermer");

        jTableoffre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableoffre);

        jLabeloffre.setText("offre d'échantillons");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButtonprec)
                .addGap(18, 18, 18)
                .addComponent(jButtonsuiv)
                .addGap(18, 18, 18)
                .addComponent(jButtonnouv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonfermer)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelmotif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldmotif, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelbilan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabeldate)
                            .addComponent(jLabelpraticien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxpraticien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtondetais))
                            .addComponent(jTextFielddate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelnum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldnum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeloffre)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabeltitre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabeltitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnum)
                    .addComponent(jTextFieldnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeloffre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelpraticien)
                            .addComponent(jComboBoxpraticien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtondetais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabeldate)
                            .addComponent(jTextFielddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelmotif)
                            .addComponent(jTextFieldmotif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelbilan)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonprec)
                    .addComponent(jButtonsuiv)
                    .addComponent(jButtonnouv)
                    .addComponent(jButtonfermer))
                .addGap(0, 32, Short.MAX_VALUE))
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
