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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 250));
        setMinimumSize(new java.awt.Dimension(360, 250));
        setPreferredSize(new java.awt.Dimension(360, 250));
        setResizable(false);
        getContentPane().setLayout(null);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(210, 70, 80, 23);

        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png"))); // NOI18N
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(230, 150, 60, 40);

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado.setText("Resultado.");
        getContentPane().add(lblResultado);
        lblResultado.setBounds(20, 160, 140, 20);

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipo);
        cmbTipo.setBounds(70, 70, 100, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 70, 50, 30);
        getContentPane().add(txtPeriodo);
        txtPeriodo.setBounds(70, 100, 100, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Periodo:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 50, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Interes:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 100, 50, 30);
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
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtPeriodo;
    // End of variables declaration//GEN-END:variables
}
