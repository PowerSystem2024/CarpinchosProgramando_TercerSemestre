// Clase Padre
package domain;

// Uso de la palabra reservada 'abstract'
public abstract class FiguraGeometrica {
    // Atributo
    protected String tipoFigura;
    
    // Constructor
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    // Método abstracto - No recibe ningún argumento, no utiliza llaves, 
    // simplemente se utiliza el signo ;.
    public abstract void dibujar();

    // Métodos Getter y Setter
    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    // Método toString()
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura: " + tipoFigura + '}';
    }
}
