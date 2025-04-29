'use strict'
// Como evitamos el error usando Try - Catch.
try{
let x = 10;
//miFuncion();
throw'Mi Error'; // Lanzamos un error
}catch(e){ // Atrapamos el error
    console.log('Error: ' + e.message);
    console.log(typeof(e));
}
finally{
    console.log('Termina la revision de errores.');
}
// Si no existe la funcion, lanzara un error
console.log('Continuamos...'); // Esto no se ejecuta por el error en la lineas anteriores sin try-catch.

let resultado = -5;

try{
    //y = 5;
    if (isNaN(resultado)){ // Comprobamos si es un número
        throw 'El resultado no es un número';
    }
    else if (resultado === ''){ // Comprobamos si es una cadena vacia
        throw 'El resultado es cadena vacia';
    }
    else if (resultado >=0){// Comprobamos si es un número positivo
        throw 'El valor es positivo';
    }
    else if (resultado <= 0){// Comprobamos si es un número negativo
        throw 'El valor es negativo';
    }
}
catch(error){
    console.log('Error: ' + error);
    console.log('Error: ' + error.name);
    console.log('Error: ' + error.message);
}
finally{
    console.log('Termina la revision de errores 2.');
}