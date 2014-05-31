package Formularios;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GradientesGeometricos extends javax.swing.JFrame {
String vInt;
int vvInt;
    
    public GradientesGeometricos() {
        initComponents();
        btnReg.setOpaque(false);
        btnReg.setContentAreaFilled(false);
        btnReg.setBorderPainted(false);
        
        cmbGG.addItem("g=i");
        cmbGG.addItem("g=!i");
        
        txtGradiente.setVisible(false);
        jLabel2.setVisible(false);
        txtInteres.setVisible(false);
        jLabel14.setVisible(false);
        txtBase.setVisible(false);
        jLabel7.setVisible(false);
        cmbA1.setVisible(false);
        btnCalcular.setVisible(false);
    }

void borrarCasillas()
{
    txtGradiente.setText(null); 
    txtInteres.setText(null); 
    txtBase.setText(null); 
    lblRespuesta.setText("Resultado");
    cmbGG.setSelectedItem("Seleccionar");
    txtGradiente.setVisible(false);
    jLabel2.setVisible(false);
    txtInteres.setVisible(false);
    jLabel14.setVisible(false);
    txtBase.setVisible(false);
    jLabel7.setVisible(false);
    cmbA1.setVisible(false);
    btnCalcular.setVisible(false);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbGG = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtGradiente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        txtBase = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmbA1 = new javax.swing.JComboBox();
        btnCalcular = new javax.swing.JButton();
        lblRespuesta = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bntBorrar4 = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 270));
        setMinimumSize(new java.awt.Dimension(360, 270));
        setPreferredSize(new java.awt.Dimension(360, 270));
        setResizable(false);
        getContentPane().setLayout(null);

        cmbGG.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        cmbGG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGGActionPerformed(evt);
            }
        });
        getContentPane().add(cmbGG);
        cmbGG.setBounds(230, 60, 110, 30);

        jLabel3.setText("Tipo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 60, 40, 30);
        getContentPane().add(txtGradiente);
        txtGradiente.setBounds(90, 60, 64, 30);

        jLabel7.setText("Gradiente:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 60, 66, 30);

        jLabel2.setText("Interes:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 66, 30);
        getContentPane().add(txtInteres);
        txtInteres.setBounds(90, 90, 64, 30);
        getContentPane().add(txtBase);
        txtBase.setBounds(90, 120, 64, 30);

        jLabel14.setText("Base:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 120, 50, 30);

        cmbA1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(cmbA1);
        cmbA1.setBounds(70, 150, 90, 30);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(70, 180, 90, 30);

        lblRespuesta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRespuesta.setText("Respueta");
        getContentPane().add(lblRespuesta);
        lblRespuesta.setBounds(100, 210, 130, 20);

        jLabel12.setText("Resultado:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 210, 60, 20);

        bntBorrar4.setText("Borrar");
        bntBorrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBorrar4ActionPerformed(evt);
            }
        });
        getContentPane().add(bntBorrar4);
        bntBorrar4.setBounds(270, 150, 70, 30);

        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png"))); // NOI18N
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(280, 190, 60, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo11.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 360, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double inte, i, gra, p1, p2, p3, pf, bas=0;

        if (txtBase.getText()!="")
        {
            bas = Double.parseDouble(txtBase.getText().toString());
        }

        try
        {
    if (vInt == "g=!i")
        {

            if (txtGradiente.getText()!="" && txtInteres.getText()!="")
            {
                gra = Double.parseDouble(txtGradiente.getText().toString());
                inte = Double.parseDouble(txtInteres.getText().toString());
                int n = Integer.parseInt(cmbA1.getSelectedItem().toString());
                i = inte/100;
                
                p1 = (1+gra)/(1+i);
                p2 = 1 - (Math.pow(p1, n));
                p3 = i-gra;
                pf = p2/p3;
                
                lblRespuesta.setText(Double.toString(pf));
                
                // ahora preparamos las variables para mandar a graficar
                int anioinicio=0, aniofinal=n, TotalAnios=n+1;
                String[] Tipo = new String[25];
                int[] Anio = new int [25];
                double [] Cantidad = new double[25];

                //asignamoms valores al evento en el año 0
                Anio[n+1]=0;
                Cantidad[n+1]=pf;
                Tipo[n+1]="Entrada";
                //asignamos valores de A
                for(int j=1;j<=n;j++)
                {
                    Anio[j]=j;
                    Cantidad[j]=bas+(gra*j);
                    Tipo[j]="Salida";
                }
                PanelGrafico  Panel = new PanelGrafico(anioinicio,aniofinal, Cantidad,Anio,Tipo,TotalAnios);
                JFrame Formulario = new JFrame();
                Formulario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Formulario.add(Panel);
                Formulario.setResizable(false);
                Formulario.setSize(950, 650);

                Formulario.setVisible(true);
            }
        }
            else
            {
                JOptionPane.showConfirmDialog(null,"Por favor llene todos los campos");
            }
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null,"Algo salio mal :( ");
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void bntBorrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBorrar4ActionPerformed
        borrarCasillas();
    }//GEN-LAST:event_bntBorrar4ActionPerformed

    private void cmbGGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGGActionPerformed
        vInt = cmbGG.getSelectedItem().toString();
        if (vInt == "g=!i")
        {
            vvInt = 1;
            txtGradiente.setVisible(true);
            jLabel2.setVisible(true);
            txtInteres.setVisible(true);
            jLabel14.setVisible(true);
            txtBase.setVisible(true);
            jLabel7.setVisible(true);
            cmbA1.setVisible(true);
            btnCalcular.setVisible(true);
        }
        if (vInt == "g=i")
        {
            vvInt = 2;
            txtGradiente.setVisible(false);
            jLabel2.setVisible(true);
            txtInteres.setVisible(true);
            jLabel14.setVisible(true);
            txtBase.setVisible(true);
            jLabel7.setVisible(false);
            cmbA1.setVisible(true);
            btnCalcular.setVisible(true);
        }
    }//GEN-LAST:event_cmbGGActionPerformed

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
            java.util.logging.Logger.getLogger(GradientesGeometricos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradientesGeometricos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradientesGeometricos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradientesGeometricos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradientesGeometricos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBorrar4;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox cmbA1;
    private javax.swing.JComboBox cmbGG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtGradiente;
    private javax.swing.JTextField txtInteres;
    // End of variables declaration//GEN-END:variables
}
