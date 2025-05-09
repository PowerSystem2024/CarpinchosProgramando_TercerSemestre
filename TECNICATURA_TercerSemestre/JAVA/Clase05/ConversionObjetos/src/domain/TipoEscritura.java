
package domain;

public enum TipoEscritura {
    // Atributos
    CLASICO ("Escritura a mano."),
    MODERNO ("Escritura digital.");
    
    private final String descripcion;
    
    // Constructor
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }
    
    // Método Getter
    public String getDescripcion(){
        return this.descripcion;
    }
}
