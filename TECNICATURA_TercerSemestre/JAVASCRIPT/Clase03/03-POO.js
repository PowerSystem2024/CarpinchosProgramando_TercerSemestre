class Empleado{
    constructor(nombre, sueldo) {// Atributos protegidos (por convención se usa _ para indicar que no se deben modificar directamente)
        this._nombre = nombre;
        this._sueldo = sueldo;
    }

    obtenerDetalles(){
        return `Empleado: Nombre: ${this._nombre}, Sueldo: ${this._sueldo}`;
    }
}

class Gerente extends Empleado{
    constructor(nombre, sueldo, departamento){
        super(nombre, sueldo); // Llamamos al constructor de la clase padre (Empleado)
        this._departamento = departamento; // Atributo adicional específico de Gerente
    }

    obtenerDetalles(){     // Sobrescribimos el método obtenerDetalles para incluir información del departamento
        return `Gerente: ${super.obtenerDetalles()}, Departamento: ${this._departamento}`;
    }
}

function imprimir(tipo) { // Función que recibe un objeto y llama a su método obtenerDetalles
    console.log(tipo.obtenerDetalles());
    if(tipo instanceof Gerente) { // Verificamos si el objeto es una instancia de Gerente
        console.log("Es un objeto de tipo Gerente");
        console.log(tipo._departamento); // Accedemos al atributo específico de Gerente
        
    }
    else if(tipo instanceof Empleado) { // Verificamos si el objeto es una instancia de Empleado
        console.log("Es un objeto de tipo Empleado");
    }
    else if(tipo instanceof Object) { // Verificamos si el objeto es una instancia de Object, clase padre de todas las clases
        console.log("Es un objeto de tipo Object"); // El orden siempre es jerárquico, primero se verifica el tipo más específico
    }
    else {
        console.log("Tipo no reconocido");
    }
}

// Creamos una instancia de Empleado
let empleado1 = new Empleado("Juan", 3000);
// Creamos una instancia de Gerente
let gerente1 = new Gerente("Carlos", 8000, "Sistemas");

console.log(gerente1.obtenerDetalles());
console.log(empleado1.obtenerDetalles());

// Aunque la función es la misma, el método que se ejecuta depende del tipo real del objeto
imprimir(empleado1);
imprimir(gerente1);