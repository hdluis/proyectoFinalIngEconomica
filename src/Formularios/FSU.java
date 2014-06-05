package Formularios;

import Formularios.PanelGrafico;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FSU extends javax.swing.JFrame {

    public FSU() {
        initComponents();
        btnReg.setOpaque(false);
        btnReg.setContentAreaFilled(false);
        btnReg.setBorderPainted(false);
    }

 void borrarCasillas()
{
    TxtA.setText(null); 
    TxtA2.setText(null); 
    TxtPorcentaje.setText(null); 
    TxtPorcentaje2.setText(null);
    lblResultado.setText("Resultado");
    lblResultado2.setText("Resultado");
    ComboAnio1.setSelectedItem("1");
    ComboAnio2.setSelectedItem("1");
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtA = new javax.swing.JTextField();
        TxtPorcentaje = new javax.swing.JTextField();
        ComboAnio1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonP = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtPorcentaje2 = new javax.swing.JTextField();
        ComboAnio2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblResultado2 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        BotonA = new javax.swing.JButton();
        TxtA2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnReg = new javax.swing.JButton();
        bntBorrar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(580, 350));
        setMinimumSize(new java.awt.Dimension(580, 350));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(TxtA);
        TxtA.setBounds(140, 100, 77, 30);
        getContentPane().add(TxtPorcentaje);
        TxtPorcentaje.setBounds(140, 130, 77, 30);

        ComboAnio1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        getContentPane().add(ComboAnio1);
        ComboAnio1.setBounds(140, 160, 77, 30);

        jLabel2.setText("Serie Uniforme A:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 104, 110, 20);

        jLabel3.setText("Porcentaje:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 130, 70, 30);

        jLabel4.setText("%");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(221, 130, 20, 20);

        jLabel5.setText("Resultado (P) =");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(46, 270, 90, 20);

        BotonP.setText("Calcular Valor  Presente (P)");
        BotonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPActionPerformed(evt);
            }
        });
        getContentPane().add(BotonP);
        BotonP.setBounds(33, 190, 190, 60);

        jLabel6.setText("Años:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 160, 40, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("P/A");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 70, 30, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("A/P");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 70, 30, 14);
        getContentPane().add(TxtPorcentaje2);
        TxtPorcentaje2.setBounds(390, 130, 77, 30);

        ComboAnio2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        getContentPane().add(ComboAnio2);
        ComboAnio2.setBounds(390, 160, 77, 30);

        jLabel9.setText("Pago Inicial P:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(294, 100, 80, 30);

        jLabel10.setText("Porcentaje:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(300, 130, 80, 30);

        jLabel11.setText("%");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(471, 134, 20, 20);

        lblResultado2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblResultado2.setText("Resultado");
        getContentPane().add(lblResultado2);
        lblResultado2.setBounds(380, 270, 90, 20);

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblResultado.setText("Resultado");
        getContentPane().add(lblResultado);
        lblResultado.setBounds(140, 270, 80, 20);

        BotonA.setText("Calcular Valor  Presente (A)");
        BotonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAActionPerformed(evt);
            }
        });
        getContentPane().add(BotonA);
        BotonA.setBounds(283, 190, 190, 60);
        getContentPane().add(TxtA2);
        TxtA2.setBounds(390, 100, 77, 30);

        jLabel13.setText("Años:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(330, 160, 41, 20);

        jLabel15.setText("Resultado (A)=");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(284, 270, 90, 20);

        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png"))); // NOI18N
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(510, 260, 50, 40);

        bntBorrar.setText("Borrar");
        bntBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(bntBorrar);
        bntBorrar.setBounds(490, 220, 70, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo8.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 580, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPActionPerformed
        try 
        {
            if (TxtA.getText()!="" && TxtPorcentaje.getText()!="")
            {
                double A = Double.parseDouble(TxtA.getText());
                double porcentaje = Double.parseDouble(TxtPorcentaje.getText());
                double i =porcentaje/100;
                int anio = Integer.parseInt(ComboAnio1.getSelectedItem().toString());
                double p =0;
                if(porcentaje>0) // por regla
                {
                    p=A*((Math.pow((1+i),anio)-1)/(i*(Math.pow((1+i), anio))));
                    float p2=(float)p;
                    lblResultado.setText(Float.toString(p2)); // mostramos el resultado en txtbox
                    // ahora preparamos las variables para mandar a graficar
                    int anioinicio=0, aniofinal=anio, TotalAnios=anio+1;
                    String[] Tipo = new String[25];
                     int[] Anio = new int [25];
                     double [] Cantidad = new double[25];
                     //asignamoms valores al evento en el año 0
                     Anio[anio+1]=0;
                     Cantidad[anio+1]=(int)p2;
                     Tipo[anio+1]="Salida";
                     //asignamos valores de A
                     for(int j=1;j<=anio;j++)
                     {
                         Anio[j]=j;
                         Cantidad[j]=A;
                         Tipo[j]="Entrada";
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
                JOptionPane.showConfirmDialog(null,"Por favor lleno todos los campos");
            }
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null,"Algo salio mal");
        }
        
    }//GEN-LAST:event_BotonPActionPerformed

    private void BotonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAActionPerformed
         try 
        {
            if (TxtA2.getText()!="" && TxtPorcentaje2.getText()!="")
            {
                double P = Double.parseDouble(TxtA2.getText());
                double porcentaje = Double.parseDouble(TxtPorcentaje2.getText());
                double i =porcentaje/100;
                int anio = Integer.parseInt(ComboAnio2.getSelectedItem().toString());
                double A =0;
                if(porcentaje>0) // por regla
                {
                    A=P*((i*(Math.pow((1+i), anio)))/(Math.pow((1+i),anio)-1));
                    float A2=(float)A;
                    lblResultado2.setText(Float.toString(A2)); // mostramos el resultado en txtbox
                    // ahora preparamos las variables para mandar a graficar
                    int anioinicio=0, aniofinal=anio, TotalAnios=anio+1;
                    String[] Tipo = new String[25];
                     int[] Anio = new int [25];
                     double [] Cantidad = new double[25];
                     //asignamoms valores al evento en el año 0
                     Anio[anio+1]=0;
                     Cantidad[anio+1]=P;
                     Tipo[anio+1]="Salida";
                     //asignamos valores de A
                     for(int j=1;j<=anio;j++)
                     {
                         Anio[j]=j;
                         Cantidad[j]=(int)A2;
                         Tipo[j]="Entrada";
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
                JOptionPane.showConfirmDialog(null,"Por favor lleno todos los campos");
            }
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null,"Algo salio mal");
        }
    }//GEN-LAST:event_BotonAActionPerformed

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
            java.util.logging.Logger.getLogger(FSU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FSU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FSU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FSU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FSU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonA;
    private javax.swing.JButton BotonP;
    private javax.swing.JComboBox ComboAnio1;
    private javax.swing.JComboBox ComboAnio2;
    private javax.swing.JTextField TxtA;
    private javax.swing.JTextField TxtA2;
    private javax.swing.JTextField TxtPorcentaje;
    private javax.swing.JTextField TxtPorcentaje2;
    private javax.swing.JButton bntBorrar;
    private javax.swing.JButton btnReg;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultado2;
    // End of variables declaration//GEN-END:variables
}
