package test; // Define el paquete al que pertenece esta clase, en este caso 'test'

import static aritmetica.Aritmetica.division; // Importa de forma estática el método 'division' desde la clase Aritmetica
import excepciones.OperacionExcepcion; // Importa la clase de excepción personalizada OperacionExcepcion

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0; // Variable para almacenar el resultado de la división

        try {
            // Intenta realizar la división. En este caso se intenta dividir 10 entre 0, lo cual genera una excepción
            resultado = division(10, 0);
        } catch (OperacionExcepcion e) {
            // Captura la excepción personalizada OperacionExcepcion
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage()); // Muestra el mensaje de error definido en la excepción
        } catch (Exception e) {
            // Captura cualquier otra excepción general que no haya sido atrapada antes
            System.out.println("Ocurrió un Error");
            e.printStackTrace(System.out); // Imprime la traza completa del error (pila de llamadas)
            System.out.println(e.getMessage()); // Muestra el mensaje de la excepción
        } finally {
            // Bloque que se ejecuta siempre, haya o no excepción
            System.out.println("Se reviso la division entre cero");
        }

        // Muestra el valor de la variable resultado, que se mantiene en 0 si hubo error
        System.out.println("La variable de resultado tiene como valor: " + resultado);
    }
}
