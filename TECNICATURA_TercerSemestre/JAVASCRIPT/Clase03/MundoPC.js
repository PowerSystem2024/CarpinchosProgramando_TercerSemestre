class DispositivoEntrada {
    constructor(tipoEntrada, marca) {
        this._tipoEntrada = tipoEntrada;
        this._marca = marca;
    }

    get tipoEntrada() {
        return this._tipoEntrada;
    }

    set tipoEntrada(valor) {
        this._tipoEntrada = valor;
    }

    get marca() {
        return this._marca;
    }

    set marca(valor) {
        this._marca = valor;
    }
}

class Raton extends DispositivoEntrada { //Clase hija hereda de la clase Padre
    static contadorRatones = 0;

    constructor(tipoEntrada, marca) {
        super(tipoEntrada, marca);
        this._idRaton = ++Raton.contadorRatones;
    }

    toString() {
        return `Raton [ID: ${this._idRaton}, Tipo: ${this._tipoEntrada}, Marca: ${this._marca}]`;
    }
}

class Teclado extends DispositivoEntrada {
    static contadorTeclados = 0;

    constructor(tipoEntrada, marca) {
        super(tipoEntrada, marca);
        this._idTeclado = ++Teclado.contadorTeclados;
    }

    toString() {
        return `Teclado [ID: ${this._idTeclado}, Tipo: ${this._tipoEntrada}, Marca: ${this._marca}]`;
    }
}

class Monitor {
    static contadorMonitores = 0;

    constructor(marca, tamaño) {
        this._idMonitor = ++Monitor.contadorMonitores;
        this._marca = marca;
        this._tamaño = tamaño;
    }

    get idMonitor() {
        return this._idMonitor;
    }

    toString() {
        return `Monitor [ID: ${this._idMonitor}, Marca: ${this._marca}, Tamaño: ${this._tamaño}]`;
    }
}

class Computadora {
    static contadorComputadoras = 0;

    constructor(nombre, monitor, teclado, raton) {
        this._idComputadora = ++Computadora.contadorComputadoras;
        this._nombre = nombre;
        this._monitor = monitor;
        this._teclado = teclado;
        this._raton = raton;
    }

    toString() {
        return `Computadora [ID: ${this._idComputadora}, Nombre: ${this._nombre}]\n${this._monitor.toString()}\n${this._teclado.toString()}\n${this._raton.toString()}`;
    }
}

class Orden {
    static contadorOrdenes = 0;
    MAX_COMPUTADORAS = 10;

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._computadoras = [];
    }

    agregarComputadora(computadora) {
        if (this._computadoras.length < this.MAX_COMPUTADORAS) {
            this._computadoras.push(computadora);
        } else {
            console.log("No se pueden agregar más computadoras.");
        }
    }

    mostrarOrden() {
        let detalle = `Orden [ID: ${this._idOrden}]\n`;
        for (let computadora of this._computadoras) {
            detalle += computadora.toString() + '\n';
        }
        console.log(detalle);
    }
}

function describirDispositivo(dispositivo) {
    // Polimorfismo: acepta cualquier clase hija de DispositivoEntrada
    console.log(dispositivo.toString());
}

/*Creamos los objetos para armar la compu*/
let raton1 = new Raton("USB", "Logitech");
let teclado1 = new Teclado("Bluetooth", "Microsoft");

// Usamos el método polimórfico
describirDispositivo(raton1);    // Muestra datos específicos del ratón
describirDispositivo(teclado1);  // Muestra datos específicos del teclado

// Creamos un objeto monitor
let monitor1 = new Monitor("HP", "27 pulgadas");

// Creamos un objeto computadora con los objetos creados anteriormente
let computadora1 = new Computadora("HP Gamer", monitor1, teclado1, raton1);

// Creamos un objeto orden y agregamos la computadora
let orden1 = new Orden();
orden1.agregarComputadora(computadora1);
orden1.mostrarOrden();