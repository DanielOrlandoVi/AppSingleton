
package Singleton;
import javax.swing.JOptionPane;

public class Singleton {
    
    private static Singleton impresora; // Instancia única de la impresora
    private boolean enFuncionamiento; // Estado de funcionamiento de la impresora
    private int nivelTinta; // Nivel de tinta de la impresora
    
    // Constructor privado para evitar instanciación externa
    private Singleton() {
        // Se simula la inicialización de la impresora
        enFuncionamiento = true;
        nivelTinta = 100;
    }
    
    // Método estático para obtener la instancia de la impresora
    public static Singleton getImpresora() {
        // Si la instancia aún no ha sido creada, se crea una nueva
        if (impresora == null) {
            impresora = new Singleton();
        }
        return impresora;
    }
    
    // Método para obtener los datos de la impresora
    public String getDatosImpresora() {
        // Se devuelve una representación de los datos de la impresora
        return "La impresora está " + (enFuncionamiento ? "encendida" : "apagada") + "\n" +
               "Nivel de tinta: " + nivelTinta + "%";
    }
    
    // Método para encender la impresora
    public void encenderImpresora() {
        enFuncionamiento = true;
        JOptionPane.showMessageDialog(null, "La impresora se ha encendido.");
    }
    
    // Método para apagar la impresora
    public void apagarImpresora() {
        enFuncionamiento = false;
        JOptionPane.showMessageDialog(null, "La impresora se ha apagado.");
    }
    
    // Método para simular la impresión de un documento
    public void imprimirDocumento() {
        // Se verifica si la impresora está en funcionamiento y tiene suficiente tinta
        if (enFuncionamiento && nivelTinta > 0) {
            JOptionPane.showMessageDialog(null, "Imprimiendo documento...");
            // Se reduce el nivel de tinta después de imprimir
            nivelTinta -= 10;
        } else {
            JOptionPane.showMessageDialog(null, "Error: La impresora no puede imprimir en este momento.");
        }
    }
    
    // Método para reemplazar el cartucho de tinta
    public void reemplazarCartucho() {
        // Se verifica si la impresora está apagada
        if (!enFuncionamiento) {
            JOptionPane.showMessageDialog(null, "Error: La impresora está apagada.");
            return;
        }
        // Se simula el reemplazo del cartucho de tinta
        nivelTinta = 100;
        JOptionPane.showMessageDialog(null, "El cartucho de tinta ha sido reemplazado.");
    }
}
