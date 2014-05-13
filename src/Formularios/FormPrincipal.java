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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnFlujoEfectivo = new javax.swing.JButton();
        btnValorDinero = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnInteres = new javax.swing.JButton();
        btnRegla = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BotonPdeA = new javax.swing.JButton();
        BotonFdeA = new javax.swing.JButton();
        botoninterpolacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingenieria Economica");
        setBackground(new java.awt.Color(0, 163, 232));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 523));
        setName("Ing Economica"); // NOI18N
        getContentPane().setLayout(null);

        btnFlujoEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ascendant6.png"))); // NOI18N
        btnFlujoEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlujoEfectivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFlujoEfectivo);
        btnFlujoEfectivo.setBounds(130, 120, 50, 50);

        btnValorDinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back3.png"))); // NOI18N
        btnValorDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValorDineroActionPerformed(evt);
            }
        });
        getContentPane().add(btnValorDinero);
        btnValorDinero.setBounds(250, 120, 50, 50);

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
        btnInteres.setBounds(130, 210, 50, 40);

        btnRegla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/person25.png"))); // NOI18N
        btnRegla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReglaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegla);
        btnRegla.setBounds(250, 200, 50, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(239, 241, 194));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Regla del 72"); // NOI18N
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 250, 70, 30);
        jLabel3.getAccessibleContext().setAccessibleName("Valor del Dinero \nen el Tiempo");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(239, 241, 194));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Flujo de Efectivo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 170, 110, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(239, 241, 194));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Valor del Dinero en el Tiempo"); // NOI18N
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 170, 170, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(239, 241, 194));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Interes"); // NOI18N
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 250, 50, 30);

        BotonPdeA.setText("P/A  &  A/P");
        BotonPdeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPdeAActionPerformed(evt);
            }
        });
        getContentPane().add(BotonPdeA);
        BotonPdeA.setBounds(460, 120, 90, 50);

        BotonFdeA.setText("F/A  & F/A");
        BotonFdeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFdeAActionPerformed(evt);
            }
        });
        getContentPane().add(BotonFdeA);
        BotonFdeA.setBounds(460, 200, 90, 40);

        botoninterpolacion.setText("Interpolacion");
        botoninterpolacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoninterpolacionActionPerformed(evt);
            }
        });
        getContentPane().add(botoninterpolacion);
        botoninterpolacion.setBounds(160, 490, 110, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 530);

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(null);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Herramientas del Sistema");

        jMenuItem1.setText("Graficadora Flujo de Efectivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-815)/2, (screenSize.height-585)/2, 815, 585);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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

    private void botoninterpolacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoninterpolacionActionPerformed
        interpolarizacion  interpolarizacion = new interpolarizacion ();
        interpolarizacion.setVisible(true);
    }//GEN-LAST:event_botoninterpolacionActionPerformed

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
    private javax.swing.JButton botoninterpolacion;
    private javax.swing.JButton btnFlujoEfectivo;
    private javax.swing.JButton btnInteres;
    private javax.swing.JButton btnRegla;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnValorDinero;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
