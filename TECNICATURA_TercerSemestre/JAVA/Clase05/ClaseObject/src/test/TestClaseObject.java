
package test;

// Importación de clases
import domain.*;

public class TestClaseObject {
    // Método Main
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ana", 5000);
        Empleado empleado2 = new Empleado("Ana", 5000);
        
        // Sentencia if
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia de memoria.");
        }
        else{
            System.out.println("Tienen distinta referencia de memoria.");
        }
        
        // Se recomienda utilizar juntos los métodos .equals() y .hashCode()
        // Método .equals() - Compara el contenido de dos objetos.
        if(empleado1.equals(empleado2)){
            System.out.println("Tienen la misma referencia de memoria.");
        }
        else{
            System.out.println("Tienen distinta referencia de memoria.");
        }
        
        // Método .hashCode() - Compara los atributos de dos objetos.
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("Tienen la misma referencia de memoria.");
        }
        else{
            System.out.println("Tienen distinta referencia de memoria.");
        }
    }
}
