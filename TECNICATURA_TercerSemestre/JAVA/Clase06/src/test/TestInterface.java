package test; // Declaramos el paquete en el que se encuentra esta clase

import accesodatos.*; // Importamos todas las clases e interfaces del paquete accesodatos

// Clase de prueba para demostrar el uso de interfaces en Java
class TestInterfaces {
    public static void main(String[] args) {
        // Creamos una referencia de tipo IAaccesoDatos, que puede apuntar a cualquier implementación
        IAaccesoDatos datos = new ImplementacionMySql(); // Asignamos una implementación concreta (MySQL)

        // datos.listar(); // Esta línea está comentada, pero si se descomenta ejecutaría el método listar()

        // datos = new ImplementacionOracle(); // Se cambia la implementación a Oracle
        datos = new ImplementacionOracle(); // Se reemplaza la implementación actual por Oracle

        // datos.listar(); // También está comentada. Se puede usar directamente si se desea

        imprimir(datos); // Llamamos al método imprimir pasando el objeto datos
    }

    // Método estático que recibe una interfaz IAaccesoDatos y llama a su método listar()
    public static void imprimir(IAaccesoDatos datos) {
        datos.listar(); // Ejecuta el método listar de la implementación recibida
    }
}