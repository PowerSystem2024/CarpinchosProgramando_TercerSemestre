package test;

import accesodatos.*;

class TestInterfaces {
    public static void main(String[] args) {
 IAaccesoDatos datos = new ImplementacionMySql();
 //datos.listar();
//imprimir(datos);
 datos = new ImplementacionOracle();
 //datos.listar();
imprimir(datos);
    }
    public static void imprimir (IAaccesoDatos datos) {
        datos.listar();
    }
}