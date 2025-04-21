// Clase base
class DispositivoEntrada {
    constructor(tipoEntrada, marca) {
        this._tipoEntrada = tipoEntrada;
        this._marca = marca;
    }

    get tipoEntrada() {
        return this._tipoEntrada;
    }

    set tipoEntrada(tipoEntrada) {
        this._tipoEntrada = tipoEntrada;
    }

    get marca() {
        return this._marca;
    }

    set marca(marca) {
        this._marca = marca;
    }
}

// Subclases
class Raton extends DispositivoEntrada {
    static contadorRatones = 0;

    constructor(tipoEntrada, marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    toString() {
        return `Raton [ID: ${this.idRaton}, Tipo Entrada: ${this.tipoEntrada}, Marca: ${this.marca}]`;
    }
}

class Teclado extends DispositivoEntrada {
    static contadorTeclado = 0;

    constructor(tipoEntrada, marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    toString() {
        return `Teclado [ID: ${this.idTeclado}, Tipo Entrada: ${this.tipoEntrada}, Marca: ${this.marca}]`;
    }
}

class Monitor {
    static contadorMonitores = 0;

    constructor(marca, tamaño) {
        this.idMonitor = ++Monitor.contadorMonitores;
        this.marca = marca;
        this.tamaño = tamaño;
    }

    toString() {
        return `Monitor [ID: ${this.idMonitor}, Marca: ${this.marca}, Tamaño: ${this.tamaño}]`;
    }
}

class Computadora {
    static contadorComputadoras = 0;

    constructor(nombre, monitor, teclado, raton) {
        this.idComputadora = ++Computadora.contadorComputadoras;
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    toString() {
        return `Computadora [ID: ${this.idComputadora}, Nombre: ${this.nombre}]\n  ${this.monitor.toString()}\n  ${this.teclado.toString()}\n  ${this.raton.toString()}`;
    }
}

class Orden {
    static contadorOrdenes = 0;

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._computadoras = [];
    }

    agregarComputadora(computadora) {
        this._computadoras.push(computadora);
    }

    mostrarOrden() {
        let computadorasStr = this._computadoras.map(c => c.toString()).join('\n\n');
        console.log(`Orden [ID: ${this._idOrden}]\n${computadorasStr}`);
    }
}

// Crear dispositivos
let raton1 = new Raton("USB", "Logitech");
let teclado1 = new Teclado("Bluetooth", "Redragon");
let monitor1 = new Monitor("Samsung", "27 pulgadas");

// Crear computadora
let computadora1 = new Computadora("PC Gamer", monitor1, teclado1, raton1);

// Crear otra computadora
let raton2 = new Raton("Bluetooth", "Genius");
let teclado2 = new Teclado("USB", "Logitech");
let monitor2 = new Monitor("LG", "24 pulgadas");
let computadora2 = new Computadora("Oficina", monitor2, teclado2, raton2);

// Crear orden
let orden1 = new Orden();
orden1.agregarComputadora(computadora1);
orden1.agregarComputadora(computadora2);

// Mostrar orden
orden1.mostrarOrden();