/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.ProyectoInterfaces.vista;
import es.medac.ProyectoInterfaces.Logging;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        tituloInicio = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JLabel();
        datoUsuario = new javax.swing.JTextField();
        textoContraseña = new javax.swing.JLabel();
        botonInicio = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        datoContraseña = new javax.swing.JPasswordField();
        fondoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(642, 464));
        setMinimumSize(new java.awt.Dimension(642, 464));
        setResizable(false);
        setSize(new java.awt.Dimension(642, 464));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloInicio.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        tituloInicio.setForeground(new java.awt.Color(255, 255, 255));
        tituloInicio.setText("INICIO DE SESIÓN");
        getContentPane().add(tituloInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 390, 90));

        textoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        textoUsuario.setText("Usuario:");
        getContentPane().add(textoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, 30));

        datoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(datoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 220, 30));

        textoContraseña.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoContraseña.setForeground(new java.awt.Color(255, 255, 255));
        textoContraseña.setText("Contraseña:");
        getContentPane().add(textoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 140, -1));

        botonInicio.setText("Iniciar");
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 110, 50));

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 110, 50));
        getContentPane().add(datoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 220, 30));

        fondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/ProyectoInterfaces/vista/Imagenes/FondoGris.png"))); // NOI18N
        fondoInicio.setFocusTraversalPolicyProvider(true);
        getContentPane().add(fondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void datoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoUsuarioActionPerformed

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        // TODO add your handling code here:
        Logging lg1 = new Logging();
        String resultado = lg1.Inicio_Usuario(datoUsuario.getText(), Integer.valueOf(datoContraseña.getText()));
        if(resultado.equals("Log Incorrecto")){
            String [] botones = {"Reintentar","Salir"};
            int o = JOptionPane.showOptionDialog(this, resultado, resultado, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, botones, botones[0]);
            if(o == 1){
                dispose();
            }else{
            }
        } else{
            JOptionPane.showMessageDialog(this, resultado);
            setVisible(false);
            Menu men = new Menu();
            men.setVisible(true);
        }
    }//GEN-LAST:event_botonInicioActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
            dispose();
        }else{
        }
    }//GEN-LAST:event_botonSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicio;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPasswordField datoContraseña;
    private javax.swing.JTextField datoUsuario;
    private javax.swing.JLabel fondoInicio;
    private javax.swing.JLabel textoContraseña;
    private javax.swing.JLabel textoUsuario;
    private javax.swing.JLabel tituloInicio;
    // End of variables declaration//GEN-END:variables
}
