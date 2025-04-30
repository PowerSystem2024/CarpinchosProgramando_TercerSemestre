package test;

import domain.*;

public class TestSobreescritura {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000); // Creamos un objeto de tipo 'Empleado' con nombre "Juan" y sueldo 10000.
        imprimir(empleado1); // Llamamos al método 'imprimir' pasándole el objeto 'empleado1' como argumento para mostrar sus detalles.

        //System.out.println("empleado1 = " + empleado1.obtenerDetalle());
        empleado1 = new Gerente("Jose", 5000, "Sistemas"); // Creamos un objeto de tipo 'Gerente' usando el constructor que recibe nombre, sueldo y departamento.
        //System.out.println("gerente1 = " + gerente1.obtenerDetalle()); // Imprimimos en consola los detalles del objeto 'gerente1' usando el método sobrescrito 'obtenerDetalle'.
        imprimir(empleado1); // Llamamos al método 'imprimir' pasándole el objeto 'gerente1' como argumento. Aunque la referencia es de tipo 'Empleado', se ejecuta el método sobrescrito en 'Gerente'.
    }

    public static void imprimir(Empleado empleado) { // Definimos un método estático llamado 'imprimir' que recibe un objeto de tipo 'Empleado'.
        System.out.println("empleado = " + empleado.obtenerDetalle()); // Imprimimos detalles del empleado usando el método 'obtenerDetalle'. Si el objeto es un Gerente, se invoca la versión sobrescrita.
    }
}