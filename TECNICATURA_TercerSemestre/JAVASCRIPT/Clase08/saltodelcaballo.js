const N = 8; // Tamaño del tablero 8x8

// Posibles movimientos del caballo
const movimientosX = [2, 1, -1, -2, -2, -1, 1, 2];
const movimientosY = [1, 2, 2, 1, -1, -2, -2, -1];

// Función para verificar si la posición es válida
function esValido(x, y, tablero) {
    return x >= 0 && y >= 0 && x < N && y < N && tablero[x][y] === -1;
}

// Función para imprimir el tablero
function imprimirTablero(tablero) {
    for (let fila of tablero) {
        console.log(fila.map(n => (n < 10 ? '0' + n : n)).join(" "));
    }
}

// Algoritmo principal: Knight's Tour usando Backtracking
function resolverSaltoDelCaballo() {
    // Crear tablero de NxN con todas las celdas inicializadas a -1
    const tablero = Array.from({ length: N }, () => Array(N).fill(-1));

    // El caballo comienza en la posición (0, 0)
    tablero[0][0] = 0;

    // Llamar a la función recursiva
    if (resolverSDCUtil(0, 0, 1, tablero)) {
        console.log("Solución encontrada:");
        imprimirTablero(tablero);
    } else {
        console.log("No existe solución");
    }
}

// Función recursiva de backtracking
function resolverSDCUtil(x, y, paso, tablero) {
    // Caso base: si se completaron los 64 pasos
    if (paso === N * N) return true;

    for (let i = 0; i < 8; i++) {
        const siguienteX = x + movimientosX[i];
        const siguienteY = y + movimientosY[i];

        if (esValido(siguienteX, siguienteY, tablero)) {
            tablero[siguienteX][siguienteY] = paso;

            if (resolverSDCUtil(siguienteX, siguienteY, paso + 1, tablero)) {
                return true;
            }

            // Backtracking
            tablero[siguienteX][siguienteY] = -1;
        }
    }

    return false;
}

// Ejecutar
resolverSaltoDelCaballo();
