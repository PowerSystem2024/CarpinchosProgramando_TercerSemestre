package aritmetica; // Define el paquete al que pertenece esta clase, en este caso 'aritmetica'

import excepciones.OperacionExcepcion; // Importa la clase de excepción personalizada desde el paquete 'excepciones'

public class Aritmetica {

    // Método estático que realiza una división entre dos enteros
    // Puede lanzar una excepción personalizada OperacionExcepcion si el denominador es cero
    public static int division(int numerador, int denominador) throws OperacionExcepcion {
        
        // Verifica si el denominador es cero para evitar una división inválida
        if (denominador == 0) {
            // Lanza una excepción personalizada con un mensaje específico
            throw new OperacionExcepcion("División entre cero");
        }
        
        // Retorna el resultado de la división si el denominador es válido
        return numerador / denominador;
    }
}
