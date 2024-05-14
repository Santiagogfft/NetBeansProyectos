/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Convertidor extends javax.swing.JFrame {

    /**
     * Creates new form Convertidor
     */
    public Convertidor() {
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

        Resultado = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        cbGrados = new javax.swing.JComboBox<>();
        jbConvertir = new javax.swing.JButton();
        jtValorTemperatura = new javax.swing.JTextField();

        javax.swing.GroupLayout ResultadoLayout = new javax.swing.GroupLayout(Resultado);
        Resultado.setLayout(ResultadoLayout);
        ResultadoLayout.setHorizontalGroup(
            ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );
        ResultadoLayout.setVerticalGroup(
            ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setName("panel_Convertidor"); // NOI18N
        setSize(new java.awt.Dimension(500, 500));

        lTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lTitulo.setText("Convertidor");
        lTitulo.setName("JTitulo"); // NOI18N

        cbGrados.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        cbGrados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ºCelsius->ºFahrenheit", "ºFahrenheit->ºCelsius", "ºKelvin->ºCelsius", "ºCelsius->ºKelvin", "ºKelvin->ºFahrenheit", "ºFahrenheit->ºKelvin", "Top Secret" }));
        cbGrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGradosActionPerformed(evt);
            }
        });

        jbConvertir.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jbConvertir.setText("Convertir");
        jbConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConvertirActionPerformed(evt);
            }
        });

        jtValorTemperatura.setFont(new java.awt.Font("DialogInput", 0, 52)); // NOI18N
        jtValorTemperatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtValorTemperatura.setAutoscrolls(false);
        jtValorTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtValorTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jtValorTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(cbGrados, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(jbConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtValorTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(cbGrados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbGradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGradosActionPerformed
        
        
    }//GEN-LAST:event_cbGradosActionPerformed

    private void jbConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConvertirActionPerformed
        /*
ºCelsius->ºFahrenheit
ºFahrenheit->ºCelsius
ºKelvin ->ºCelsius
ºCelsius -> ºKelvin
ºKelvin -> ºFahrenheit
ºFahrenheit -> ºKelvin
        */
        double valor = 0;
        double resultado = 0;
        if(cbGrados.getSelectedItem().equals("ºCelsius->ºFahrenheit")){
                valor = Double.parseDouble(jtValorTemperatura.getText());
                resultado = (valor*9/5)+32;
                JOptionPane.showMessageDialog(this,resultado+"ºF");   
        }else if(cbGrados.getSelectedItem().equals("ºFahrenheit->ºCelsius")){
            valor = Double.parseDouble(jtValorTemperatura.getText());
            resultado = (valor-32)*5/9;
            JOptionPane.showMessageDialog(this,resultado+"ºC");
        }else if(cbGrados.getSelectedItem().equals("ºKelvin->ºCelsius")){
            valor = Double.parseDouble(jtValorTemperatura.getText());
            resultado = valor-273.15;
            JOptionPane.showMessageDialog(this,resultado+"ºC"); 
        }else if(cbGrados.getSelectedItem().equals("ºCelsius->ºKelvin")){
            valor = Double.parseDouble(jtValorTemperatura.getText());
            resultado = valor+273.15;
            JOptionPane.showMessageDialog(this,resultado+"ºK");
        }else if(cbGrados.getSelectedItem().equals("ºKelvin->ºFahrenheit")){
            valor = Double.parseDouble(jtValorTemperatura.getText());
            resultado = (valor-273.15)*9/5+32;
            JOptionPane.showMessageDialog(this,resultado+"ºF");
        }else if(cbGrados.getSelectedItem().equals("ºFahrenheit->ºKelvin")){
            valor = Double.parseDouble(jtValorTemperatura.getText());
            resultado = (valor-32)*5/9+273.15;
            JOptionPane.showMessageDialog(this,resultado+"ºK");
        }else if(cbGrados.getSelectedItem().equals("Top Secret")){
            JOptionPane.showMessageDialog(this,"Hola Mundo");
        }else{
            System.out.println("Ha ocurrido un error");
        }
    }//GEN-LAST:event_jbConvertirActionPerformed

    private void jtValorTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtValorTemperaturaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtValorTemperaturaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Resultado;
    private javax.swing.JComboBox<String> cbGrados;
    private javax.swing.JButton jbConvertir;
    private javax.swing.JTextField jtValorTemperatura;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables
}