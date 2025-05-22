let botonPersonajeJugador = document.getElementById('boton-personaje');
botonPersonajeJugador.addEventListener('click', seleccionarPersonajeJugador);

function seleccionarPersonajeJugador(){
    // Obtener los inputs de los personajes del html
    let zuko = document.getElementById('zuko');
    let katara = document.getElementById('katara');
    let aang = document.getElementById('aang');
    let toph = document.getElementById('toph');

    // Condicional que verifica cuál está seleccionado
    if (zuko.checked) { //checked es una propiedad que verifica si el input está seleccionado
        alert('Has seleccionado a Zuko');
    } else if (katara.checked) {
        alert('Has seleccionado a Katara');
    } else if (aang.checked) {
        alert('Has seleccionado a Aang');
    } else if (toph.checked) {
        alert('Has seleccionado a Toph');
    } else {
        alert('No seleccionaste ningún personaje');
    }
}

