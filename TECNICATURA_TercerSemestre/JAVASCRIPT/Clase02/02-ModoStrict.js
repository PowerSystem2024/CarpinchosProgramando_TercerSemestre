"use strict"; // Activa el modo estricto de JavaScript a nivel global, lo que ayuda a escribir un código más seguro y limpio

let x = 10; // Declara una variable 'x' con valor 10
console.log(x); // Muestra el valor de 'x' en la consola

function miFuncion() {
    "use strict"; // Activa el modo estricto dentro de la función (redundante si ya está activado globalmente)

    let y = 10; // Declara una variable 'y' con valor 10 dentro del ámbito de la función
    console.log(y); // Muestra el valor de 'y' en la consola
}

miFuncion(); // Llama a la función 'miFuncion' para ejecutar su contenido
