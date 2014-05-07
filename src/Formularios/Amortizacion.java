package Formularios;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Amortizacion extends javax.swing.JFrame {

    public Amortizacion() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboAnio2 = new javax.swing.JComboBox();
        TxtA = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtPorcentaje = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ComboAnio1 = new javax.swing.JComboBox();
        TxtPorcentaje2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BotonF = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        TxtResultado = new javax.swing.JTextField();
        TxtA2 = new javax.swing.JTextField();
        TxtResultado2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BotonA = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboAnio2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        jLabel9.setText("Pago Inicial F");

        jLabel8.setText("F/A");

        ComboAnio1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        ComboAnio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAnio1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Serie Uniforme A");

        jLabel12.setText("Resultado (A)=");

        jLabel3.setText("Porcentaje");

        jLabel4.setText("%");

        jLabel10.setText("Porcentaje");

        jLabel5.setText("Resultado (F) =");

        jLabel11.setText("%");

        BotonF.setText("Calcular Valor  Futuro (F)");
        BotonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFActionPerformed(evt);
            }
        });

        jLabel13.setText("Años");

        jLabel7.setText("A/F");

        BotonA.setText("Calcular Valor  Presente (A)");
        BotonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAActionPerformed(evt);
            }
        });

        jLabel6.setText("Años");

        jLabel1.setText("Amortizaciones y Factor de Series Uniformes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(BotonF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(132, 132, 132))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(35, 35, 35))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TxtPorcentaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComboAnio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(TxtA, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtResultado)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(35, 35, 35))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TxtPorcentaje2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComboAnio2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtResultado2))
                                    .addComponent(BotonA, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtA2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel11)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(60, 60, 60)
                .addComponent(BotonF, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(TxtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ComboAnio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGap(90, 90, 90)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TxtA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtPorcentaje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ComboAnio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BotonA, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))))
                    .addContainerGap(63, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFActionPerformed
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
                    p=A*((Math.pow((1+i),anio)-1)/(i));
                    float p2=(float)p;
                    TxtResultado.setText(Float.toString(p2)); // mostramos el resultado en txtbox
                    // ahora preparamos las variables para mandar a graficar
                    int anioinicio=0, aniofinal=anio, TotalAnios=anio+1;
                    String[] Tipo = new String[25];
                    int[] Anio = new int [25];
                    double [] Cantidad = new double[25];
                    //asignamoms valores al evento en el año 0
                    Anio[anio+1]=anio;
                    Cantidad[anio+1]=(int)p2;
                    Tipo[anio+1]="Entrada";
                    //asignamos valores de A
                    for(int j=1;j<=anio;j++)
                    {
                        Anio[j]=j;
                        Cantidad[j]=A;
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
                JOptionPane.showConfirmDialog(null,"Por favor lleno todos los campos");
            }
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null,"Algo salio mal");
        }

    }//GEN-LAST:event_BotonFActionPerformed

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
                    A=P*((i)/(Math.pow((1+i),anio)-1));
                    float A2=(float)A;
                    TxtResultado2.setText(Float.toString(A2)); // mostramos el resultado en txtbox
                    // ahora preparamos las variables para mandar a graficar
                    int anioinicio=0, aniofinal=anio, TotalAnios=anio+1;
                    String[] Tipo = new String[25];
                    int[] Anio = new int [25];
                    double [] Cantidad = new double[25];
                    //asignamoms valores al evento en el año 0
                    Anio[anio+1]=anio;
                    Cantidad[anio+1]=P;
                    Tipo[anio+1]="Entrada";
                    //asignamos valores de A
                    for(int j=1;j<=anio;j++)
                    {
                        Anio[j]=j;
                        Cantidad[j]=(int)A2;
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
                JOptionPane.showConfirmDialog(null,"Por favor lleno todos los campos");
            }
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null,"Algo salio mal");
        }
    }//GEN-LAST:event_BotonAActionPerformed

    private void ComboAnio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAnio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboAnio1ActionPerformed

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
            java.util.logging.Logger.getLogger(Amortizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Amortizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Amortizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Amortizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Amortizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonA;
    private javax.swing.JButton BotonF;
    private javax.swing.JComboBox ComboAnio1;
    private javax.swing.JComboBox ComboAnio2;
    private javax.swing.JTextField TxtA;
    private javax.swing.JTextField TxtA2;
    private javax.swing.JTextField TxtPorcentaje;
    private javax.swing.JTextField TxtPorcentaje2;
    private javax.swing.JTextField TxtResultado;
    private javax.swing.JTextField TxtResultado2;
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
