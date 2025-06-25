package accesodatos; // Declaramos que esta clase pertenece al paquete 'accesodatos'

import java.sql.SQLOutput; // (No se usa en esta clase, se puede eliminar esta importación)

// Clase que implementa la interfaz IAaccesoDatos para una base de datos MySQL
public class ImplementacionMySql implements IAaccesoDatos {

    // Implementación del método insertar definido en la interfaz
    @Override
    public void insertar() {
        System.out.println("Insertar desde mySql"); // Simula la operación de inserción en MySQL
    }

    // Implementación del método listar definido en la interfaz
    @Override
    public void listar() {
        System.out.println("Listar desde mySql"); // Simula la operación de listado de registros en MySQL
    }

    // Implementación del método actualizar definido en la interfaz
    @Override
    public void actualizar() {
        System.out.println("Actualizar desde mySql"); // Simula la operación de actualización en MySQL
    }

    // Implementación del método eliminar definido en la interfaz
    @Override
    public void eliminar() {
        System.out.println("Eliminar desde mySql"); // Simula la operación de eliminación en MySQL
    }
}