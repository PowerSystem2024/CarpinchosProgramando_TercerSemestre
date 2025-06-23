package UTN; // Define el paquete donde se encuentra esta clase

import UTN.conexion.Conexion;     // Importa la clase Conexion desde el paquete UTN.conexion
import java.sql.SQLException;     // Importa la clase SQLException para manejar errores SQL

public class Main { // Declaración de la clase Main

    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        var conexion = Conexion.getConnection(); // Llama al método getConnection() para obtener la conexión a la base de datos

        if(conexion != null) { // Verifica si la conexión fue exitosa
            System.out.println("Conexion exitosa: " + conexion); // Imprime un mensaje de éxito

            // Cerrar la conexión después de usarla
            try {
                conexion.close(); // Intenta cerrar la conexión
                System.out.println("Conexión cerrada correctamente"); // Mensaje de cierre exitoso
            } catch (SQLException e) {
                // Si ocurre un error al cerrar la conexión, lo muestra
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }

        } else {
            // Si no se pudo conectar, se muestra un mensaje de error
            System.out.println("Error al conectarse");
        }

    } // fin del método main

} // fin de la clase Main