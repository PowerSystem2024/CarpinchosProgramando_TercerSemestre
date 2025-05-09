
package test;

//Importación de clases
import domain.*;

public class TestAbstractas {
    // Método Main
    public static void main(String[] args) {
        // Objeto de la Clase Abstracta
        // No se pueden crear objetos de la Clase Padre, solo de las Hijas.
        // Se aplica el polimorfismo.
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        // Llamado al Método de la Clase Hija.
        figura.dibujar();
    }
}
