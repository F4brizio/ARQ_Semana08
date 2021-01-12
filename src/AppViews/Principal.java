package AppViews;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author luisp
 */
public class Principal extends javax.swing.JFrame {

    private AppControllers.Principal controller;
    /**
     * Creates new form PARTIDAS
     */
    public Principal(AppControllers.Principal controller) {
        this.controller = controller;
        initComponents();
    }

    public void init(){
        this.setVisible(true);
    }
    public void close(){
        this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnltitulojuego = new javax.swing.JPanel();
        lbljuegojkp = new javax.swing.JLabel();
        btnnuevapartida = new javax.swing.JButton();
        lblpartidasguardadas = new javax.swing.JLabel();
        pnllistapartidas = new javax.swing.JPanel();
        Scrlistapartidas = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnltitulojuego.setName("pnltitulojuego"); // NOI18N

        lbljuegojkp.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbljuegojkp.setText("JUEGO - Jan Ken Po");
        lbljuegojkp.setName("lbljuegojkp"); // NOI18N
        lbljuegojkp.setOpaque(true);

        btnnuevapartida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnnuevapartida.setText("+ Nueva Partida");
        btnnuevapartida.setName("btnnuevapartida"); // NOI18N
        btnnuevapartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevapartidaActionPerformed(evt);
            }
        });

        lblpartidasguardadas.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        lblpartidasguardadas.setText("            PARTIDAS GUARDADAS");
        lblpartidasguardadas.setName("lblpartidasguardadas"); // NOI18N

        pnllistapartidas.setBackground(new java.awt.Color(204, 204, 204));
        pnllistapartidas.setName("pnllistapartidas"); // NOI18N

        Scrlistapartidas.setName("scrlistapartidas"); // NOI18N

        javax.swing.GroupLayout pnllistapartidasLayout = new javax.swing.GroupLayout(pnllistapartidas);
        pnllistapartidas.setLayout(pnllistapartidasLayout);
        pnllistapartidasLayout.setHorizontalGroup(
            pnllistapartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnllistapartidasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Scrlistapartidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnllistapartidasLayout.setVerticalGroup(
            pnllistapartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Scrlistapartidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnltitulojuegoLayout = new javax.swing.GroupLayout(pnltitulojuego);
        pnltitulojuego.setLayout(pnltitulojuegoLayout);
        pnltitulojuegoLayout.setHorizontalGroup(
            pnltitulojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnltitulojuegoLayout.createSequentialGroup()
                .addGroup(pnltitulojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnltitulojuegoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lbljuegojkp, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnltitulojuegoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnnuevapartida)))
                .addContainerGap())
            .addGroup(pnltitulojuegoLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(lblpartidasguardadas, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnltitulojuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnllistapartidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        pnltitulojuegoLayout.setVerticalGroup(
            pnltitulojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltitulojuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbljuegojkp)
                .addGap(18, 18, 18)
                .addComponent(btnnuevapartida)
                .addGap(18, 18, 18)
                .addComponent(lblpartidasguardadas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnllistapartidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnltitulojuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnltitulojuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevapartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevapartidaActionPerformed
        this.controller.newGame();
    }//GEN-LAST:event_btnnuevapartidaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar Scrlistapartidas;
    private javax.swing.JButton btnnuevapartida;
    private javax.swing.JLabel lbljuegojkp;
    private javax.swing.JLabel lblpartidasguardadas;
    private javax.swing.JPanel pnllistapartidas;
    private javax.swing.JPanel pnltitulojuego;
    // End of variables declaration//GEN-END:variables
}
