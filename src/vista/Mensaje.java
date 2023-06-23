/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.*;

/**
 *
 * @author jorge
 */
public class Mensaje extends JInternalFrame {

    /**
     * Creates new form Mensaje
     * @param msg texto que se mustra en el formulario
     */

    public Mensaje(String msg ) {
        initComponents();
        this.toFront();
        this.getContentPane().setBackground(new java.awt.Color(255,255,255));
        this.setLocation(60,70);
        getTxt_Mensaje().setText(msg);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_Mensaje = new javax.swing.JTextField();
        Btn_Acepmensaje = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jPanel1.setBackground(new java.awt.Color(110, 0, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mensaje ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Images&Icons/Warning.png"))); // NOI18N

        txt_Mensaje.setEditable(false);
        txt_Mensaje.setBackground(new java.awt.Color(255, 255, 255));
        txt_Mensaje.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_Mensaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Mensaje.setBorder(null);

        Btn_Acepmensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btn_Acepmensaje.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Acepmensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Images&Icons/Btn_Aceptar.png"))); // NOI18N
        Btn_Acepmensaje.setText("Aceptar");
        Btn_Acepmensaje.setBorder(null);
        Btn_Acepmensaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Acepmensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AcepmensajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(Btn_Acepmensaje)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Mensaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Acepmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AcepmensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AcepmensajeActionPerformed
        this.dispose();
    }//GEN-LAST:event_Btn_AcepmensajeActionPerformed

    public JButton getBtn_Acepmensaje() {
        return Btn_Acepmensaje;
    }

    public void setBtn_Acepmensaje(JButton Btn_Acepmensaje) {
        this.Btn_Acepmensaje = Btn_Acepmensaje;
    }

    public final JTextField getTxt_Mensaje() {
        return txt_Mensaje;
    }

    public void setTxt_Mensaje(JTextField txt_Mensaje) {
        this.txt_Mensaje = txt_Mensaje;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Acepmensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Mensaje;
    // End of variables declaration//GEN-END:variables
}
