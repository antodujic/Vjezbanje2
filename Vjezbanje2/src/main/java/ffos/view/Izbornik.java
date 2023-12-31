/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ffos.view;

import com.github.javafaker.Faker;
import ffos.controller.ObradaMama;

/**
 *
 * @author Admin
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMama = new javax.swing.JButton();
        btnDijete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMama.setText("CRUD Mama");
        btnMama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMamaActionPerformed(evt);
            }
        });

        btnDijete.setText("CRUD Dijete");
        btnDijete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDijeteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(btnMama)
                .addGap(68, 68, 68)
                .addComponent(btnDijete)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDijete)
                    .addComponent(btnMama))
                .addContainerGap(253, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMamaActionPerformed
        // TODO add your handling code here:
        new FormaMama().setVisible(true);
    }//GEN-LAST:event_btnMamaActionPerformed

    private void btnDijeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDijeteActionPerformed
        // TODO add your handling code here:
        new FormaDijete().setVisible(true);
    }//GEN-LAST:event_btnDijeteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDijete;
    private javax.swing.JButton btnMama;
    // End of variables declaration//GEN-END:variables
}
