/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

public class GUIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal() {
        initComponents();
        setLocationRelativeTo(null);//Poner la posicion de la ventana al centro
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
        btnHistoria = new javax.swing.JButton();
        btnInstruciones = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(868, 700));
        setMinimumSize(new java.awt.Dimension(868, 700));
        setPreferredSize(new java.awt.Dimension(868, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(868, 700));
        getContentPane().setLayout(null);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setDefaultCapable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(650, 590, 200, 50);
        btnSalir.getAccessibleContext().setAccessibleName("btnSalir");

        btnHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historia.png"))); // NOI18N
        btnHistoria.setBorderPainted(false);
        btnHistoria.setContentAreaFilled(false);
        btnHistoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistoria);
        btnHistoria.setBounds(340, 354, 200, 70);
        btnHistoria.getAccessibleContext().setAccessibleName("btnHistoria");

        btnInstruciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inst.png"))); // NOI18N
        btnInstruciones.setBorderPainted(false);
        btnInstruciones.setContentAreaFilled(false);
        btnInstruciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstrucionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstruciones);
        btnInstruciones.setBounds(340, 430, 200, 70);
        btnInstruciones.getAccessibleContext().setAccessibleName("btnInstruciones");

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jugar_1.png"))); // NOI18N
        btnJugar.setBorderPainted(false);
        btnJugar.setContentAreaFilled(false);
        btnJugar.setPreferredSize(new java.awt.Dimension(194, 77));
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar);
        btnJugar.setBounds(340, 280, 200, 70);
        btnJugar.getAccessibleContext().setAccessibleName("btnJugar");

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-inicio.1.jpg"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 870, 664);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaActionPerformed
        // Crea una nueva instancia del JFrame
        GUIHistoria guiHistoria = new GUIHistoria();

        // Establece visible la nueva ventana
        guiHistoria.setVisible(true);

        // Cierra la ventana actual
        this.dispose();
    }//GEN-LAST:event_btnHistoriaActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // Crea una nueva instancia del JFrame
        GUILaberinto guiLaberinto = new GUILaberinto();

        // Establece visible la nueva ventana
        guiLaberinto.setVisible(true);

        // Cierra la ventana actual
        //this.dispose();
        //o Oculta la ventana
        // Oculta la ventana actual en lugar de cerrarla
        this.setVisible(false);
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnInstrucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstrucionesActionPerformed
        // Crea una nueva instancia del JFrame
        GUIInstrucciones guiInstrucciones = new GUIInstrucciones();

        // Establece visible la nueva ventana
        guiInstrucciones.setVisible(true);

        // Cierra la ventana actual
        this.dispose();
       
    }//GEN-LAST:event_btnInstrucionesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Crear un ainstanci para abrir el gui Salir
        GUISalir guiSalir = new GUISalir();
         guiSalir.setVisible(true);
         
          // Cierra la ventana actual
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUIPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnHistoria;
    private javax.swing.JButton btnInstruciones;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
