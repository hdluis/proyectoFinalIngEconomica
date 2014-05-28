package Formularios;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FlujoEfectivo extends javax.swing.JFrame {

    /**
     * Creates new form FlujoEfectivo
     */
    public FlujoEfectivo() {
        initComponents();
        
        btnReg.setOpaque(false);
        btnReg.setContentAreaFilled(false);
        btnReg.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        BotonGraficar = new javax.swing.JButton();
        ComboAnio1 = new javax.swing.JComboBox();
        ComboAnio2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboEventos = new javax.swing.JComboBox();
        btnReg = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("Año Final");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 270));
        setMinimumSize(new java.awt.Dimension(360, 270));
        setPreferredSize(new java.awt.Dimension(360, 270));
        setResizable(false);
        getContentPane().setLayout(null);

        BotonGraficar.setText("Empezar a Graficar");
        BotonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGraficarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGraficar);
        BotonGraficar.setBounds(193, 80, 140, 50);

        ComboAnio1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-10", "-9", "-8", "-7", "-6", "-5", "-5", "-4", "-3", "-2", "-1", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        ComboAnio1.setSelectedIndex(11);
        ComboAnio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAnio1ActionPerformed(evt);
            }
        });
        getContentPane().add(ComboAnio1);
        ComboAnio1.setBounds(20, 90, 70, 30);

        ComboAnio2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-10", "-9", "-8", "-7", "-6", "-5", "-5", "-4", "-3", "-2", "-1", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        ComboAnio2.setSelectedIndex(16);
        getContentPane().add(ComboAnio2);
        ComboAnio2.setBounds(90, 90, 60, 30);

        jLabel1.setText("Año de Inicio");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 70, 70, 20);

        jLabel3.setText("Numero de Eventos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 100, 20);

        ComboEventos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        getContentPane().add(ComboEventos);
        ComboEventos.setBounds(20, 140, 50, 30);

        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png"))); // NOI18N
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(280, 180, 50, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo7.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 360, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGraficarActionPerformed
        try { // intentamos mandar a graficar
            // CODIGO DE ANIOS
            int anio1= Integer.parseInt(ComboAnio1.getSelectedItem().toString()); // leemos los combos
            int anio2= Integer.parseInt(ComboAnio2.getSelectedItem().toString());
            if(anio2<anio1 || anio2==anio1) // validamos el rango de años
            {
                JOptionPane.showMessageDialog(null,"El año 1 debe ser MENOR que el año 2");
                return; //  salios ddel programa
            }
            // Definicion de los datos
            int Eventos =Integer.parseInt(ComboEventos.getSelectedItem().toString()); // total de Eventos del usuario
            String[] Tipo = new String[25];
            int[] Anio = new int [25];
            double [] Cantidad = new double[25];
            int TotalEventos=0;
            // CODIGO DE LOS EVENTOS DE LOS ANIOS //Preparamos el dialog de java
            JTextField  TxtCantidad = new JTextField(); // textbox para cantidad
            JComboBox ComboTipo = new JComboBox(); // combo para el tipo
            ComboTipo.addItem("Entrada"); // isertamos los tipos
            ComboTipo.addItem("Salida");

            JComboBox ComboAnio = new JComboBox(); // combo para el anio
            for(int i =anio1; i<=anio2;i++) // llenamos el combo
            ComboAnio.addItem(i);

            Object[] mensaje =  {    //objeto con los controles pa el inputdialog
                "Cantidad", TxtCantidad, "Tipo", ComboTipo, "Año", ComboAnio
            };
            for(int i=1;i<=Eventos;i++) // for dependiendo del Num de Eventos q ingreso e usuario
            {
                // respuesta de aceptar o cancelar del usuario
                int Opcion = JOptionPane.showConfirmDialog(null, mensaje,"Nuevo Evento de Dinero", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if(Opcion==JOptionPane.OK_OPTION) // si el usiario preciona aceptar
                {
                    // jalamos los datos del dialog a variables
                    int DialogAnio=Integer.parseInt(ComboAnio.getSelectedItem().toString());
                    String DialogTipo=ComboTipo.getSelectedItem().toString();
                    double DialogCantidad=Double.parseDouble(TxtCantidad.getText());
                    if(TotalEventos==0) // si el total de evenos realizados esta vacio insertamos nuevo
                    {
                        TotalEventos++; //insertamos el primero de la lista
                        Tipo[TotalEventos]=DialogTipo;
                        Anio[TotalEventos]=DialogAnio;
                        Cantidad[TotalEventos]=DialogCantidad;
                    }
                    else // de lo contrario buscamos si ya ai un evento en el mismo anio
                    {
                        int AnioBuscado=3000; // 3000 es un valor pasa saber q no se encontro
                        for(int j=1;j<=TotalEventos;j++) //revisamos los anteriores
                        {
                            if(Anio[j]==DialogAnio)
                            {
                                AnioBuscado=j;
                            }
                        }
                        if(AnioBuscado==3000) // si no se encontro nada insertaos
                        {
                            TotalEventos++; //insertamos el primero de la lista
                            Tipo[TotalEventos]=DialogTipo;
                            Anio[TotalEventos]=DialogAnio;
                            Cantidad[TotalEventos]=DialogCantidad;
                        }
                        else // si si se encontro un anio entonces teneos que actualizarlo
                        {
                            if(Tipo[AnioBuscado]==DialogTipo) // si son del mismo tipo solo se suman y ya
                            {
                                Cantidad[AnioBuscado]+=DialogCantidad; // Actualizamos  el cantidad

                            }
                            else //si son diferentes lo restamos
                            {
                                // aqui viene mas codigo si son diferentes
                                if(Cantidad[AnioBuscado]>DialogCantidad)
                                {
                                    Cantidad[AnioBuscado]=Cantidad[AnioBuscado]-DialogCantidad;
                                }
                                else
                                {
                                    if(Cantidad[AnioBuscado]<DialogCantidad)
                                    {
                                        Cantidad[AnioBuscado]=DialogCantidad-Cantidad[AnioBuscado];
                                        Tipo[AnioBuscado]=DialogTipo;
                                    }
                                    else
                                    {
                                        Cantidad[AnioBuscado]=0;
                                    }
                                }
                            }
                        }
                    }
                }
                else // el usuario a precionado cancelar
                {
                    return; // salimos del for
                }
            }
            //Mandamos los datos a la maquina graficadora powerfull D
            PanelGrafico Panel = new PanelGrafico(anio1,anio2,Cantidad, Anio, Tipo, TotalEventos);
            JFrame Formulario = new JFrame();
            Formulario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Formulario.add(Panel);
            Formulario.setResizable(false);
            Formulario.setSize(950, 650);

            Formulario.setVisible(true);

            // codig temporal para ver las salidas
            for(int i=1;i<=TotalEventos;i++)
            System.out.print("Cantidad: "+Cantidad[i]+" Tipo:"+Tipo[i]+" Año"+Anio[i]+" \n");
        }
        catch (Exception e) // si algo salio mal
        {
            JOptionPane.showMessageDialog(null,"algo salio mal :( ");
        }
    }//GEN-LAST:event_BotonGraficarActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegActionPerformed

    private void ComboAnio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAnio1ActionPerformed
        
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
            java.util.logging.Logger.getLogger(FlujoEfectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlujoEfectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlujoEfectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlujoEfectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlujoEfectivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGraficar;
    private javax.swing.JComboBox ComboAnio1;
    private javax.swing.JComboBox ComboAnio2;
    private javax.swing.JComboBox ComboEventos;
    private javax.swing.JButton btnReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
