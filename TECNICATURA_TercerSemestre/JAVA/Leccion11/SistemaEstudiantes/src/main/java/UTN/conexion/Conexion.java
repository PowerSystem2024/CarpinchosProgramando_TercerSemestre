package UTN.conexion;

import java.sql.Connection;
import java.sql.DriverManager; // Import correcto
import java.sql.SQLException;

public class Conexion { // Necesitas una clase

    public static Connection getConnection(){
        Connection conexion = null;
        //Variables para conectarnos a la base de datos
        var baseDatos = "Estudiantes2025";
        var url = "jdbc:postgresql://localhost:5433/" + baseDatos; // Corregida la URL
        var usuario = "postgres";
        var password = "1234";

        //Cargamos la clase del driver de PostgreSQL en memoria
        try{
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión exitosa a PostgreSQL");
        }
        catch(ClassNotFoundException e){
            System.out.println("Driver no encontrado: " + e.getMessage());
        }
        catch(SQLException e){
            System.out.println("Error de SQL: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }

    // Método para probar la conexión
    public static void main(String[] args) {
        Connection conn = getConnection();
        if(conn != null){
            System.out.println("¡Conexión establecida correctamente!");
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo establecer la conexión");
        }
    }
}