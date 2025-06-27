package ar.com.system2025.mundopc;

// La clase Teclado hereda de DispositivoEntrada.
// Esto significa que un Teclado es un tipo específico de DispositivoEntrada
// y, por lo tanto, hereda sus características comunes como el tipo de entrada y la marca.
public class Teclado extends DispositivoEntrada {

    // Declara una variable entera final para almacenar el ID único de cada teclado.
    // 'final' garantiza que el idTeclado se asigne una sola vez y no pueda modificarse después.
    private final int idTeclado;
    // Declara una variable entera estática que funciona como un contador global
    // para llevar un registro de cuántos objetos Teclado se han creado.
    // 'static' significa que esta variable pertenece a la clase Teclado en sí,
    // no a cada instancia individual de teclado.
    private static int ContadorTeclados; // Nota: Se recomienda 'contadorTeclados' por convención de nombres.

    // Constructor de la clase Teclado.
    // Recibe el tipo de entrada y la marca, que son atributos comunes a todos los dispositivos de entrada.
    public Teclado(String tipoEntrada, String marca) {
        // Llama al constructor de la superclase (DispositivoEntrada) usando 'super()'.
        // Esto es crucial para inicializar los atributos heredados 'tipoEntrada' y 'marca'
        // que se definen en la clase padre.
        super(tipoEntrada, marca);
        // Incrementa el contador estático de teclados y asigna el nuevo valor
        // como el ID único para la instancia de Teclado que se está creando.
        this.idTeclado = ++Teclado.ContadorTeclados;
    }

    // Sobrescribe el método toString() heredado de la clase DispositivoEntrada (y por ende de Object).
    // Este método proporciona una representación en formato String del objeto Teclado.
    @Override
    public String toString() {
        // Construye la cadena de texto incluyendo el idTeclado específico de esta instancia.
        // Luego, llama a 'super.toString()' para obtener y añadir la representación
        // de los atributos heredados (tipoEntrada y marca) definidos en la clase padre.
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString() + '}';
    }
}