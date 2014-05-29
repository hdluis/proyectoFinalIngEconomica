package Formularios;

public class Interpolacion extends javax.swing.JFrame {

    public Interpolacion() {
        initComponents();
        btnReg.setOpaque(false);
        btnReg.setContentAreaFilled(false);
        btnReg.setBorderPainted(false);
    }
    
    void borrarCasillas()
{
    txtporcentaje1.setText(null); 
    txtporcentaje2.setText(null); 
    txtporcentaje3.setText(null); 
    txtvalor1.setText(null); 
    txtvalor2.setText(null); 
    lblResultado.setText("Resultado"); 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtporcentaje1 = new javax.swing.JTextField();
        txtporcentaje2 = new javax.swing.JTextField();
        txtvalor1 = new javax.swing.JTextField();
        txtvalor2 = new javax.swing.JTextField();
        txtporcentaje3 = new javax.swing.JTextField();
        bntBorrar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnReg = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(360, 270));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(txtporcentaje1);
        txtporcentaje1.setBounds(20, 80, 70, 30);

        txtporcentaje2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtporcentaje2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtporcentaje2);
        txtporcentaje2.setBounds(20, 140, 70, 30);
        getContentPane().add(txtvalor1);
        txtvalor1.setBounds(130, 80, 80, 30);
        getContentPane().add(txtvalor2);
        txtvalor2.setBounds(130, 140, 80, 30);
        getContentPane().add(txtporcentaje3);
        txtporcentaje3.setBounds(20, 190, 70, 30);

        bntBorrar.setText("Borrar");
        bntBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(bntBorrar);
        bntBorrar.setBounds(240, 100, 90, 30);

        lblResultado.setText("0");
        getContentPane().add(lblResultado);
        lblResultado.setBounds(130, 190, 80, 30);

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular);
        calcular.setBounds(243, 70, 90, 30);

        jLabel1.setText("Porcentaje 1:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 60, 80, 20);

        jLabel2.setText("Porcentaje 2:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 120, 80, 20);

        jLabel3.setText("Porcentaje buscado:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 170, 130, 20);

        jLabel4.setText("Valor 1:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 60, 50, 20);

        jLabel5.setText("Valor 2:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 120, 50, 20);

        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png"))); // NOI18N
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(280, 190, 60, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo6.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 360, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtporcentaje2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtporcentaje2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtporcentaje2ActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        //variables
        double porcentaje1=Double.parseDouble(txtporcentaje1.getText());
        double porcentaje2=Double.parseDouble(txtporcentaje2.getText());
        double valor1=Double.parseDouble(txtvalor1.getText());
        double valor2=Double.parseDouble(txtvalor2.getText());
        double porcentaje3=Double.parseDouble(txtporcentaje3.getText());
        double resultado=(porcentaje3-porcentaje1)/(porcentaje2-porcentaje1);
        if(valor1>valor2)
        {
            resultado=resultado*(valor1-valor2);
            resultado=valor1-resultado;
        }
        if(valor1<valor2)
        {
             resultado=resultado*(valor2-valor1);
             resultado=valor1+resultado;
        }
        
        lblResultado.setText(Double.toString(resultado));
    }//GEN-LAST:event_calcularActionPerformed

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
            java.util.logging.Logger.getLogger(Interpolacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interpolacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interpolacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interpolacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interpolacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBorrar;
    private javax.swing.JButton btnReg;
    private javax.swing.JButton calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtporcentaje1;
    private javax.swing.JTextField txtporcentaje2;
    private javax.swing.JTextField txtporcentaje3;
    private javax.swing.JTextField txtvalor1;
    private javax.swing.JTextField txtvalor2;
    // End of variables declaration//GEN-END:variables
}
