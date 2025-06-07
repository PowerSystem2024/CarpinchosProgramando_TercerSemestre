
function torresDeHanoi(n, origen, destino, auxiliar) {
    if (n === 1) {
        console.log(`Mover disco 1 de ${origen} a ${destino}`);
        return;
    }

    // primero: mover n-1 discos del origen al auxiliar
    torresDeHanoi(n - 1, origen, auxiliar, destino);  

    // segundo: mover el disco más grande al destino
    console.log(`Mover disco ${n} de ${origen} a ${destino}`);

    // tercero: mover los n-1 discos del auxiliar al destino
    torresDeHanoi(n - 1, auxiliar, destino, origen);
}

// Probar con 3 discos
torresDeHanoi(3, 'A', 'C', 'B');


