package ar.com.system2025.mundopc;

// La clase Raton (Ratón) hereda de la clase DispositivoEntrada.
// Esto significa que un Ratón "es un" DispositivoEntrada y, por lo tanto,
// hereda sus atributos (tipoEntrada, marca) y métodos.
public class Raton extends DispositivoEntrada {

    // Declara una variable entera final para almacenar el ID único de cada ratón.
    // 'final' asegura que el idRaton se asigne una sola vez y no pueda cambiarse.
    private final int idRaton;
    // Declara una variable entera estática que actúa como un contador global para todos los objetos Raton.
    // 'static' significa que esta variable pertenece a la clase Raton, no a una instancia específica.
    private static int contadorRatones;

    // Constructor de la clase Raton.
    // Recibe el tipo de entrada y la marca, que son propiedades que hereda de DispositivoEntrada.
    public Raton(String tipoEntrada, String marca) {
        // Llama al constructor de la superclase (DispositivoEntrada) usando 'super()'.
        // Esto inicializa los atributos 'tipoEntrada' y 'marca' definidos en la clase padre.
        super(tipoEntrada, marca);
        // Incrementa el contador estático de ratones y asigna el nuevo valor
        // como el ID único para la instancia de Raton que se está creando.
        this.idRaton = ++Raton.contadorRatones;
    }

    // Sobrescribe el método toString() heredado de la clase DispositivoEntrada (que a su vez lo hereda de Object).
    // Proporciona una representación en formato String del objeto Raton.
    @Override
    public String toString() {
        // Construye la cadena de texto incluyendo el idRaton y luego
        // llama al toString() de la superclase (DispositivoEntrada) para añadir
        // la información de tipoEntrada y marca.
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString() + '}';
    }
}