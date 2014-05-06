package Formularios;
import java.awt.Color;
import java.awt.Graphics; 
import javax.swing.JPanel;

public class PanelGrafico  extends JPanel  {
    public int anio1, anio2, anios, porcentaje, contadoranios;
    public int Anio[];
    public String Tipo[];
    public double Cantidad[];
    public int TotalEventos;
    PanelGrafico  (int a1, int a2, double C[] , int A[], String T[], int TE) // Constructor
    {
        anio1=a1;
        anio2=a2;
        anios=anio2-anio1;
        Anio=A;
        Tipo=T;
        Cantidad=C;
        TotalEventos=TE;
    }
    @Override
    public void paintComponent( Graphics g )
   {
      super.paintComponent( g );    
      this.setBackground(Color.WHITE);
      int width = getWidth(); // total width   
      int height = getHeight(); // total height
      g.drawLine( 0, (height/2)-10, width, (height/2)-10 );
      // variables de apoyo
      porcentaje = 850/anios; // calculaos el espacio entre los anios
     contadoranios=anio1;
     //empezamos a graficar por años
      for(int i=0;i<=anios;i++)
      {
         g.drawLine(i*porcentaje, 280, i*porcentaje, 320); // lineas de años
         g.drawString(Integer.toString(contadoranios),(i*porcentaje)+5,270); // grafica los numeros de losaños
         
         contadoranios++;
      }
      //graficamos los eventos
      for(int i=1;i<=TotalEventos;i++)
      {
          if(Tipo[i] == "Entrada") // si es entrada graficamos para arriba
          {
              g.setColor(Color.GREEN);
              double Verticaldouble = (Cantidad[i]*300)/Mayor(Cantidad);
              int Vertical = (int)Verticaldouble;
              int posicion;
              if(anio1<0 && Anio[i]<0)
              {
                   posicion=anio1-Anio[i];
              }
              else
              {
                   posicion=anio1-Math.abs(Anio[i]);
              }
              g.drawLine(Math.abs(posicion)*porcentaje, 300, Math.abs(posicion)*porcentaje, 300-Vertical); // lineas de años
              g.drawString(Double.toString(Cantidad[i]),(Math.abs(posicion)*porcentaje)+5,300-(Vertical-10)); // grafica los numeros de losaños
            
          }
          else
          {
            if(Tipo[i] == "Salida") // si es entrada graficamos para arriba
            {
                  g.setColor(Color.red);
                double Verticaldouble = (Cantidad[i]*300)/Mayor(Cantidad);
                int Vertical = (int)Verticaldouble;
                int posicion;
              if(anio1<0 && Anio[i]<0)
              {
                   posicion=anio1-Anio[i];
              }
              else
              {
                   posicion=anio1-Math.abs(Anio[i]);
              }
                g.drawLine(Math.abs(posicion)*porcentaje,300, Math.abs(posicion)*porcentaje,300+ Vertical); // lineas de años
                g.drawString(Double.toString(Cantidad[i]),(Math.abs(posicion)*porcentaje)+5,300+(Vertical-20)); // grafica los numeros de losaños
                System.out.print(" linea"+ Vertical +" mayor "+Mayor(Cantidad));
            }
          }
      }
      
   } // end method paintComponent
    
    public double Mayor(double [] Cantidad)
    {
        double mayor = Cantidad[1];
        for(int i=1;i<=TotalEventos;i++)
        {
            if(Cantidad[i]>mayor)
                mayor=Cantidad[i];
        }
        return mayor;
        
    }
}
