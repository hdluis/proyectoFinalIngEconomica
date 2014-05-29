package Formularios;

public class Regla72 extends javax.swing.JFrame {
String vTipo;

    public Regla72() {
        initComponents();
        cmbTipo.addItem("Periodos");
        cmbTipo.addItem("Interes");
        
        jLabel4.setVisible(false);   
        jLabel2.setVisible(false);
        txtPeriodo.setVisible(false);
        txtInteres.setVisible(false);
        
        btnReg.setOpaque(false);
        btnReg.setContentAreaFilled(false);
        btnReg.setBorderPainted(false);
    }

void habilitarCasillas()
    {
      jLabel4.setVisible(true);   
      txtPeriodo.setVisible(true);
      jLabel2.setVisible(false);
      txtInteres.setVisible(false);
    }

void inhabilitarCasillas()
    {
      jLabel4.setVisible(false);    
      txtPeriodo.setVisible(false);
      jLabel2.setVisible(true);
      txtInteres.setVisible(true);
    }

void borrarCasillas()
{
    txtPeriodo.setText(null); 
    txtInteres.setText(null); 
    lblResultado.setText("Resultado"); 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bntBorrar = new javax.swing.JButton();
        txtInteres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 270));
        setMinimumSize(new java.awt.Dimension(360, 270));
        setPreferredSize(new java.awt.Dimension(360, 270));
        setResizable(false);
        getContentPane().setLayout(null);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(250, 70, 90, 30);

        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png"))); // NOI18N
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(280, 190, 60, 40);

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblResultado.setText("Resultado.");
        getContentPane().add(lblResultado);
        lblResultado.setBounds(90, 200, 140, 20);

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipo);
        cmbTipo.setBounds(70, 70, 100, 30);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Resultado:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 200, 70, 20);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 70, 50, 30);
        getContentPane().add(txtPeriodo);
        txtPeriodo.setBounds(70, 100, 100, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Periodo:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 50, 30);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Interes:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 100, 50, 30);

        bntBorrar.setText("Borrar");
        bntBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(bntBorrar);
        bntBorrar.setBounds(250, 100, 90, 30);
        getContentPane().add(txtInteres);
        txtInteres.setBounds(70, 100, 100, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 410, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double result, porcen;
            
        if (vTipo == "Periodos")
        {
            double perio = Integer.parseInt(txtPeriodo.getText());
            result = (72/perio);
            lblResultado.setText(Double.toString(result));
        }
        else
        if (vTipo == "Interes")
        {
            double inte = Double.parseDouble(txtInteres.getText());  
            porcen = inte/100;
            result = (72/porcen);
            lblResultado.setText(Double.toString(result));
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegActionPerformed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        vTipo = cmbTipo.getSelectedItem().toString();
        if (vTipo == "Periodos")
        {
            habilitarCasillas();
        }
        else
        inhabilitarCasillas();
    }//GEN-LAST:event_cmbTipoActionPerformed

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
            java.util.logging.Logger.getLogger(Regla72.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regla72.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regla72.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regla72.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regla72().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtPeriodo;
    // End of variables declaration//GEN-END:variables
}
