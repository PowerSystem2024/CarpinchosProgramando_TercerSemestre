
package test;

// Importación de clases
import domain.*;

public class TestConversionObjetos {
    // Método Main
    public static void main(String[] args) {
        // Variables
        Empleado empleado;
        // Variable que apunta a la Clase Hija Escritor
        empleado = new Escritor("Ana", 5000, TipoEscritura.CLASICO);
        // System.out.println("Empleado: " + empleado);
        // Acceso a los Métodos de la Clase Escritor - Se aplica el polimorfismo
        System.out.println(empleado.obtenerDetalles());
        
        // No es posible llamar al getTipoEscritura() de esta forma, hay que 
        // hacer una conversión o casteo.
        // empleado.getTipoEscritura();
        
        // Downcasting - Convierte una referencia de tipo padre a tipo hijo
        // Es necesario hacer la conversión de forma explícita.
        // Opción 1
        // ((Escritor)empleado).getTipoEscritura();
        // Opción 2
        Escritor escritor = (Escritor)empleado;
        escritor.getTipoEscritura();
        
        // Upcasting - Convierte una referencia de tipo hijo a tipo padre
        // No es necesario hacer la conversión de forma explícita.
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
