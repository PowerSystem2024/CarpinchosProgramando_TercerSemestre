package test; // Define el paquete 'test' al que pertenece esta clase

import domain.Persona; // Importa la clase Persona desde el paquete 'domain'

public class TestBloqueInicializacion {
    public static void main(String[] args) {
        // Crea un objeto Persona usando el constructor vacío
        Persona persona1 = new Persona();
        // Imprime en consola la representación del objeto persona1 (usando su método toString)
        System.out.println("persona1 = " + persona1);

        // Crea otro objeto Persona usando el constructor vacío
        Persona persona2 = new Persona();
        // Imprime en consola la representación del objeto persona2
        System.out.println("persona2 = " + persona2);
    }
}
