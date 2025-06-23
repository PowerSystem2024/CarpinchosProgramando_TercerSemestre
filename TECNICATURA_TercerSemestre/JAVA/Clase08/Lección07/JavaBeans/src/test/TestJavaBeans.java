package test; // Define el paquete al que pertenece esta clase, en este caso 'test'

import domain.Persona; // Importa la clase Persona desde el paquete 'domain'

public class TestJavaBeans {

    public static void main(String[] args) {
        // Se crea un objeto de tipo Persona usando el constructor vacío
        Persona persona = new Persona();

        // Se asigna el nombre "Juan" al objeto persona mediante el setter
        persona.setNombre("Juan");

        // Se asigna el apellido "Perez" al objeto persona mediante el setter
        persona.setApellido("Perez");

        // Se imprime el objeto persona, utilizando el método toString sobreescrito
        System.out.println("persona = " + persona);

        // Se imprime el nombre de la persona utilizando el método getter
        System.out.println("Persona nombre: " + persona.getNombre());

        // Se imprime el apellido de la persona utilizando el método getter
        System.out.println("Persona apellido: " + persona.getApellido());
    }
}
