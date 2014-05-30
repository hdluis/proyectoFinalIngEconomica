package Formularios;

import javax.swing.JOptionPane;


public class ValorDinero extends javax.swing.JFrame {

    public ValorDinero() {
        initComponents();
        btnReg.setOpaque(false);
        btnReg.setContentAreaFilled(false);
        btnReg.setBorderPainted(false);
    }

void borrarCasillas()
{
    TxtCantidadInicial.setText(null); 
    TxtInteres.setText(null); 
    lblResultado.setText("Resultado"); 
    ComboAnio1.setSelectedItem("1");
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BotonFlujoEfectivo = new javax.swing.JButton();
        BotonValorDinero = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ComboAnio1 = new javax.swing.JComboBox();
        btnReg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BotonCalcular = new javax.swing.JButton();
        bntBorrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RadioPasado = new javax.swing.JRadioButton();
        RadioFuturo = new javax.swing.JRadioButton();
        TxtInteres = new javax.swing.JTextField();
        TxtCantidadInicial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jPanel1.setBackground(new java.awt.Color(17, 167, 156));

        BotonFlujoEfectivo.setText("Flujo de Efectio");
        BotonFlujoEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFlujoEfectivoActionPerformed(evt);
            }
        });

        BotonValorDinero.setText("Valor del Dinero en el Tiempo");
        BotonValorDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonValorDineroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonValorDinero)
                    .addComponent(BotonFlujoEfectivo))
                .addContainerGap(382, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(BotonFlujoEfectivo)
                .addGap(18, 18, 18)
                .addComponent(BotonValorDinero)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Valor del Dinero en el Tiempo");
        setMaximumSize(new java.awt.Dimension(360, 270));
        setMinimumSize(new java.awt.Dimension(360, 270));
        setPreferredSize(new java.awt.Dimension(360, 270));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setText("Cantidad Años");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 120, 90, 20);

        ComboAnio1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        getContentPane().add(ComboAnio1);
        ComboAnio1.setBounds(120, 140, 80, 30);

        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png"))); // NOI18N
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(280, 180, 60, 40);

        jLabel2.setText("Tasa de Interes");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 60, 100, 30);

        BotonCalcular.setText("Calcular");
        BotonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCalcular);
        BotonCalcular.setBounds(250, 90, 90, 30);

        bntBorrar.setText("Borrar");
        bntBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(bntBorrar);
        bntBorrar.setBounds(250, 120, 90, 30);

        jLabel3.setText("%");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 90, 30, 30);

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblResultado.setText("Resultado aqui");
        getContentPane().add(lblResultado);
        lblResultado.setBounds(100, 190, 170, 30);

        jLabel7.setText("Resultado:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 190, 70, 30);

        RadioPasado.setText("Ir a Pasado");
        RadioPasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioPasadoActionPerformed(evt);
            }
        });
        getContentPane().add(RadioPasado);
        RadioPasado.setBounds(30, 150, 90, 23);

        RadioFuturo.setSelected(true);
        RadioFuturo.setText("Ir a Futuro");
        RadioFuturo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioFuturoActionPerformed(evt);
            }
        });
        getContentPane().add(RadioFuturo);
        RadioFuturo.setBounds(30, 130, 90, 23);
        getContentPane().add(TxtInteres);
        TxtInteres.setBounds(120, 90, 70, 30);
        getContentPane().add(TxtCantidadInicial);
        TxtCantidadInicial.setBounds(30, 90, 90, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo5.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 360, 250);

        jLabel6.setText("Cantidad Inicial");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 60, 73, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalcularActionPerformed
      try {
        //  pasamos los controles a variables
        double CantidadInicial=Double.parseDouble(TxtCantidadInicial.getText().toString());
        double TasaInteres = Double.parseDouble(TxtInteres.getText().toString());
        int TotalAnios= Integer.parseInt(ComboAnio1.getSelectedItem().toString());
        
        double CantidadFinal=0;
        if(CantidadInicial>0)
        {
           if(RadioFuturo.isSelected()==true)
           {    // formula para ir al futuro
                CantidadFinal=(CantidadInicial*Math.pow(1+(TasaInteres/100),Math.abs(TotalAnios)));
                lblResultado.setText(Double.toString(CantidadFinal));
           }
           
           if(RadioPasado.isSelected()==true)
           {    // formula para ir al pasado
                CantidadFinal=(CantidadInicial/Math.pow(1+(TasaInteres/100),Math.abs(TotalAnios)));
                lblResultado.setText(Double.toString(CantidadFinal));
           }
        }
        else
        {
            JOptionPane.showConfirmDialog(null, "La Cantidad Inicial Tiene que ser mayo a 0");
            return; // si ingreso 0 o valor negativo salimos de la funcion del boton calcular
        }
      } catch(Exception e)
      {
          JOptionPane.showConfirmDialog( null, "Algo salio mal: " + e);
      }
       
    }//GEN-LAST:event_BotonCalcularActionPerformed

    private void RadioFuturoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioFuturoActionPerformed
        if(RadioFuturo.isSelected()==true)
            RadioPasado.setSelected(false);
    }//GEN-LAST:event_RadioFuturoActionPerformed

    private void RadioPasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioPasadoActionPerformed
            if(RadioPasado.isSelected()==true)
            RadioFuturo.setSelected(false);
    }//GEN-LAST:event_RadioPasadoActionPerformed

    private void BotonFlujoEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFlujoEfectivoActionPerformed
        FlujoEfectivo formflujo = new FlujoEfectivo();
        formflujo.setVisible(true);
    }//GEN-LAST:event_BotonFlujoEfectivoActionPerformed

    private void BotonValorDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonValorDineroActionPerformed
        ValorDinero formvalor = new ValorDinero();
        formvalor.setVisible(true);
    }//GEN-LAST:event_BotonValorDineroActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegActionPerformed

    private void bntBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBorrarActionPerformed
        borrarCasillas();
    }//GEN-LAST:event_bntBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(ValorDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValorDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValorDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValorDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValorDinero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JButton BotonFlujoEfectivo;
    private javax.swing.JButton BotonValorDinero;
    private javax.swing.JComboBox ComboAnio1;
    private javax.swing.JRadioButton RadioFuturo;
    private javax.swing.JRadioButton RadioPasado;
    private javax.swing.JTextField TxtCantidadInicial;
    private javax.swing.JTextField TxtInteres;
    private javax.swing.JButton bntBorrar;
    private javax.swing.JButton btnReg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables
}
