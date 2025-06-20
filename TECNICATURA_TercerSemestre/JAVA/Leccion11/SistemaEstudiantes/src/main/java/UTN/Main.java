package UTN;

import UTN.conexion.Conexion;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        var conexion = Conexion.getConnection();

        if(conexion != null) {
            System.out.println("Conexion exitosa: " + conexion);

            // Cerrar la conexión después de usarla
            try {
                conexion.close();
                System.out.println("Conexión cerrada correctamente");
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }

        } else {
            System.out.println("Error al conectarse");
        }

    } //fin main

} //fin clase