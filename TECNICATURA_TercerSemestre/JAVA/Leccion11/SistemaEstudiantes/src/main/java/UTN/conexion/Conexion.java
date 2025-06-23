package UTN.conexion;

import java.sql.Connection;        // Importa la clase Connection para manejar conexiones a bases de datos
import java.sql.DriverManager;     // Importa DriverManager, que permite conectarse a la base
import java.sql.SQLException;      // Importa SQLException para manejar errores relacionados con SQL

public class Conexion { // Clase pública llamada Conexion

    // Método estático que devuelve una conexión a la base de datos
    public static Connection getConnection(){
        Connection conexion = null; // Se declara el objeto Connection

        // Variables para conectarnos a la base de datos
        var baseDatos = "Estudiantes2025"; // Nombre de la base de datos
        var url = "jdbc:postgresql://localhost:5433/" + baseDatos; // URL de conexión JDBC con el puerto y nombre de la base
        var usuario = "postgres"; // Usuario de la base de datos
        var password = "1234";    // Contraseña del usuario

        try {
            // Cargamos la clase del driver de PostgreSQL en memoria
            Class.forName("org.postgresql.Driver");

            // Establecemos la conexión con los datos proporcionados
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión exitosa a PostgreSQL"); // Mensaje de éxito

        } catch (ClassNotFoundException e) {
            // Si no se encuentra el driver, se captura esta excepción
            System.out.println("Driver no encontrado: " + e.getMessage());

        } catch (SQLException e) {
            // Manejo de errores de SQL, como credenciales incorrectas
            System.out.println("Error de SQL: " + e.getMessage());

        } catch (Exception e) {
            // Captura cualquier otro error inesperado
            System.out.println("Error al conectar: " + e.getMessage());
        }

        return conexion; // Devuelve el objeto de conexión (puede ser null si falló)
    }

    // Método principal para probar la conexión
    public static void main(String[] args) {
        Connection conn = getConnection(); // Intenta establecer la conexión

        if (conn != null) {
            // Si la conexión fue exitosa, muestra mensaje y la cierra
            System.out.println("¡Conexión establecida correctamente!");
            try {
                conn.close(); // Se cierra la conexión
            } catch (SQLException e) {
                // Si ocurre un error al cerrar, se muestra el mensaje
                System.out.println("Error al cerrar: " + e.getMessage());
            }
        } else {
            // Si la conexión no fue posible, se informa
            System.out.println("No se pudo establecer la conexión");
        }
    }
}