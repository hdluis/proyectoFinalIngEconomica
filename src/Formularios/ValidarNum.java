package Formularios;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;


public class ValidarNum {

      //CAJAS DE TEXTO SOLO NUMEROS
    public void sNumeros(JTextField a)
    {
      a.addKeyListener(new KeyAdapter() {
         public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               
               if(!Character.isDigit(c))
               {
                   //getToolkit().beep();
                   e.consume();
                }
         }
     
      });
      
    
    } //Fin sNumeros
}
