
package Controlador;
import Singleton.*;
import javax.swing.JOptionPane;

public class Controlador {

    public static void main(String[] args) {
        
        Singleton impresora = Singleton.getImpresora();
        
        while(1 != 0){
            
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Sistema de gestion de impresora" + 
                    "\n" + "Elija una opción: " + "\n" +
                    "1. Consultar datos impresora" + 
                    "\n" + "2. Salir"));
            
            if (opcion == 1){
                JOptionPane.showMessageDialog(null, impresora.getDatosImpresora());
            }
            if (opcion == 2){
                System.exit(0);
            }
        }

    }
    
}
