function resolverNReinas(N) { //Empezamos con la función resolverNReinas que toma un número entero N como argumento.
if (N < 8) { // Verificamos si N es menor que 8
    console.log("El valor mínimo permitido para N es 8.");
    return;
}

const tablero = Array.from({ length: N }, () => Array(N).fill(".")); // Creamos un tablero de N x N inicializado con puntos (".") que representan espacios vacíos.
  const reinas = []; // Arreglo con las columnas donde se ubica cada reina

function imprimirTablero(tab) { // Función para imprimir el tablero
    console.log(tab.map(fila => fila.join(" ")).join("\n")); // Convertimos cada fila del tablero en una cadena y luego unimos todas las filas con saltos de línea.
    console.log("-".repeat(N * 2)); // Imprimimos una línea separadora para mejorar la legibilidad.
}

function esSeguro(fila, col) { // Función para verificar si es seguro colocar una reina en la posición (fila, col)
    for (let i = 0; i < fila; i++) { // Iteramos sobre las filas anteriores
    const j = reinas[i]; // Obtenemos la columna de la reina en la fila i
    if (j === col || i + j === fila + col || i - j === fila - col) { // Verificamos si hay una reina en la misma columna o en las diagonales
        return false;
    }
    }
    return true;
}

function backtrack(fila) { // Función de retroceso para colocar reinas
    if (fila === N) return true; // Si hemos colocado reinas en todas las filas, retornamos verdadero.

    for (let col = 0; col < N; col++) { // Iteramos sobre todas las columnas
    if (esSeguro(fila, col)) { // Verificamos si es seguro colocar una reina en la posición (fila, col)
        reinas[fila] = col; // Guardamos la columna de la reina en el arreglo reinas
        tablero[fila][col] = "👑"; // Colocamos una reina en el tablero
        imprimirTablero(tablero); // Mostramos el tablero actual con la reina colocada
        if (backtrack(fila + 1)) return true; // Llamamos recursivamente a la función de retroceso para la siguiente fila
        // Retroceso
        tablero[fila][col] = "."; // Si no encontramos solución, retiramos la reina de la posición (fila, col)
        reinas[fila] = undefined; // Limpiamos el arreglo reinas
    }
    }
    return false;
}

if (backtrack(0)) { // Iniciamos el proceso de retroceso desde la fila 0
    console.log("Tablero final con todas las reinas:"); // Si encontramos una solución, imprimimos el tablero final
    imprimirTablero(tablero); // Mostramos el tablero final
    console.log("Arreglo de índices (columna por cada fila):", reinas); // Mostramos el arreglo de reinas
} else {
    console.log("No se encontró solución.");
}
}

// Ejemplo de uso con N = 8
resolverNReinas(8);