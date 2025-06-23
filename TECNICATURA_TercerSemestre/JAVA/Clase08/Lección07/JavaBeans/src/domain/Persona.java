package domain; // Define el paquete al que pertenece esta clase, en este caso 'domain'

import java.io.Serializable; // Importa la interfaz Serializable, necesaria para que los objetos puedan ser serializados

// Declaración de la clase Persona que implementa Serializable para permitir la serialización de sus objetos
public class Persona implements Serializable {

    // Atributo privado para almacenar el nombre de la persona
    private String nombre;

    // Atributo privado para almacenar el apellido de la persona
    private String apellido;

    // Constructor vacío: es obligatorio en algunas tecnologías como JavaBeans o frameworks que requieren instanciación reflexiva
    public Persona() {

    }

    // Constructor que recibe nombre y apellido, y los asigna a los atributos correspondientes
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Método getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método setter para modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener el apellido
    public String getApellido() {
        return apellido;
    }

    // Método setter para modificar el apellido
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Sobrescribe el método toString para devolver una representación en texto del objeto Persona
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
