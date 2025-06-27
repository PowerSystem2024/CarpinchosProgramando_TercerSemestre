package ar.com.system2025.mundopc;

public class Orden {
    // Declara una variable entera final para almacenar el ID único de cada orden.
    // 'final' significa que su valor no puede cambiarse una vez asignado.
    private final int idOrden;
    // Declara un arreglo de objetos Computadora. Una orden puede contener múltiples computadoras.
    private Computadora computadora[];
    // Declara una variable entera estática para llevar la cuenta del número total de objetos Orden creados.
    // 'static' significa que esta variable pertenece a la clase Orden, no a objetos individuales.
    private static int contadorOrdenes;
    // Declara una constante entera estática y final para definir el número máximo de computadoras
    // que puede contener una sola orden. 'final' significa que su valor no cambiará.
    private static final int MAX_COMPUTADORAS = 10;
    // Declara una variable entera para llevar el conteo de cuántas computadoras se han agregado a esta orden específica.
    private int contadorComputadora;

    // Constructor vacío (o por defecto) de la clase Orden.
    // Se utiliza para inicializar una nueva orden, asignándole un ID único y preparando el arreglo para las computadoras.
    public Orden() {
        // Incrementa el contador estático de órdenes y asigna el nuevo valor
        // como el ID único para la orden actual.
        this.idOrden = ++Orden.contadorOrdenes;
        // Inicializa el arreglo 'computadora' con el tamaño máximo permitido (MAX_COMPUTADORAS).
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    // Método para agregar una nueva computadora al arreglo de computadoras de esta orden.
    public void agregarComputadora(Computadora computadora) {
        // Comprueba si aún hay espacio disponible en el arreglo para añadir más computadoras.
        if (this.contadorComputadora < Orden.MAX_COMPUTADORAS) {
            // Si hay espacio, agrega la computadora al arreglo en la posición actual
            // y luego incrementa el contador de computadoras de esta orden.
            this.computadora[this.contadorComputadora++] = computadora;
        } else {
            // Si se ha superado el límite, imprime un mensaje de advertencia.
            System.out.println("Has superado el límite: " + Orden.MAX_COMPUTADORAS);
        }
    }

    // Método para mostrar los detalles de la orden, incluyendo su ID y las computadoras que contiene.
    public void mostrarOrden() {
        // Imprime el ID de la orden.
        System.out.println("Orden #: " + this.idOrden);
        // Imprime un encabezado para las computadoras de la orden.
        System.out.println("Computadoras de la orden #: " + this.idOrden);
        // Itera sobre el arreglo de computadoras hasta el número de computadoras realmente agregadas (contadorComputadora).
        for (int i = 0; i < this.contadorComputadora; i++) {
            // Imprime cada objeto Computadora. Esto invocará automáticamente el método toString() de cada Computadora.
            System.out.println(this.computadora[i]);
        }
    }
}