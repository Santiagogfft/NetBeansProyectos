/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.ProyectoInterfaces.vista;
import es.medac.ProyectoInterfaces.Empleado_Recibo;
import javax.swing.JOptionPane;
/**
 *
 * @author Michael Santiago Jara Castro DAW º1
 */
public class Recibo extends javax.swing.JFrame {

    /**
     * Creates new form Recibo
     */
    public Recibo() {
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

        tituloInformeEmpleado = new javax.swing.JLabel();
        datoNombre = new javax.swing.JTextField();
        textoNombre = new javax.swing.JLabel();
        datoApellido = new javax.swing.JTextField();
        textoApellidos = new javax.swing.JLabel();
        datoDni = new javax.swing.JTextField();
        textoDni = new javax.swing.JLabel();
        datoDireccion = new javax.swing.JTextField();
        textoDireccion = new javax.swing.JLabel();
        datoEdad = new javax.swing.JTextField();
        textoEdad = new javax.swing.JLabel();
        textoEstudios = new javax.swing.JLabel();
        datosEstudios = new javax.swing.JComboBox<>();
        datoExpLaboral = new javax.swing.JTextField();
        textoExpLaboral = new javax.swing.JLabel();
        datoHorasTrabajadas = new javax.swing.JTextField();
        textoHorasTrabajadas = new javax.swing.JLabel();
        datoPagoHora = new javax.swing.JTextField();
        textoPagoHora = new javax.swing.JLabel();
        datoRecibo = new javax.swing.JTextField();
        textoRecibo = new javax.swing.JLabel();
        fondoInfo = new javax.swing.JScrollPane();
        infoRecibo = new javax.swing.JTextArea();
        botonSalirInforme = new javax.swing.JButton();
        botonMenu = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonProcesar = new javax.swing.JButton();
        fondoRecibo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recibo");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(990, 551));
        setMinimumSize(new java.awt.Dimension(990, 551));
        setPreferredSize(new java.awt.Dimension(990, 551));
        setResizable(false);
        setSize(new java.awt.Dimension(990, 551));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloInformeEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tituloInformeEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        tituloInformeEmpleado.setText("EMPLEADO RECIBO:");
        getContentPane().add(tituloInformeEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 50));

        datoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(datoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, 30));

        textoNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(255, 255, 255));
        textoNombre.setText("Nombres:");
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, 30));

        datoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(datoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 140, 30));

        textoApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoApellidos.setForeground(new java.awt.Color(255, 255, 255));
        textoApellidos.setText("Apellidos:");
        getContentPane().add(textoApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        datoDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoDniActionPerformed(evt);
            }
        });
        getContentPane().add(datoDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, 30));

        textoDni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoDni.setForeground(new java.awt.Color(255, 255, 255));
        textoDni.setText("DNI:");
        getContentPane().add(textoDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 30));

        datoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(datoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 140, 30));

        textoDireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoDireccion.setForeground(new java.awt.Color(255, 255, 255));
        textoDireccion.setText("Dirección:");
        getContentPane().add(textoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 90, 30));

        datoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoEdadActionPerformed(evt);
            }
        });
        getContentPane().add(datoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, 30));

        textoEdad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoEdad.setForeground(new java.awt.Color(255, 255, 255));
        textoEdad.setText("Edad:");
        getContentPane().add(textoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, 30));

        textoEstudios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoEstudios.setForeground(new java.awt.Color(255, 255, 255));
        textoEstudios.setText("Estudios:");
        getContentPane().add(textoEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 80, 30));

        datosEstudios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Estudios", "Bachiller", "FP Superior", "Universitario", "Master", "Doctorado" }));
        datosEstudios.setToolTipText("");
        datosEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosEstudiosActionPerformed(evt);
            }
        });
        getContentPane().add(datosEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 140, 30));

        datoExpLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoExpLaboralActionPerformed(evt);
            }
        });
        getContentPane().add(datoExpLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 140, 30));

        textoExpLaboral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoExpLaboral.setForeground(new java.awt.Color(255, 255, 255));
        textoExpLaboral.setText("Experiencia Laboral:");
        getContentPane().add(textoExpLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 170, 30));

        datoHorasTrabajadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoHorasTrabajadasActionPerformed(evt);
            }
        });
        getContentPane().add(datoHorasTrabajadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 140, 30));

        textoHorasTrabajadas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoHorasTrabajadas.setForeground(new java.awt.Color(255, 255, 255));
        textoHorasTrabajadas.setText("Horas Trabajadas:");
        getContentPane().add(textoHorasTrabajadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 170, 30));

        datoPagoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoPagoHoraActionPerformed(evt);
            }
        });
        getContentPane().add(datoPagoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 140, 30));

        textoPagoHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoPagoHora.setForeground(new java.awt.Color(255, 255, 255));
        textoPagoHora.setText("Pago por Hora:");
        getContentPane().add(textoPagoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 170, 30));

        datoRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoReciboActionPerformed(evt);
            }
        });
        getContentPane().add(datoRecibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 140, 30));

        textoRecibo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoRecibo.setForeground(new java.awt.Color(255, 255, 255));
        textoRecibo.setText("Recibo:");
        getContentPane().add(textoRecibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 170, 30));

        infoRecibo.setEditable(false);
        infoRecibo.setBackground(new java.awt.Color(0, 51, 51));
        infoRecibo.setColumns(20);
        infoRecibo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        infoRecibo.setForeground(new java.awt.Color(255, 255, 255));
        infoRecibo.setRows(5);
        infoRecibo.setSelectionColor(new java.awt.Color(102, 102, 102));
        fondoInfo.setViewportView(infoRecibo);

        getContentPane().add(fondoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 370, 390));

        botonSalirInforme.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        botonSalirInforme.setForeground(new java.awt.Color(204, 0, 0));
        botonSalirInforme.setText("SALIR");
        botonSalirInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirInformeActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalirInforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 100, 40));

        botonMenu.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        botonMenu.setForeground(new java.awt.Color(51, 51, 51));
        botonMenu.setText("MENÚ");
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(botonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 100, 40));

        botonLimpiar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        botonLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        botonLimpiar.setText("LIMPIAR");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 100, 50));

        botonProcesar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        botonProcesar.setForeground(new java.awt.Color(51, 0, 51));
        botonProcesar.setText("PROCESAR");
        botonProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(botonProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 100, 50));

        fondoRecibo.setBackground(new java.awt.Color(51, 51, 51));
        fondoRecibo.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        fondoRecibo.setForeground(new java.awt.Color(255, 255, 255));
        fondoRecibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/medac/ProyectoInterfaces/vista/Imagenes/FondoVerde.png"))); // NOI18N
        fondoRecibo.setName("fondoRecibo"); // NOI18N
        fondoRecibo.setPreferredSize(new java.awt.Dimension(990, 551));
        getContentPane().add(fondoRecibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 551));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void datoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoNombreActionPerformed
        // TODO add your handling code her

    }//GEN-LAST:event_datoNombreActionPerformed

    private void datoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoApellidoActionPerformed

    private void datoDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoDniActionPerformed

    private void datoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoDireccionActionPerformed

    private void datoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoEdadActionPerformed

    private void datosEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosEstudiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datosEstudiosActionPerformed

    private void datoExpLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoExpLaboralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoExpLaboralActionPerformed

    private void datoHorasTrabajadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoHorasTrabajadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoHorasTrabajadasActionPerformed

    private void datoReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoReciboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoReciboActionPerformed

    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Menu men = new Menu();
        men.setVisible(true);
    }//GEN-LAST:event_botonMenuActionPerformed

    private void botonProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProcesarActionPerformed
        // TODO add your handling code here:
        Empleado_Recibo infoE = new Empleado_Recibo();//estancia de objeto
        infoE.setNombre(datoNombre.getText());//nombre
        infoE.setApellido(datoApellido.getText());//apellido
        infoE.setDni(datoDni.getText());//DNI
        infoE.setDireccion(datoDireccion.getText());//direccion
        if(datoEdad.getText().equals("")){//edad
            datoEdad.setText("0");
            infoE.setEdad(Integer.parseInt(datoEdad.getText()));
        } else {
            infoE.setEdad(Integer.parseInt(datoEdad.getText()));
        }
        infoE.setFormacionAcademica(datosEstudios.getSelectedItem().toString());//estudios
        if(datoExpLaboral.getText().equals("")){//añosExperiencia
            datoExpLaboral.setText("0");
            infoE.setAñosExperiencia(Integer.parseInt(datoEdad.getText()));
        } else {
            infoE.setAñosExperiencia(Integer.parseInt(datoEdad.getText()));
        }
        if(datoHorasTrabajadas.getText().equals("")){//horasTrabajadas
            datoHorasTrabajadas.setText("0");
            infoE.setHorasTrabajadas(Integer.parseInt(datoHorasTrabajadas.getText()));
        } else {
            infoE.setHorasTrabajadas(Integer.parseInt(datoHorasTrabajadas.getText()));
        }
        if(datoPagoHora.getText().equals("")){//pagoPorHora
            datoPagoHora.setText("0");
            infoE.setPagosPorHora(Integer.parseInt(datoPagoHora.getText()));
        } else {
            infoE.setPagosPorHora(Integer.parseInt(datoPagoHora.getText()));
        }
        infoE.setRecibo(datoRecibo.getText());
        infoRecibo.setText(infoE.imprimirReciboPago());
    }//GEN-LAST:event_botonProcesarActionPerformed

    private void datoPagoHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoPagoHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoPagoHoraActionPerformed

    private void botonSalirInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirInformeActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea salir?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
            dispose();
        }else{
        }
    }//GEN-LAST:event_botonSalirInformeActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
        datoNombre.setText("");//nombre
        datoApellido.setText("");//apellido
        datoDni.setText("");//dni
        datoEdad.setText("");//edad
        datoDireccion.setText("");//direccion
        datosEstudios.setSelectedIndex(0);//estudios
        datoExpLaboral.setText("");//añosExperiencia
        datoHorasTrabajadas.setText("");//horasTrabajadas
        datoPagoHora.setText("");//pagoPorHora
        datoRecibo.setText("");//recibo
        infoRecibo.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonMenu;
    private javax.swing.JButton botonProcesar;
    private javax.swing.JButton botonSalirInforme;
    private javax.swing.JTextField datoApellido;
    private javax.swing.JTextField datoDireccion;
    private javax.swing.JTextField datoDni;
    private javax.swing.JTextField datoEdad;
    private javax.swing.JTextField datoExpLaboral;
    private javax.swing.JTextField datoHorasTrabajadas;
    private javax.swing.JTextField datoNombre;
    private javax.swing.JTextField datoPagoHora;
    private javax.swing.JTextField datoRecibo;
    private javax.swing.JComboBox<String> datosEstudios;
    private javax.swing.JScrollPane fondoInfo;
    private javax.swing.JLabel fondoRecibo;
    private javax.swing.JTextArea infoRecibo;
    private javax.swing.JLabel textoApellidos;
    private javax.swing.JLabel textoDireccion;
    private javax.swing.JLabel textoDni;
    private javax.swing.JLabel textoEdad;
    private javax.swing.JLabel textoEstudios;
    private javax.swing.JLabel textoExpLaboral;
    private javax.swing.JLabel textoHorasTrabajadas;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoPagoHora;
    private javax.swing.JLabel textoRecibo;
    private javax.swing.JLabel tituloInformeEmpleado;
    // End of variables declaration//GEN-END:variables
}