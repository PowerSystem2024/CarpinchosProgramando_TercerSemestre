package accesodatos;

import java.sql.SQLOutput;

public class ImplementacionMySql implements IAaccesoDatos {


    @Override
    public void insertar() {
        System.out.println("Insertar desde mySql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde mySql");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde mySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde mySql");
    }
}
