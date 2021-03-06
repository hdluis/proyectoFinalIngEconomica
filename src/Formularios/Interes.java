package Formularios;

public class Interes extends javax.swing.JFrame {
String vInt;
boolean vvInt;

    public Interes() {
        initComponents();
        cmbInteres.addItem("Simple");
        cmbInteres.addItem("Compuesto");
        
        btnReg.setOpaque(false);
        btnReg.setContentAreaFilled(false);
        btnReg.setBorderPainted(false);
    }
    
void borrarCasillas()
{
    txtPrincipal.setText(null); 
    txtInteres.setText(null); 
    txtPeriodos.setText(null);
    lblResultado.setText("Resultado"); 
    cmbInteres.setSelectedItem("Seleccionar");
}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblResultado1 = new javax.swing.JLabel();
        cmbInteres = new javax.swing.JComboBox();
        btnReg = new javax.swing.JButton();
        txtInteres = new javax.swing.JTextField();
        txtPrincipal = new javax.swing.JTextField();
        txtPeriodos = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        bntBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 270));
        setMinimumSize(new java.awt.Dimension(360, 270));
        setPreferredSize(new java.awt.Dimension(360, 270));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel18.setText("%");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(110, 130, 20, 30);

        jLabel1.setText("Tipo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 70, 50, 30);

        jLabel2.setText("Interes:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 130, 60, 30);

        jLabel3.setText("Periodos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 160, 60, 30);

        jLabel4.setText("Principal:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 60, 30);

        lblResultado1.setText("Resultado:");
        getContentPane().add(lblResultado1);
        lblResultado1.setBounds(20, 200, 60, 20);

        cmbInteres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        cmbInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInteresActionPerformed(evt);
            }
        });
        getContentPane().add(cmbInteres);
        cmbInteres.setBounds(70, 70, 110, 30);

        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png"))); // NOI18N
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(290, 190, 50, 40);
        getContentPane().add(txtInteres);
        txtInteres.setBounds(70, 130, 40, 30);
        getContentPane().add(txtPrincipal);
        txtPrincipal.setBounds(70, 100, 90, 30);
        getContentPane().add(txtPeriodos);
        txtPeriodos.setBounds(70, 160, 40, 30);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(250, 70, 90, 30);

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblResultado.setText("Resultado.");
        getContentPane().add(lblResultado);
        lblResultado.setBounds(90, 200, 160, 20);

        bntBorrar.setText("Borrar");
        bntBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(bntBorrar);
        bntBorrar.setBounds(250, 100, 90, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 370, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
         this.dispose();
    }//GEN-LAST:event_btnRegActionPerformed

    private void cmbInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInteresActionPerformed
       vInt = cmbInteres.getSelectedItem().toString();
        if (vInt == "Simple")
        {
            vvInt = true;
        }
         else
             vvInt = false;
    }//GEN-LAST:event_cmbInteresActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double presente = Double.parseDouble(txtPrincipal.getText().toString());
        double inte = Double.parseDouble(txtInteres.getText().toString());
        double perio = Integer.parseInt(txtPeriodos.getText().toString());
        double resultado, porcen;
        
        porcen = inte/100;
        
        vInt = cmbInteres.getSelectedItem().toString();
        if (vInt == "Simple")
        {
            resultado = presente * ((1+ porcen)*perio);
            lblResultado.setText(Double.toString(resultado));
        }
         else
            resultado = presente * Math.pow((1+porcen),Math.abs(perio));
            lblResultado.setText(Double.toString(resultado));
        
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Interes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox cmbInteres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtPeriodos;
    private javax.swing.JTextField txtPrincipal;
    // End of variables declaration//GEN-END:variables
}
