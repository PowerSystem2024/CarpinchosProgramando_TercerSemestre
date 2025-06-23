// Clase base
class DispositivoEntrada {
    constructor(tipoEntrada, marca) {
        this._tipoEntrada = tipoEntrada; // Almacena el tipo de entrada (USB, Bluetooth, etc.)
        this._marca = marca;             // Almacena la marca del dispositivo
    }

    // Getter para tipoEntrada
    get tipoEntrada() {
        return this._tipoEntrada;
    }

    // Setter para tipoEntrada
    set tipoEntrada(tipoEntrada) {
        this._tipoEntrada = tipoEntrada;
    }

    // Getter para marca
    get marca() {
        return this._marca;
    }

    // Setter para marca
    set marca(marca) {
        this._marca = marca;
    }
}

// Subclase Raton que hereda de DispositivoEntrada
class Raton extends DispositivoEntrada {
    static contadorRatones = 0; // Atributo estático para contar instancias

    constructor(tipoEntrada, marca) {
        super(tipoEntrada, marca); // Llama al constructor de la clase padre
        this.idRaton = ++Raton.contadorRatones; // Asigna un ID único incrementando el contador
    }

    // Método para representar el objeto como string
    toString() {
        return `Raton [ID: ${this.idRaton}, Tipo Entrada: ${this.tipoEntrada}, Marca: ${this.marca}]`;
    }
}

// Subclase Teclado que hereda de DispositivoEntrada
class Teclado extends DispositivoEntrada {
    static contadorTeclado = 0; // Atributo estático para contar instancias

    constructor(tipoEntrada, marca) {
        super(tipoEntrada, marca); // Llama al constructor de la clase padre
        this.idTeclado = ++Teclado.contadorTeclado; // Asigna un ID único
    }

    // Método para representar el objeto como string
    toString() {
        return `Teclado [ID: ${this.idTeclado}, Tipo Entrada: ${this.tipoEntrada}, Marca: ${this.marca}]`;
    }
}

// Clase Monitor (no hereda de ninguna)
class Monitor {
    static contadorMonitores = 0; // Contador estático de monitores

    constructor(marca, tamaño) {
        this.idMonitor = ++Monitor.contadorMonitores; // ID único
        this.marca = marca;                           // Marca del monitor
        this.tamaño = tamaño;                         // Tamaño del monitor
    }

    // Método para representar el objeto como string
    toString() {
        return `Monitor [ID: ${this.idMonitor}, Marca: ${this.marca}, Tamaño: ${this.tamaño}]`;
    }
}

// Clase Computadora que compone monitor, teclado y ratón
class Computadora {
    static contadorComputadoras = 0; // Contador de instancias

    constructor(nombre, monitor, teclado, raton) {
        this.idComputadora = ++Computadora.contadorComputadoras; // ID único
        this.nombre = nombre;       // Nombre o modelo de la computadora
        this.monitor = monitor;     // Instancia de Monitor
        this.teclado = teclado;     // Instancia de Teclado
        this.raton = raton;         // Instancia de Raton
    }

    // Método para representar el objeto como string, mostrando sus componentes
    toString() {
        return `Computadora [ID: ${this.idComputadora}, Nombre: ${this.nombre}]\n  ${this.monitor.toString()}\n  ${this.teclado.toString()}\n  ${this.raton.toString()}`;
    }
}

// Clase Orden que agrupa múltiples Computadoras
class Orden {
    static contadorOrdenes = 0; // Contador de órdenes

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes; // ID único para la orden
        this._computadoras = []; // Arreglo que contiene computadoras asociadas a la orden
    }

    // Método para agregar computadoras a la orden
    agregarComputadora(computadora) {
        this._computadoras.push(computadora);
    }

    // Método para mostrar el contenido de la orden
    mostrarOrden() {
        let computadorasStr = this._computadoras.map(c => c.toString()).join('\n\n');
        console.log(`Orden [ID: ${this._idOrden}]\n${computadorasStr}`);
    }
}

// Crear dispositivos
let raton1 = new Raton("USB", "Logitech");                // Instancia de Raton
let teclado1 = new Teclado("Bluetooth", "Redragon");      // Instancia de Teclado
let monitor1 = new Monitor("Samsung", "27 pulgadas");     // Instancia de Monitor

// Crear computadora con los dispositivos anteriores
let computadora1 = new Computadora("PC Gamer", monitor1, teclado1, raton1);

// Crear otra computadora con otros dispositivos
let raton2 = new Raton("Bluetooth", "Genius");
let teclado2 = new Teclado("USB", "Logitech");
let monitor2 = new Monitor("LG", "24 pulgadas");
let computadora2 = new Computadora("Oficina", monitor2, teclado2, raton2);

// Crear orden y agregar computadoras
let orden1 = new Orden();
orden1.agregarComputadora(computadora1);
orden1.agregarComputadora(computadora2);

// Mostrar el contenido de la orden en consola
orden1.mostrarOrden();
