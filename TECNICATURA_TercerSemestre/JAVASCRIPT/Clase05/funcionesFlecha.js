// Ejemplo de función clásica
// Definición de función
miFuncion();

// Hosting - Llamar a la función antes de ser declarada.
function miFuncion(){
    console.log('¡Saludos desde mi función!');
}

// Declaración de variable con función anónima
let myFuncion = function(){
    console.log('¡Saludos desde mi función anónima!');    
}

// Función flecha
// Son funciones anónimas. Es decir, no se utilizarán nombres para las funciones.
// No se aplica el hosting, hay que definirlas con anterioridad.

// Sintáxis formal
// Declaración de Variable = (Argumentos) => {}
let miFuncionFlecha = () => {
    console.log('¡Saludos desde mi función flecha!'); 
}

miFuncionFlecha();

// Sintáxis de una sola línea
const saludar = () => console.log('Saludos a todos desde esta función flecha.');
saludar();
// console.log(saludar()); -> Es redundante el console.log, mostrará undefined.

// Sintáxis formal con return
const saludar2 = () => {
    return 'Saludos desde la función flecha dos'
}
console.log(saludar2());

// Sintáxis simplificada
const saludar3 = () => 'Saludos desde la función flecha tres.'
console.log(saludar3());

// Función Flecha que regresa objetos 
const regresaObjeto = () => ({Nombre: 'Ana', Apellido: 'Ríos'});
console.log(regresaObjeto());

// Función Flecha que reciben parámetros
const funcionParametros = (mensaje) => console.log(mensaje);
funcionParametros('Saludos desde la función con parámetros.');

// Función con parámetros clásica
const funcionParametrosClasica = function(mensaje){
    console.log(mensaje);
}
funcionParametrosClasica('Saludos desde la función con parámetros clásica.');

// Sintáxis simplificada
// En la función flecha se puede omitir el uso de paréntesis.
const funcionConParametros = mensaje => console.log(mensaje);
funcionConParametros('Otra forma de trabajar con la función flecha.');

// Sintáxis simplificada
// Función flecha con varios parámetros
const funcionConParametros2 = (op1, op2) => op1 + op2;
console.log(funcionConParametros2(3, 5));

// Sintáxis extendida
const funcionConParametros3 = (op1, op2) => {
    let resultado = op1 + op2;
    return resultado;
}
console.log(funcionConParametros3(2, 8));
