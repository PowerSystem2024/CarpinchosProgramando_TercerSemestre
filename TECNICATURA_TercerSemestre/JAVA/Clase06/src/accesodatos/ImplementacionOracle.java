package accesodatos; // Declaramos que esta clase pertenece al paquete 'accesodatos'

// Clase que implementa la interfaz IAaccesoDatos para una base de datos Oracle
public class ImplementacionOracle implements IAaccesoDatos {

    // Implementación del método insertar definido en la interfaz
    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle"); // Simula la operación de inserción en Oracle
    }

    // Implementación del método listar definido en la interfaz
    @Override
    public void listar() {
        System.out.println("Listar desde Oracle"); // Simula la operación de listado en Oracle
    }

    // Implementación del método actualizar definido en la interfaz
    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Oracle"); // Simula la operación de actualización en Oracle
    }

    // Implementación del método eliminar definido en la interfaz
    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Oracle"); // Simula la operación de eliminación en Oracle
    }
}