package ar.com.system2025.mundopc;

public class DispositivoEntrada {
    // Declara una variable String para almacenar el tipo de entrada del dispositivo (ej. "USB", "Bluetooth").
    private String tipoEntrada;
    // Declara una variable String para almacenar la marca del dispositivo de entrada (ej. "Logitech", "Razer").
    private String marca;

    // Constructor de la clase DispositivoEntrada.
    // Se utiliza para crear una nueva instancia de un dispositivo de entrada,
    // inicializando su tipo de entrada y su marca.
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada; // Asigna el tipo de entrada proporcionado al atributo 'tipoEntrada' de la instancia.
        this.marca = marca;           // Asigna la marca proporcionada al atributo 'marca' de la instancia.
    }

    // --- Métodos Getters y Setters ---

    // Método Getter para 'tipoEntrada'.
    // Permite obtener el tipo de conexión del dispositivo de entrada.
    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    // Método Setter para 'tipoEntrada'.
    // Permite modificar el tipo de conexión del dispositivo de entrada.
    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    // Método Getter para 'marca'.
    // Permite obtener la marca del dispositivo de entrada.
    public String getMarca() {
        return this.marca;
    }

    // Método Setter para 'marca'.
    // Permite modificar la marca del dispositivo de entrada.
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Sobrescribe el método toString() heredado de la clase Object.
    // Proporciona una representación en formato String del objeto DispositivoEntrada,
    // mostrando el tipo de entrada y la marca. Esto es útil para depurar o imprimir información del objeto.
    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
}