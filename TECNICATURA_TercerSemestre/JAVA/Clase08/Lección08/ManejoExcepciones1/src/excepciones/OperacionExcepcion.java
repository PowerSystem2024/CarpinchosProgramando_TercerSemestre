package excepciones; // Define el paquete al que pertenece esta clase, en este caso 'excepciones'

// Declaración de la clase OperacionExcepcion que hereda de RuntimeException, una excepción no comprobada
public class OperacionExcepcion extends RuntimeException {

    // Constructor que recibe un mensaje y lo pasa a la clase padre (RuntimeException)
    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }
}
