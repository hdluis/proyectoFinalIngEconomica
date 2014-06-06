package Formularios;

import Formularios.FlujoEfectivo;
import Formularios.ValorDinero;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
        
        //Botones Transparentes
        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
        
        btnValorDinero.setOpaque(false);
        btnValorDinero.setContentAreaFilled(false);
        btnValorDinero.setBorderPainted(false);
        
        btnFlujoEfectivo.setOpaque(false);
        btnFlujoEfectivo.setContentAreaFilled(false);
        btnFlujoEfectivo.setBorderPainted(false);
        
        btnInteres.setOpaque(false);
        btnInteres.setContentAreaFilled(false);
        btnInteres.setBorderPainted(false);
        
        btnRegla.setOpaque(false);
        btnRegla.setContentAreaFilled(false);
        btnRegla.setBorderPainted(false);
        
        btnInterpolacion.setOpaque(false);
        btnInterpolacion.setContentAreaFilled(false);
        btnInterpolacion.setBorderPainted(false);
        
        btnGrad.setOpaque(false);
        btnGrad.setContentAreaFilled(false);
        btnGrad.setBorderPainted(false);
        
        btnGradg.setOpaque(false);
        btnGradg.setContentAreaFilled(false);
        btnGradg.setBorderPainted(false);
        
        btnTasas.setOpaque(false);
        btnTasas.setContentAreaFilled(false);
        btnTasas.setBorderPainted(false);
        
        BotonFdeA.setOpaque(false);
        BotonFdeA.setContentAreaFilled(false);
        BotonFdeA.setBorderPainted(false);
        
        BotonPdeA.setOpaque(false);
        BotonPdeA.setContentAreaFilled(false);
        BotonPdeA.setBorderPainted(false);
        
        bntVAN.setOpaque(false);
        bntVAN.setContentAreaFilled(false);
        bntVAN.setBorderPainted(false);
        
        btnTIR.setOpaque(false);
        btnTIR.setContentAreaFilled(false);
        btnTIR.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFlujoEfectivo = new javax.swing.JButton();
        btnValorDinero = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnInteres = new javax.swing.JButton();
        btnRegla = new javax.swing.JButton();
        btnGradg = new javax.swing.JButton();
        btnGrad = new javax.swing.JButton();
        btnTasas = new javax.swing.JButton();
        bntVAN = new javax.swing.JButton();
        btnTIR = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BotonPdeA = new javax.swing.JButton();
        BotonFdeA = new javax.swing.JButton();
        btnInterpolacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingenieria Economica");
        setBackground(new java.awt.Color(0, 163, 232));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 523));
        setName("Ing Economica"); // NOI18N
        getContentPane().setLayout(null);

        btnFlujoEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ascendant6.png"))); // NOI18N
        btnFlujoEfectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFlujoEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlujoEfectivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFlujoEfectivo);
        btnFlujoEfectivo.setBounds(40, 110, 50, 50);

        btnValorDinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back3.png"))); // NOI18N
        btnValorDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValorDineroActionPerformed(evt);
            }
        });
        getContentPane().add(btnValorDinero);
        btnValorDinero.setBounds(150, 110, 60, 50);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/power70.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(730, 30, 50, 50);

        btnInteres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coins2.png"))); // NOI18N
        btnInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInteresActionPerformed(evt);
            }
        });
        getContentPane().add(btnInteres);
        btnInteres.setBounds(40, 200, 50, 40);

        btnRegla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/person25.png"))); // NOI18N
        btnRegla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReglaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegla);
        btnRegla.setBounds(150, 190, 50, 50);

        btnGradg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/graph2.png"))); // NOI18N
        btnGradg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradgActionPerformed(evt);
            }
        });
        getContentPane().add(btnGradg);
        btnGradg.setBounds(350, 190, 60, 50);

        btnGrad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/email10.png"))); // NOI18N
        btnGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrad);
        btnGrad.setBounds(260, 190, 60, 50);

        btnTasas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new3.png"))); // NOI18N
        btnTasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTasasActionPerformed(evt);
            }
        });
        getContentPane().add(btnTasas);
        btnTasas.setBounds(150, 270, 60, 50);

        bntVAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cabinet4.png"))); // NOI18N
        bntVAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVANActionPerformed(evt);
            }
        });
        getContentPane().add(bntVAN);
        bntVAN.setBounds(450, 110, 60, 50);

        btnTIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seo19.png"))); // NOI18N
        btnTIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTIRActionPerformed(evt);
            }
        });
        getContentPane().add(btnTIR);
        btnTIR.setBounds(550, 110, 60, 50);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(239, 241, 194));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TIR"); // NOI18N
        jLabel12.setToolTipText("");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(550, 160, 30, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(239, 241, 194));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("VAN"); // NOI18N
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(450, 160, 40, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(239, 241, 194));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tasas"); // NOI18N
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 320, 60, 30);
        jLabel3.getAccessibleContext().setAccessibleName("Valor del Dinero \nen el Tiempo");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(239, 241, 194));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Flujo de Efectivo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 160, 110, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(239, 241, 194));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Valor del Dinero"); // NOI18N
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 160, 90, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(239, 241, 194));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Interpolacion"); // NOI18N
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 320, 80, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(239, 241, 194));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Interes"); // NOI18N
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 240, 50, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(239, 241, 194));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Regla del 72"); // NOI18N
        jLabel8.setToolTipText("");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 240, 70, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(239, 241, 194));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Amortizaciones"); // NOI18N
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 160, 90, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(239, 241, 194));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Gradientes"); // NOI18N
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(260, 240, 70, 30);

        BotonPdeA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business90.png"))); // NOI18N
        BotonPdeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPdeAActionPerformed(evt);
            }
        });
        getContentPane().add(BotonPdeA);
        BotonPdeA.setBounds(260, 110, 60, 50);

        BotonFdeA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campaign2.png"))); // NOI18N
        BotonFdeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFdeAActionPerformed(evt);
            }
        });
        getContentPane().add(BotonFdeA);
        BotonFdeA.setBounds(350, 110, 60, 50);

        btnInterpolacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/businessman134.png"))); // NOI18N
        btnInterpolacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterpolacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnInterpolacion);
        btnInterpolacion.setBounds(40, 270, 60, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 550);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-815)/2, (screenSize.height-585)/2, 815, 585);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFlujoEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlujoEfectivoActionPerformed
    FlujoEfectivo formflujo = new FlujoEfectivo();
    
    formflujo.setVisible(true);
    }//GEN-LAST:event_btnFlujoEfectivoActionPerformed

    private void btnValorDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValorDineroActionPerformed
       ValorDinero formvalor = new ValorDinero();
       formvalor.setVisible(true);
    }//GEN-LAST:event_btnValorDineroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteresActionPerformed
       Interes formint = new Interes();
       formint.setVisible(true);
    }//GEN-LAST:event_btnInteresActionPerformed

    private void btnReglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReglaActionPerformed
       Regla72 formre = new Regla72();
       formre.setVisible(true);
    }//GEN-LAST:event_btnReglaActionPerformed

    private void BotonPdeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPdeAActionPerformed
       FSU  formularioF = new FSU();
       {
          formularioF.setVisible(true);
       }
    }//GEN-LAST:event_BotonPdeAActionPerformed

    private void BotonFdeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFdeAActionPerformed
        Amortizacion formamortizacion = new Amortizacion();
        formamortizacion.setVisible(true);
    }//GEN-LAST:event_BotonFdeAActionPerformed

    private void btnInterpolacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterpolacionActionPerformed
        Interpolacion  interpolarizacion = new Interpolacion ();
        interpolarizacion.setVisible(true);
    }//GEN-LAST:event_btnInterpolacionActionPerformed

    private void btnGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradActionPerformed
        Gradientes formgrad = new Gradientes();
        formgrad.setVisible(true);
    }//GEN-LAST:event_btnGradActionPerformed

    private void btnTasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTasasActionPerformed
        Tasas formtasas = new Tasas();
        formtasas.setVisible(true);
    }//GEN-LAST:event_btnTasasActionPerformed

    private void btnGradgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradgActionPerformed
        GradientesGeometricos formgradg = new GradientesGeometricos();
        formgradg.setVisible(true);
    }//GEN-LAST:event_btnGradgActionPerformed

    private void bntVANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVANActionPerformed
        VAN formv = new VAN();
        formv.setVisible(true);
    }//GEN-LAST:event_bntVANActionPerformed

    private void btnTIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTIRActionPerformed
        TIR formt = new TIR();
        formt.setVisible(true);
    }//GEN-LAST:event_btnTIRActionPerformed

    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
              
                new FormPrincipal().setVisible(true);
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFdeA;
    private javax.swing.JButton BotonPdeA;
    private javax.swing.JButton bntVAN;
    private javax.swing.JButton btnFlujoEfectivo;
    private javax.swing.JButton btnGrad;
    private javax.swing.JButton btnGradg;
    private javax.swing.JButton btnInteres;
    private javax.swing.JButton btnInterpolacion;
    private javax.swing.JButton btnRegla;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTIR;
    private javax.swing.JButton btnTasas;
    private javax.swing.JButton btnValorDinero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
