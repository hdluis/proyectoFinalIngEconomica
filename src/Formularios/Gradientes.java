package Formularios;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gradientes extends javax.swing.JFrame {


    public Gradientes() {
        initComponents();
        btnReg.setOpaque(false);
        btnReg.setContentAreaFilled(false);
        btnReg.setBorderPainted(false);
    }

void borrarCasillas()
{
    txtGradiente.setText(null); 
    txtGradiente2.setText(null); 
    txtGradiente3.setText(null); 
    txtInteres.setText(null); 
    txtInteres2.setText(null); 
    txtInteres3.setText(null); 
    txtBase.setText(null); 
    txtBase2.setText(null); 
    txtBase3.setText(null); 
    lblRespuesta.setText("Resultado");
    lblRespuesta2.setText("Resultado");
    lblRespuesta3.setText("Resultado");
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtGradiente = new javax.swing.JTextField();
        cmbA1 = new javax.swing.JComboBox();
        txtInteres = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtBase2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnCalcular3 = new javax.swing.JButton();
        txtGradiente3 = new javax.swing.JTextField();
        cmbA3 = new javax.swing.JComboBox();
        txtInteres3 = new javax.swing.JTextField();
        bntBorrar4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        txtBase3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRespuesta3 = new javax.swing.JLabel();
        btnFlujoGradiente = new javax.swing.JButton();
        btnGrad1 = new javax.swing.JButton();
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
        btnCalcular.setBounds(70, 210, 90, 23);

        jLabel19.setText("%");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(480, 120, 20, 30);

        jLabel18.setText("%");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(310, 120, 20, 30);
        getContentPane().add(txtGradiente);
        txtGradiente.setBounds(90, 90, 64, 30);

        cmbA1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(cmbA1);
        cmbA1.setBounds(59, 180, 100, 30);
        getContentPane().add(txtInteres);
        txtInteres.setBounds(90, 120, 64, 30);

        jLabel17.setText("%");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(160, 120, 20, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("F/G");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 60, 30, 14);

        jLabel2.setText("Interes:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 120, 66, 30);

        lblRespuesta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRespuesta.setText("Respueta");
        getContentPane().add(lblRespuesta);
        lblRespuesta.setBounds(90, 240, 70, 20);

        btnCalcular2.setText("Calcular");
        btnCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular2);
        btnCalcular2.setBounds(211, 210, 90, 23);
        getContentPane().add(txtGradiente2);
        txtGradiente2.setBounds(240, 90, 64, 30);

        cmbA2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(cmbA2);
        cmbA2.setBounds(200, 180, 100, 30);
        getContentPane().add(txtInteres2);
        txtInteres2.setBounds(240, 120, 64, 30);

        jLabel3.setText("Gradiente:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 90, 66, 14);

        jLabel4.setText("Resultado:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 240, 80, 20);

        lblRespuesta2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRespuesta2.setText("Respueta");
        getContentPane().add(lblRespuesta2);
        lblRespuesta2.setBounds(240, 240, 71, 20);

        jLabel11.setText("Interes:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(181, 120, 60, 30);

        jLabel12.setText("Resultado:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(26, 240, 60, 20);

        jLabel13.setText("Resultado:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(170, 240, 66, 20);
        getContentPane().add(txtBase2);
        txtBase2.setBounds(240, 150, 64, 30);

        jLabel15.setText("Base:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(190, 150, 50, 20);

        btnCalcular3.setText("Calcular");
        btnCalcular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular3);
        btnCalcular3.setBounds(381, 210, 90, 23);
        getContentPane().add(txtGradiente3);
        txtGradiente3.setBounds(410, 90, 64, 30);

        cmbA3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(cmbA3);
        cmbA3.setBounds(369, 180, 100, 30);
        getContentPane().add(txtInteres3);
        txtInteres3.setBounds(410, 120, 64, 30);

        bntBorrar4.setText("Borrar");
        bntBorrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBorrar4ActionPerformed(evt);
            }
        });
        getContentPane().add(bntBorrar4);
        bntBorrar4.setBounds(490, 220, 70, 30);

        jLabel14.setText("Base:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 150, 50, 30);
        getContentPane().add(txtBase);
        txtBase.setBounds(90, 150, 64, 30);
        getContentPane().add(txtBase3);
        txtBase3.setBounds(410, 150, 64, 30);

        jLabel16.setText("Base:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(360, 150, 50, 20);

        jLabel5.setText("Gradiente:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(340, 90, 66, 14);

        jLabel6.setText("Interes:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(346, 120, 60, 30);

        lblRespuesta3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRespuesta3.setText("Respueta");
        getContentPane().add(lblRespuesta3);
        lblRespuesta3.setBounds(410, 240, 71, 20);

        btnFlujoGradiente.setText("Encontrar Flujo Efectivo");
        btnFlujoGradiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlujoGradienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnFlujoGradiente);
        btnFlujoGradiente.setBounds(200, 270, 160, 30);

        btnGrad1.setText("Encontrar Gradiente");
        btnGrad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrad1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrad1);
        btnGrad1.setBounds(40, 270, 140, 30);

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("P/G");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 60, 30, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("A/G");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 60, 30, 14);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo9.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 580, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double gra = Double.parseDouble(txtGradiente.getText().toString());
        double inte = Double.parseDouble(txtInteres.getText().toString());
        double bas = 0;
        int n = Integer.parseInt(cmbA1.getSelectedItem().toString());
        double p1, p2, p3, pf = 0;
        double i = (inte/100);
        
        if (txtBase.getText()!="")
            {
                bas = Double.parseDouble(txtBase.getText().toString());
            }
        
        try
        {
            if (txtGradiente.getText()!="" && txtInteres.getText()!="")
            {
        p1 = Math.pow((1+i), Math.abs(n)) - 1;
        p2 = i * Math.pow((1+i), Math.abs(n));
        p3 = n / Math.pow((1+i), Math.abs(n));
        pf = (gra/i) * ((p1/p2) -  p3);
        lblRespuesta.setText(Double.toString(pf));
         // ahora preparamos las variables para mandar a graficar
                    int anioinicio=0, aniofinal=n, TotalAnios=n+1;
                    String[] Tipo = new String[25];
                    int[] Anio = new int [25];
                    double [] Cantidad = new double[25];
                    
                    //asignamoms valores al evento en el año 0
                     Anio[n+1]=0;
                     Cantidad[n+1]=(int)pf;
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
            else
            {
                JOptionPane.showConfirmDialog(null,"Por favor llene todos los campos");
            }
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null,"Algo salio mal :( ");
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular2ActionPerformed
        try 
        {
            if (txtGradiente2.getText()!="" && txtInteres2.getText()!="")
            {
                
        double gra = Double.parseDouble(txtGradiente2.getText().toString());
        double inte = Double.parseDouble(txtInteres2.getText().toString());
        double bas = 0;
        int n = Integer.parseInt(cmbA2.getSelectedItem().toString());
        double p1, p2, pf = 0;
        double i = (inte/100);
        
        if (txtBase2.getText()!="")
            {
                bas =Double.parseDouble(txtBase2.getText().toString());
            }
        
        p1 = 1 / i;;
        p2 = n / (Math.pow((1+i), Math.abs(n)) - 1);
        pf = gra * (p1 -  p2);
        
        lblRespuesta2.setText(Double.toString(pf));
        
        // ahora preparamos las variables para mandar a graficar
                    int anioinicio=0, aniofinal=n, TotalAnios=n+1;
                    String[] Tipo = new String[25];
                     int[] Anio = new int [25];
                     double [] Cantidad = new double[25];
                     //asignamoms valores al evento en el año 0
                     Anio[n+1]=0;
                     Cantidad[n+1]=gra;
                     Tipo[n+1]="Entrada";
                     //asignamos valores de A
                     for(int j=1;j<=n;j++)
                     {
                         Anio[j]=j;
                         Cantidad[j]=(int)pf;
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
            else
            {
                JOptionPane.showConfirmDialog(null,"Por favor llene todos los campos");
            }
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null,"Algo salio mal :(");
        }
    }//GEN-LAST:event_btnCalcular2ActionPerformed

    private void btnCalcular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular3ActionPerformed
            try
            {
            if (txtGradiente3.getText()!="" && txtInteres3.getText()!="")
            {
        double gra = Double.parseDouble(txtGradiente3.getText().toString());
        double inte = Double.parseDouble(txtInteres3.getText().toString());
        int n = Integer.parseInt(cmbA3.getSelectedItem().toString());
        double bas = 0;
        double p1, p2, p3, pf = 0;
        double i = (inte/100);
        
        if (txtBase3.getText()!="")
            {
                bas =Double.parseDouble(txtBase3.getText().toString());
            }
        
        p1 = 1 / i;
        p2 = (Math.pow((1+i), Math.abs(n)) - 1);
        p3 = (p2 / i) - n;
        pf = gra * (p1 *  p3);
        
        lblRespuesta3.setText(Double.toString(pf));
        
         // ahora preparamos las variables para mandar a graficar
                    int anioinicio=0, aniofinal=n, TotalAnios=n+1;
                    String[] Tipo = new String[25];
                    int[] Anio = new int [25];
                    double [] Cantidad = new double[25];
                    
                    //asignamoms valores al evento en el año 0
                    Anio[n+1]=n;
                    Cantidad[n+1]=pf;
                    Tipo[n+1]="Entrada";
                    //asignamos valores de A
                    for(int j=1;j<=n;j++)
                    {
                        Anio[j]=j;
                        Cantidad[j]=(int)bas+(gra*j);
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
            else
            {
                JOptionPane.showConfirmDialog(null,"Por favor llene todos los campos");
            }
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null,"Algo salio mal :(");
        }
    }//GEN-LAST:event_btnCalcular3ActionPerformed

    private void bntBorrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBorrar4ActionPerformed
        borrarCasillas();
    }//GEN-LAST:event_bntBorrar4ActionPerformed

    private void btnGrad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrad1ActionPerformed
        JTextField  cant1 = new JTextField(); // textbox para cantidad
        JTextField  cant2 = new JTextField();
        JTextField  tiempo = new JTextField();
        int result = 0;
        Object[] mensaje =  {    //objeto con los controles pa el inputdialog
                "Cantidad Final", cant1, "Cantidad Inicial", cant2, "Periodos", tiempo
            };
        int Opcion = JOptionPane.showConfirmDialog(null, mensaje,"Encontrando el Gradiente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if(Opcion==JOptionPane.OK_OPTION) // si el usiario presiona aceptar
                {
                    int DialogCantidad=Integer.parseInt(cant1.getText());
                    int DialogCantidad2=Integer.parseInt(cant2.getText());
                    int DialogTiempo=Integer.parseInt(tiempo.getText());
                    
                    result = (DialogCantidad - DialogCantidad2) /(DialogTiempo-1);
                    JOptionPane.showMessageDialog(null, "El resultado del Gradiante es: "+ result);
                }
    }//GEN-LAST:event_btnGrad1ActionPerformed

    private void btnFlujoGradienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlujoGradienteActionPerformed
        JTextField  base = new JTextField(); // textbox para cantidad
        JTextField  grad = new JTextField();
        JTextField  tiempo = new JTextField();
        int result = 0;
        Object[] mensaje =  {    //objeto con los controles pa el inputdialog
                "Base: ", base, "Gradiente: ", grad, "Periodos: ", tiempo
            };
        int Opcion = JOptionPane.showConfirmDialog(null, mensaje,"Encontrando el Valor del Flujo de Efectivo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if(Opcion==JOptionPane.OK_OPTION) // si el usiario presiona aceptar
                {
                    int DialogCantidad=Integer.parseInt(base.getText());
                    int DialogCantidad2=Integer.parseInt(grad.getText());
                    int DialogTiempo=Integer.parseInt(tiempo.getText());
                    
                    result = (DialogCantidad + (DialogTiempo-1) + DialogCantidad2);
                    JOptionPane.showMessageDialog(null, "El Valor del Futuro de Efectivo es: "+ result);
                }
    }//GEN-LAST:event_btnFlujoGradienteActionPerformed

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
    private javax.swing.JButton bntBorrar4;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcular2;
    private javax.swing.JButton btnCalcular3;
    private javax.swing.JButton btnFlujoGradiente;
    private javax.swing.JButton btnGrad1;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox cmbA1;
    private javax.swing.JComboBox cmbA2;
    private javax.swing.JComboBox cmbA3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtBase2;
    private javax.swing.JTextField txtBase3;
    private javax.swing.JTextField txtGradiente;
    private javax.swing.JTextField txtGradiente2;
    private javax.swing.JTextField txtGradiente3;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtInteres2;
    private javax.swing.JTextField txtInteres3;
    // End of variables declaration//GEN-END:variables
}
