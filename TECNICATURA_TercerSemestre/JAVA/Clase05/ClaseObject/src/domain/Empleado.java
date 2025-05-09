// Clase Padre
package domain;

import java.util.Objects;

public class Empleado {
    // Atributos
    protected String nombre;
    protected double sueldo;
    
    // Constructor
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    // Método para Sobreescritura
    public String obtenerDetalles(){
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
    }
    
    // Métodos Getter y Setter
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    // toString
    @Override
    public String toString(){
        return "Empleado{" + "Nombre: " + nombre + ", Sueldo: " + sueldo + "}";
    }
    
    // Método hashCode()
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    // Método equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
}
