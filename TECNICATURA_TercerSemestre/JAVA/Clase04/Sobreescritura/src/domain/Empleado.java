package domain; 

public class Empleado { 

    protected String nombre; // Declaramos un atributos protegidos para almacenar el nombre del empleado y el sueldo.
    protected double sueldo;

    public Empleado(String nombre, double sueldo){ 
        this.nombre = nombre; // Asignamos el valor del parámetro 'nombre' al atributo de la clase.
        this.sueldo = sueldo; // Asignamos el valor del parámetro 'sueldo' al atributo de la clase.
    }

    public String obtenerDetalle(){ // Definimos un método público que devuelve los detalles del empleado en forma de cadena.
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo; // Construimos y devolvemos la cadena con el nombre y el sueldo del empleado.
    }

    public String getNombre() { // Definimos un método getter para obtener el valor del atributo 'nombre'.
        return nombre; // Devolvemos el valor del atributo 'nombre'.
    }

    public void setNombre(String nombre) { // Definimos un método setter para modificar el valor del atributo 'nombre'.
        this.nombre = nombre; // Asignamos el nuevo valor al atributo 'nombre'.
    }

    public double getSueldo() { // Definimos un método getter para obtener el valor del atributo 'sueldo'.
        return sueldo; // Devolvemos el valor del atributo 'sueldo'.
    }

    public void setSueldo(double sueldo) { // Definimos un método setter para modificar el valor del atributo 'sueldo'.
        this.sueldo = sueldo; // Asignamos el nuevo valor al atributo 'sueldo'.
    }    
}
