/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.ControladorPrincipal;
import java.awt.event.ActionListener;

/**
 *
 * @author ramir
 */
public class GUIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal(ControladorPrincipal controlador) {
        initComponents();
        escuchar(controlador);
        setVisible(true);
    }

    public void escuchar(ControladorPrincipal controlador){
       btnJugar.addActionListener(controlador);
       btnHistoria.addActionListener(controlador);
       btnInstruciones.addActionListener(controlador);
       btnSalir.addActionListener(controlador);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnHistoria = new javax.swing.JButton();
        btnInstruciones = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btnSalir.setText("btnSalir");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, 190, 60));

        btnJugar.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jugar_1.png"))); // NOI18N
        btnJugar.setText("btnJugar");
        btnJugar.setBorderPainted(false);
        btnJugar.setContentAreaFilled(false);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 210, 60));

        btnHistoria.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        btnHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historia.png"))); // NOI18N
        btnHistoria.setText("btnHistoria");
        btnHistoria.setBorderPainted(false);
        btnHistoria.setContentAreaFilled(false);
        getContentPane().add(btnHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 210, 60));

        btnInstruciones.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        btnInstruciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inst.png"))); // NOI18N
        btnInstruciones.setText("btnInstruciones");
        btnInstruciones.setBorderPainted(false);
        btnInstruciones.setContentAreaFilled(false);
        btnInstruciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstrucionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstruciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 210, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-inicio.1.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInstrucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstrucionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInstrucionesActionPerformed

    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistoria;
    private javax.swing.JButton btnInstruciones;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
