package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000); // Creamos un objeto de tipo 'Empleado' con nombre "Juan" y sueldo 10000.
        determinarTipo(empleado1); // Llamamos al método 'determinarTipo' pasando el objeto 'empleado1'.

        empleado1 = new Gerente("Jose", 5000, "Sistemas"); // Creamos un objeto de tipo 'Gerente' con nombre "Jose", sueldo 5000 y departamento "Sistemas".
        determinarTipo(empleado1); // Llamamos al método 'determinarTipo' pasando el objeto 'gerente1'.
    }

    public static void determinarTipo(Empleado empleado) { // Declaramos un método estático que recibe un objeto de tipo 'Empleado'.

        if (empleado instanceof Gerente) { // Verificamos si el objeto recibido es una instancia de la clase 'Gerente'.
            System.out.println("\nEl empleado es de tipo Gerente"); // Imprimimos un mensaje indicando que el objeto es de tipo 'Gerente'.

            Gerente gerente = (Gerente) empleado; // Realizamos un casteo explícito para convertir la referencia de tipo 'Empleado' a 'Gerente'.
            System.out.println("Departamento = " + gerente.getDepartamento()); // Accedemos al método específico de la clase 'Gerente' para obtener el departamento y lo imprimimos.

        } else if (empleado instanceof Empleado) { // Si no es 'Gerente', verificamos si es una instancia de 'Empleado'.
            System.out.println("El empleado es de tipo Empleado"); // Imprimimos un mensaje indicando que el objeto es de tipo 'Empleado'.

        } else if (empleado instanceof Object) { // Como último caso, verificamos si es una instancia de 'Object', la superclase base de todas en Java.
            System.out.println("El empleado es de tipo Object"); // Imprimimos un mensaje indicando que el objeto es de tipo 'Object'.
        }
    }
}