class Empleado {
    // Constructor de la clase Empleado que recibe nombre y sueldo
    constructor(nombre, sueldo){
        this._nombre = nombre;  // Asigna el nombre al atributo privado _nombre
        this._sueldo = sueldo;  // Asigna el sueldo al atributo privado _sueldo
    }

    // Método para obtener los detalles del empleado como string
    obtenerDetalles(){
        return `Empleado: nombre: ${this._nombre},
                sueldo: ${this._sueldo}`;
    }    
}

class Gerente extends Empleado {
    // Constructor de la clase Gerente que hereda de Empleado y agrega departamento
    constructor(nombre, sueldo, departamento){
        super(nombre, sueldo);  // Llama al constructor de la clase padre para nombre y sueldo
        this._departamento = departamento;  // Asigna el departamento al atributo privado _departamento
    }

    // Sobrescribe el método obtenerDetalles para incluir el departamento
    obtenerDetalles(){
        return `Gerente: ${super.obtenerDetalles()} depto: ${this._departamento}`;
    }
}

let gerente1 = new Gerente("Carlos", 5000, "Sistemas"); // Crea un objeto Gerente con nombre, sueldo y departamento
console.log(gerente1); // Muestra en consola el objeto Gerente (incluye sus propiedades)

let empleado1 = new Empleado("Juan", 3000); // Crea un objeto Empleado con nombre y sueldo
console.log(empleado1); // Muestra en consola el objeto Empleado
