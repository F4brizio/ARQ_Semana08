package AppViews;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/**
 *
 * @author luisp
 */
public class PartidaNueva extends javax.swing.JFrame {
    AppControllers.PartidaNueva controller;
    /**
     * Creates new form CrearPartida
     */
    public PartidaNueva(AppControllers.PartidaNueva controller) {
        this.controller = controller;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlcrearpartida = new javax.swing.JPanel();
        lblcrearpartida = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        rdbtnpvp = new javax.swing.JRadioButton();
        rdbtnpvm = new javax.swing.JRadioButton();
        lblelegiroponente = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlcrearpartida.setName("pnlcrearpartida"); // NOI18N

        lblcrearpartida.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblcrearpartida.setText("     CREAR PARTIDA");
        lblcrearpartida.setName("lblcrearpartida"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("NOMBRE :");
        jLabel2.setName("lblnombre"); // NOI18N

        txtnombre.setToolTipText("Ingrese Nombre...");
        txtnombre.setName("txtnombre"); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbtnpvp);
        rdbtnpvp.setSelected(true);
        rdbtnpvp.setText("PERSONA VS PERSONA");
        rdbtnpvp.setName("rdbtnpvp"); // NOI18N
        rdbtnpvp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnpvpActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbtnpvm);
        rdbtnpvm.setText("PERSONA VS MAQUINA");
        rdbtnpvm.setName("rdbtnpvm"); // NOI18N

        lblelegiroponente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblelegiroponente.setText("ELEGIR OPONENTE:");
        lblelegiroponente.setName("lblelegiroponente"); // NOI18N

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnCreate.setText("Crear");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlcrearpartidaLayout = new javax.swing.GroupLayout(pnlcrearpartida);
        pnlcrearpartida.setLayout(pnlcrearpartidaLayout);
        pnlcrearpartidaLayout.setHorizontalGroup(
            pnlcrearpartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcrearpartidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlcrearpartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcrearpartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlcrearpartidaLayout.createSequentialGroup()
                        .addGroup(pnlcrearpartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblelegiroponente)
                            .addGroup(pnlcrearpartidaLayout.createSequentialGroup()
                                .addGroup(pnlcrearpartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCancel)
                                    .addGroup(pnlcrearpartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(rdbtnpvp)))
                                .addGap(18, 18, 18)
                                .addGroup(pnlcrearpartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlcrearpartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rdbtnpvm))
                                    .addComponent(btnCreate))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlcrearpartidaLayout.setVerticalGroup(
            pnlcrearpartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcrearpartidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcrearpartida, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(pnlcrearpartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(lblelegiroponente)
                .addGap(29, 29, 29)
                .addGroup(pnlcrearpartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnpvp)
                    .addComponent(rdbtnpvm))
                .addGap(18, 18, 18)
                .addGroup(pnlcrearpartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnCreate))
                .addGap(14, 14, 14))
        );

        txtnombre.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlcrearpartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlcrearpartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void rdbtnpvpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnpvpActionPerformed

    }//GEN-LAST:event_rdbtnpvpActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.controller.cancel();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        this.controller.create(this.txtnombre.getText(), buttonGroup1.getSelection().getActionCommand());
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblcrearpartida;
    private javax.swing.JLabel lblelegiroponente;
    private javax.swing.JPanel pnlcrearpartida;
    private javax.swing.JRadioButton rdbtnpvm;
    private javax.swing.JRadioButton rdbtnpvp;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}