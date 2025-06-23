package UTN.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection() {
        Connection conexion = null;

        var baseDatos = "estudiantes";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var pass = "admin";

        // Cargamos el driver en la memoria

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ocurrio un error con la conexion: " + e.getMessage());
        }
        return conexion;
    }
}
