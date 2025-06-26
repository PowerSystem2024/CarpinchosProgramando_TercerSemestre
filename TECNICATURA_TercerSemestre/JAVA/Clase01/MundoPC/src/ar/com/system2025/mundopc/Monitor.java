package ar.com.system2025.mundopc;

public class Monitor {
    // Declara una variable entera final para almacenar el ID único de cada monitor.
    // 'final' indica que el valor de idMonitor no puede ser modificado una vez asignado.
    private final int idMonitor;
    // Declara una variable String para almacenar la marca del monitor (ej. "Samsung", "LG").
    private String marca;
    // Declara una variable double para almacenar el tamaño en pulgadas del monitor (ej. 24.0, 27.5).
    private double tamanio;
    // Declara una variable entera estática que actúa como un contador global para todos los objetos Monitor.
    // 'static' significa que esta variable pertenece a la clase Monitor, no a una instancia específica.
    private static int contadorMonitores;

    // Constructor privado por defecto.
    // Este constructor no recibe parámetros y se encarga de asignar un ID único a cada monitor.
    // Es privado para que no se pueda llamar directamente desde fuera de la clase,
    // asegurando que la asignación del ID siempre se haga internamente al crear un Monitor.
    private Monitor() {
        // Incrementa el contador estático de monitores y asigna el valor resultante
        // como el ID único para la instancia de Monitor que se está creando.
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    // Constructor público para crear un objeto Monitor con una marca y un tamaño específicos.
    public Monitor(String marca, double tamanio) {
        // Llama al constructor privado sin argumentos (this()) para inicializar 'idMonitor'
        // antes de establecer las propiedades de marca y tamaño.
        this(); // Llamando al constructor vacío para asignar el ID único.
        // Asigna la marca proporcionada al atributo 'marca' de la instancia actual.
        this.marca = marca;
        // Asigna el tamaño proporcionado al atributo 'tamanio' de la instancia actual.
        this.tamanio = tamanio;
    }

    // --- Métodos Getters y Setters ---

    // Método Getter para 'marca'.
    // Permite obtener la marca del monitor.
    public String getMarca() {
        return this.marca;
    }

    // Método Setter para 'marca'.
    // Permite modificar la marca del monitor.
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método Getter para 'tamanio'.
    // Permite obtener el tamaño del monitor.
    public double getTamanio() {
        return this.tamanio;
    }

    // Método Setter para 'tamanio'.
    // Permite modificar el tamaño del monitor.
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    // Método Getter para 'idMonitor'.
    // Permite obtener el ID único asignado a este monitor.
    public int getIdMonitor() {
        return this.idMonitor;
    }

    // Sobrescribe el método toString() heredado de la clase Object.
    // Proporciona una representación en formato String del objeto Monitor,
    // incluyendo su ID, marca y tamaño. Es útil para la depuración y para mostrar información del monitor.
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
}