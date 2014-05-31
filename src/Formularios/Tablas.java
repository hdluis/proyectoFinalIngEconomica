package Formularios;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;


public class Tablas extends javax.swing.JFrame {


    public Tablas() {
        initComponents();
        
        btnReg.setOpaque(false);
        btnReg.setContentAreaFilled(false);
        btnReg.setBorderPainted(false);
        
        brGrupo.add(rdn1);
        brGrupo.add(rdn2);
        brGrupo.add(rdn3);
        brGrupo.add(rdn4);
        brGrupo.add(rdn5);
        brGrupo.add(rdn6);
        brGrupo.add(rdn7);
        brGrupo.add(rdn8);
    }

void borrarCasillas()
{
    txtPorcen.setText(null); 
    lblRespuesta.setText("Resultado");
    cmbA1.setSelectedItem("1");
    
    rdn1.setSelected(false);
    rdn2.setSelected(false);
    rdn3.setSelected(false);
    rdn4.setSelected(false);
    rdn5.setSelected(false);
    rdn6.setSelected(false);
    rdn7.setSelected(false);
    rdn8.setSelected(false);
    brGrupo.clearSelection();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        rdn1 = new javax.swing.JRadioButton();
        rdn2 = new javax.swing.JRadioButton();
        rdn3 = new javax.swing.JRadioButton();
        rdn4 = new javax.swing.JRadioButton();
        rdn5 = new javax.swing.JRadioButton();
        rdn6 = new javax.swing.JRadioButton();
        rdn7 = new javax.swing.JRadioButton();
        rdn8 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bntBorrar = new javax.swing.JButton();
        lblRespuesta = new javax.swing.JLabel();
        btnReg = new javax.swing.JButton();
        btnEncontrar = new javax.swing.JButton();
        cmbA1 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        txtPorcen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 270));
        setMinimumSize(new java.awt.Dimension(360, 270));
        setPreferredSize(new java.awt.Dimension(360, 270));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel8.setText("Tipo de Pago.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 0, 100, 20);

        rdn1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        rdn1.setText("A/G");
        rdn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdn1ActionPerformed(evt);
            }
        });
        jPanel1.add(rdn1);
        rdn1.setBounds(50, 80, 50, 21);

        rdn2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        rdn2.setText("F/P");
        jPanel1.add(rdn2);
        rdn2.setBounds(0, 20, 50, 21);

        rdn3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        rdn3.setText("P/F");
        jPanel1.add(rdn3);
        rdn3.setBounds(50, 20, 50, 21);

        rdn4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        rdn4.setText("A/F");
        jPanel1.add(rdn4);
        rdn4.setBounds(0, 60, 50, 21);

        rdn5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        rdn5.setText("F/A");
        jPanel1.add(rdn5);
        rdn5.setBounds(50, 60, 50, 21);

        rdn6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        rdn6.setText("A/P");
        jPanel1.add(rdn6);
        rdn6.setBounds(0, 40, 50, 21);

        rdn7.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        rdn7.setText("P/A");
        jPanel1.add(rdn7);
        rdn7.setBounds(50, 40, 50, 21);

        rdn8.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        rdn8.setText("P/G");
        jPanel1.add(rdn8);
        rdn8.setBounds(0, 80, 50, 21);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo12[2].jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 100, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 70, 100, 110);

        jLabel12.setText("Valor:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 210, 60, 20);

        bntBorrar.setText("Borrar");
        bntBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(bntBorrar);
        bntBorrar.setBounds(220, 200, 70, 30);

        lblRespuesta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRespuesta.setText("Respueta");
        getContentPane().add(lblRespuesta);
        lblRespuesta.setBounds(100, 210, 150, 20);

        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png"))); // NOI18N
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(280, 190, 60, 40);

        btnEncontrar.setText("Encontrar");
        btnEncontrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncontrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncontrar);
        btnEncontrar.setBounds(80, 150, 90, 30);

        cmbA1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        getContentPane().add(cmbA1);
        cmbA1.setBounds(80, 110, 60, 30);

        jLabel22.setText("Años:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(40, 110, 41, 30);
        getContentPane().add(txtPorcen);
        txtPorcen.setBounds(80, 70, 64, 30);

        jLabel7.setText("Porcentaje:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 70, 66, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo12.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 360, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncontrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncontrarActionPerformed
        double porcen =Double.parseDouble(txtPorcen.getText());
        int n = Integer.parseInt(cmbA1.getSelectedItem().toString());
        double resp = 0, i;
        
        if (rdn2.isSelected()) {
            resp = (Math.pow(1+(porcen/100),Math.abs(n)));
            lblRespuesta.setText(Double.toString(resp));
        } 
        if (rdn3.isSelected()) {
            resp =(Math.pow(1+(porcen/100),Math.abs(n)));
            lblRespuesta.setText(Double.toString(resp));
        }
        if (rdn6.isSelected()) {
            i = porcen/100;
            resp =((i *(Math.pow((1+i), n)))/(Math.pow((1+i),n)-1));
            lblRespuesta.setText(Double.toString(resp));
        }
        if (rdn7.isSelected()) {
            i = porcen/100;
            resp = ((Math.pow((1+i),n)-1)/(i*(Math.pow((1+i), n))));
            lblRespuesta.setText(Double.toString(resp));
        }
        
        if (rdn4.isSelected()) {
            i = porcen/100;
            resp =((i)/(Math.pow((1+i),n)-1));
            lblRespuesta.setText(Double.toString(resp));
        }
        
        if (rdn5.isSelected()) {
            i = porcen/100;
            resp = ((Math.pow((1+i),n)-1)/(i));
            lblRespuesta.setText(Double.toString(resp));
        }
        
        if (rdn8.isSelected()) {
            i = porcen/100;
            double p1, p2, p3, pf;
            
            p1 = Math.pow((1+i), n) - 1;
            p2 = i * Math.pow((1+i), n);
            p3 = n / Math.pow((1+i), n);
            pf = (p1/p2) -  p3;
            lblRespuesta.setText(Double.toString(pf)); 
        }
        
        if (rdn1.isSelected()) {
            i = porcen/100;
            double p1, p2, pf;
            
            p1 = 1 / i;
            p2 = n / (Math.pow((1+i), Math.abs(n)) - 1);
            pf = p1 -  p2;
        
            lblRespuesta.setText(Double.toString(pf));
        }
    }//GEN-LAST:event_btnEncontrarActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegActionPerformed

    private void rdn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBorrar;
    private javax.swing.ButtonGroup brGrupo;
    private javax.swing.JButton btnEncontrar;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox cmbA1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JRadioButton rdn1;
    private javax.swing.JRadioButton rdn2;
    private javax.swing.JRadioButton rdn3;
    private javax.swing.JRadioButton rdn4;
    private javax.swing.JRadioButton rdn5;
    private javax.swing.JRadioButton rdn6;
    private javax.swing.JRadioButton rdn7;
    private javax.swing.JRadioButton rdn8;
    private javax.swing.JTextField txtPorcen;
    // End of variables declaration//GEN-END:variables
}
