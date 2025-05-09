// Clase Hija Escritor
package domain;

public class Escritor extends Empleado{
    // Atributos
    final TipoEscritura tipoEscritura;
    
    // Constructor
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        // Llamado al constructor de la clase padre
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    // Método para Sobreescribir
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Tipo Escritura: " + tipoEscritura.getDescripcion();
    }
    
    // toString
    @Override
    public String toString(){
        return "Escritor{" + "tipoEscritura: " + tipoEscritura + "}" + " " + super.toString();
    }
        
    // Método Getter
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
