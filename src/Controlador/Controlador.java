
package Controlador;
import Singleton.*;
import javax.swing.JOptionPane;

public class Controlador {

    public static void main(String[] args) {
        
        Singleton impresora = Singleton.getImpresora();
        
        
        Controlador menu = new Controlador();
        while(1 != 0){
            menu.mostrar_Menu();
            menu.mostrardatos();
        }
    }
    
    
    //LOGICA DE INTERFAZ GRÁFICA
    int opcion;
    
    public int mostrar_Menu(){
        String opcion_texto = JOptionPane.showInputDialog("Sistema de gestion de impresora" + 
                    "\n" + "Elija una opción: " + "\n" +
                    "1. Consultar datos impresora" + 
                    "\n" + "2. Salir");
        
        if (opcion_texto == null) {
            System.exit(0);   
        }
        try {
        opcion = Integer.parseInt(opcion_texto);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return mostrar_Menu();
        }
        return opcion;
    }
    
    
    public void mostrardatos(){
    	Singleton impresora = Singleton.getImpresora();

        if (opcion == 1){
                JOptionPane.showMessageDialog(null, impresora.getDatosImpresora());
            }
        if (opcion == 2){
                System.exit(0);     
            }
    }
}

