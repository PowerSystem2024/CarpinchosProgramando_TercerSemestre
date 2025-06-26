package ar.com.system2025.mundopc;

import javax.management.monitor.Monitor;

public class Computadora {
    // Declara una variable entera final para almacenar el ID único de cada computadora.
    // 'final' significa que su valor no puede cambiarse una vez asignado.
    private final int idComputadora;
    // Declara una variable String para almacenar el nombre de la computadora.
    private String nombre;
    // Declara un objeto Monitor para representar el monitor conectado a la computadora.
    private Monitor monitor;
    // Declara un objeto Teclado para representar el teclado conectado a la computadora.
    private Teclado teclado;
    // Declara un objeto Raton para representar el ratón conectado a la computadora.
    private Raton raton;
    // Declara una variable entera estática para llevar la cuenta del número total de objetos Computadora creados.
    // 'static' significa que esta variable pertenece a la clase en sí, no a objetos individuales.
    private static int contadorComputadoras;

    // Constructor privado vacío (o por defecto).
    // Este constructor se llama internamente cuando se crea un nuevo objeto Computadora
    // usando el constructor público. Es privado para que no se pueda llamar directamente desde fuera de la clase.
    private Computadora() {
        // Incrementa el contador estático de computadoras y asigna el nuevo valor
        // como el ID único para la computadora actual.
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    // Constructor público para crear un objeto Computadora con todos sus componentes.
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        // Llama al constructor privado por defecto para inicializar 'idComputadora'.
        this();
        // Asigna el nombre proporcionado a la variable de instancia 'nombre'.
        this.nombre = nombre;
        // Asigna el objeto Monitor proporcionado a la variable de instancia 'monitor'.
        this.monitor = monitor;
        // Asigna el objeto Teclado proporcionado a la variable de instancia 'teclado'.
        this.teclado = teclado;
        // Asigna el objeto Raton proporcionado a la variable de instancia 'raton'.
        this.raton = raton;
    }

    // --- Métodos Getters y Setters ---

    // Método Getter para 'idComputadora'.
    // Devuelve el ID único de la computadora.
    public int getIdComputadora() {
        return idComputadora;
    }

    // Método Getter para 'nombre'.
    // Devuelve el nombre de la computadora.
    public String getNombre() {
        return nombre;
    }

    // Método Setter para 'nombre'.
    // Establece el nombre de la computadora.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método Getter para 'monitor'.
    // Devuelve el objeto Monitor asociado a la computadora.
    public Monitor getMonitor() {
        return monitor;
    }

    // Método Setter para 'monitor'.
    // Establece el objeto Monitor para la computadora.
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    // Método Getter para 'teclado'.
    // Devuelve el objeto Teclado asociado a la computadora.
    public Teclado getTeclado() {
        return teclado;
    }

    // Método Setter para 'teclado'.
    // Establece el objeto Teclado para la computadora.
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    // Método Getter para 'raton'.
    // Devuelve el objeto Raton asociado a la computadora.
    public Raton getRaton() {
        return raton;
    }

    // Método Setter para 'raton'.
    // Establece el objeto Raton para la computadora.
    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    // Sobrescribe el método toString() predeterminado de la clase Object.
    // Proporciona una representación en cadena del objeto Computadora,
    // incluyendo su ID, nombre y los detalles de sus componentes.
    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
}