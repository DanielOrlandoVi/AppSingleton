
package Controlador;
import Singleton.*;
import javax.swing.JOptionPane;

public class Controlador {
    
    // Método para mostrar el menú al usuario y obtener su elección
    private int mostrarMenu() {
        // Mostrar el menú utilizando un cuadro de diálogo de entrada
        String opcionTexto = JOptionPane.showInputDialog(
            "Sistema de gestión de impresora\n" +
            "Elija una opción:\n" +
            "1. Consultar datos impresora\n" +
            "2. Encender impresora\n" +
            "3. Apagar impresora\n" +
            "4. Imprimir documento\n" +
            "5. Reemplazar cartucho de tinta\n" +
            "6. Salir"
        );
        
        // Salir del programa si el usuario presiona cancelar o cierra la ventana
        if (opcionTexto == null) {
            System.exit(0);
        }
        
        // Convertir la opción de texto a un número entero
        try {
            return Integer.parseInt(opcionTexto);
        } catch (NumberFormatException e) {
            // Mostrar un mensaje de error si el usuario ingresa un valor no válido
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            // Llamar recursivamente al método para mostrar el menú nuevamente
            return mostrarMenu();
        }
    }
    
    // Método principal para manejar la interacción con el usuario
    public static void main(String[] args) {
        // Crear una instancia del controlador
        Controlador controlador = new Controlador();
        // Obtener la instancia única de la impresora
        Singleton impresora = Singleton.getImpresora();
        // Ciclo de interacción con el usuario
        while (true) {
            // Mostrar el menú y obtener la opción seleccionada por el usuario
            int opcion = controlador.mostrarMenu();
            // Ejecutar la opción seleccionada por el usuario
            switch (opcion) {
                case 1:
                    // Consultar y mostrar los datos de la impresora
                    JOptionPane.showMessageDialog(null, impresora.getDatosImpresora());
                    break;
                case 2:
                    // Encender la impresora
                    impresora.encenderImpresora();
                    break;
                case 3:
                    // Apagar la impresora
                    impresora.apagarImpresora();
                    break;
                case 4:
                    // Imprimir un documento
                    impresora.imprimirDocumento();
                    break;
                case 5:
                    // Reemplazar el cartucho de tinta
                    impresora.reemplazarCartucho();
                    break;
                case 6:
                    // Salir del programa
                    System.exit(0);
                    break;
                default:
                    // Mostrar un mensaje de error si la opción ingresada no es válida
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}