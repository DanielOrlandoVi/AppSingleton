
package Singleton;

public class Singleton {
    
    private static Singleton impresora;
    
    //Constructor privado para evitar mas de una instanciacion
    private Singleton(){
    
    }
    
    public static Singleton getImpresora(){
        if(impresora == null){
           impresora = new Singleton();
        }
        return impresora;
    }
    
    public String getDatosImpresora(){
        return "La impresora es una HP Officejet Pro 7720";    
    }
}
