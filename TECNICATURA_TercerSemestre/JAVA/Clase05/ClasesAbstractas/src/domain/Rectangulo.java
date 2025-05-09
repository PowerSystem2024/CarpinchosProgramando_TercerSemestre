// Clase Hija
package domain;

// Hay que implementar todos los métodos abstractos para que no salten errores.
public class Rectangulo extends FiguraGeometrica {
    // Constructor
    public Rectangulo(String tipoFigura){
        // Llamado a la Clase Padre
        super(tipoFigura);
    }
    
    // Implementación Método de la Clase Padre
    @Override
    public void dibujar(){
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}
