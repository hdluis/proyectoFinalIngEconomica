package Formularios;

public class Gradientes extends javax.swing.JFrame {


    public Gradientes() {
        initComponents();
        btnReg.setOpaque(false);
        btnReg.setContentAreaFilled(false);
        btnReg.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        txtGradiente = new javax.swing.JTextField();
        cmbA1 = new javax.swing.JComboBox();
        txtInteres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRespuesta = new javax.swing.JLabel();
        btnCalcular2 = new javax.swing.JButton();
        txtGradiente2 = new javax.swing.JTextField();
        cmbA2 = new javax.swing.JComboBox();
        txtInteres2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblRespuesta2 = new javax.swing.JLabel();
        btnCalcular3 = new javax.swing.JButton();
        txtGradiente3 = new javax.swing.JTextField();
        cmbA3 = new javax.swing.JComboBox();
        txtInteres3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRespuesta3 = new javax.swing.JLabel();
        btnReg = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(580, 350));
        setMinimumSize(new java.awt.Dimension(580, 350));
        setPreferredSize(new java.awt.Dimension(580, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(90, 180, 71, 23);
        getContentPane().add(txtGradiente);
        txtGradiente.setBounds(90, 90, 64, 20);

        cmbA1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(cmbA1);
        cmbA1.setBounds(80, 150, 79, 20);
        getContentPane().add(txtInteres);
        txtInteres.setBounds(90, 120, 64, 20);

        jLabel1.setText("F/G");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 60, 30, 14);

        jLabel2.setText("Interes:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 120, 66, 14);

        lblRespuesta.setText("Respueta");
        getContentPane().add(lblRespuesta);
        lblRespuesta.setBounds(90, 220, 70, 14);

        btnCalcular2.setText("Calcular");
        btnCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular2);
        btnCalcular2.setBounds(270, 180, 71, 23);
        getContentPane().add(txtGradiente2);
        txtGradiente2.setBounds(270, 90, 64, 20);

        cmbA2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(cmbA2);
        cmbA2.setBounds(260, 150, 80, 20);
        getContentPane().add(txtInteres2);
        txtInteres2.setBounds(270, 120, 64, 20);

        jLabel3.setText("Gradiente:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 90, 66, 14);

        jLabel4.setText("Interes:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 120, 66, 14);

        lblRespuesta2.setText("Respueta");
        getContentPane().add(lblRespuesta2);
        lblRespuesta2.setBounds(270, 220, 71, 14);

        btnCalcular3.setText("Calcular");
        btnCalcular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular3);
        btnCalcular3.setBounds(440, 180, 71, 23);
        getContentPane().add(txtGradiente3);
        txtGradiente3.setBounds(440, 90, 64, 20);

        cmbA3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(cmbA3);
        cmbA3.setBounds(430, 150, 79, 20);
        getContentPane().add(txtInteres3);
        txtInteres3.setBounds(440, 120, 64, 20);

        jLabel5.setText("Gradiente:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 90, 66, 14);

        jLabel6.setText("Interes:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 120, 66, 14);

        lblRespuesta3.setText("Respueta");
        getContentPane().add(lblRespuesta3);
        lblRespuesta3.setBounds(440, 220, 71, 14);

        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png"))); // NOI18N
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(500, 260, 50, 40);

        jLabel7.setText("Gradiente:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 90, 66, 14);

        jLabel8.setText("P/G");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 60, 30, 14);

        jLabel9.setText("A/G");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(290, 60, 30, 14);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo9.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 600, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double gra = Double.parseDouble(txtGradiente.getText().toString());
        double inte = Double.parseDouble(txtInteres.getText().toString());
        int n = Integer.parseInt(cmbA1.getSelectedItem().toString());
        double p1, p2, p3, pf = 0;
        double i = (inte/100);
        
        p1 = Math.pow((1+i), Math.abs(n)) - 1;
        p2 = i * Math.pow((1+i), Math.abs(n));
        p3 = n / Math.pow((1+i), Math.abs(n));
        pf = (gra/i) * ((p1/p2) -  p3);
        
        lblRespuesta.setText(Double.toString(pf));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular2ActionPerformed
        double gra = Double.parseDouble(txtGradiente2.getText().toString());
        double inte = Double.parseDouble(txtInteres2.getText().toString());
        int n = Integer.parseInt(cmbA2.getSelectedItem().toString());
        double p1, p2, pf = 0;
        double i = (inte/100);
        
        p1 = 1 / i;;
        p2 = n / (Math.pow((1+i), Math.abs(n)) - 1);
        pf = gra * (p1 -  p2);
        
        lblRespuesta2.setText(Double.toString(pf));
    }//GEN-LAST:event_btnCalcular2ActionPerformed

    private void btnCalcular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular3ActionPerformed
        double gra = Double.parseDouble(txtGradiente3.getText().toString());
        double inte = Double.parseDouble(txtInteres3.getText().toString());
        int n = Integer.parseInt(cmbA3.getSelectedItem().toString());
        double p1, p2, p3, pf = 0;
        double i = (inte/100);
        
        p1 = 1 / i;;
        p2 = (Math.pow((1+i), Math.abs(n)) - 1);
        p3 = (p2 / i) - n;
        pf = gra * (p1 *  p3);
        
        lblRespuesta2.setText(Double.toString(pf));
    }//GEN-LAST:event_btnCalcular3ActionPerformed

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
            java.util.logging.Logger.getLogger(Gradientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gradientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gradientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gradientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gradientes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcular2;
    private javax.swing.JButton btnCalcular3;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox cmbA1;
    private javax.swing.JComboBox cmbA2;
    private javax.swing.JComboBox cmbA3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JLabel lblRespuesta2;
    private javax.swing.JLabel lblRespuesta3;
    private javax.swing.JTextField txtGradiente;
    private javax.swing.JTextField txtGradiente2;
    private javax.swing.JTextField txtGradiente3;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtInteres2;
    private javax.swing.JTextField txtInteres3;
    // End of variables declaration//GEN-END:variables
}
