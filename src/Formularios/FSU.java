package Formularios;

import Formularios.PanelGrafico;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FSU extends javax.swing.JFrame {

    /**
     * Creates new form FSeriesUniformes
     */
    public FSU() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtA = new javax.swing.JTextField();
        TxtPorcentaje = new javax.swing.JTextField();
        ComboAnio1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonP = new javax.swing.JButton();
        TxtResultado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtPorcentaje2 = new javax.swing.JTextField();
        ComboAnio2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BotonA = new javax.swing.JButton();
        TxtResultado2 = new javax.swing.JTextField();
        TxtA2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnReg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Factores de Valor Presente  y recuperacion de capital en series uniformes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(103, 11, 364, 24);

        TxtA.setText("0.00");
        getContentPane().add(TxtA);
        TxtA.setBounds(199, 108, 77, 20);

        TxtPorcentaje.setText("6");
        getContentPane().add(TxtPorcentaje);
        TxtPorcentaje.setBounds(199, 128, 77, 20);

        ComboAnio1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(ComboAnio1);
        ComboAnio1.setBounds(199, 159, 77, 20);

        jLabel2.setText("Serie Uniforme A");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(87, 111, 94, 14);

        jLabel3.setText("Porcentaje");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(112, 131, 52, 14);

        jLabel4.setText("%");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(286, 131, 11, 14);

        jLabel5.setText("Resultado (P) =");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(85, 272, 76, 14);

        BotonP.setText("Calcular Valor  Presente (P)");
        BotonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPActionPerformed(evt);
            }
        });
        getContentPane().add(BotonP);
        BotonP.setBounds(87, 185, 173, 73);

        TxtResultado.setText("0");
        getContentPane().add(TxtResultado);
        TxtResultado.setBounds(171, 269, 105, 20);

        jLabel6.setText("Años");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 162, 41, 14);

        jLabel7.setText("P/A");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(151, 76, 30, 14);

        jLabel8.setText("A/P");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(396, 76, 30, 14);

        TxtPorcentaje2.setText("6");
        getContentPane().add(TxtPorcentaje2);
        TxtPorcentaje2.setBounds(449, 128, 77, 20);

        ComboAnio2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(ComboAnio2);
        ComboAnio2.setBounds(449, 159, 77, 20);

        jLabel9.setText("Pago Inicial P");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(337, 111, 94, 14);

        jLabel10.setText("Porcentaje");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(362, 131, 52, 14);

        jLabel11.setText("%");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(536, 131, 11, 14);

        jLabel12.setText("Resultado (A)=");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(355, 272, 74, 14);

        BotonA.setText("Calcular Valor  Presente (A)");
        BotonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAActionPerformed(evt);
            }
        });
        getContentPane().add(BotonA);
        BotonA.setBounds(353, 185, 173, 73);

        TxtResultado2.setText("0");
        getContentPane().add(TxtResultado2);
        TxtResultado2.setBounds(447, 269, 79, 20);

        TxtA2.setText("0.00");
        getContentPane().add(TxtA2);
        TxtA2.setBounds(449, 108, 77, 20);

        jLabel13.setText("Años");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(390, 162, 41, 14);

        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png"))); // NOI18N
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(550, 300, 50, 40);

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
                    TxtResultado.setText(Float.toString(p2)); // mostramos el resultado en txtbox
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
                    TxtResultado2.setText(Float.toString(A2)); // mostramos el resultado en txtbox
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
    private javax.swing.JTextField TxtResultado;
    private javax.swing.JTextField TxtResultado2;
    private javax.swing.JButton btnReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
