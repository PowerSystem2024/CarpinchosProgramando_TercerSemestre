function seleccionarPersonajeJugador() {
    // Obtener los inputs de los personajes del HTML
    let zuko = document.getElementById('zuko');
    let katara = document.getElementById('katara');
    let aang = document.getElementById('aang');
    let toph = document.getElementById('toph');
    let spanPersonajeJugador = document.getElementById('personaje-jugador');

    // Condicional que verifica cuál está seleccionado
    if (zuko.checked) { // `checked` es una propiedad que verifica si el input está seleccionado
        spanPersonajeJugador.innerHTML = 'Zuko';
    } else if (katara.checked) {
        spanPersonajeJugador.innerHTML = 'Katara';
    } else if (aang.checked) {
        spanPersonajeJugador.innerHTML = 'Aang';
    } else if (toph.checked) {
        spanPersonajeJugador.innerHTML = 'Toph';
    } else {
        alert('No seleccionaste ningún personaje');
        return; // Terminar la función si no hay ningún personaje seleccionado
    }

    // Llamar a la función para que la PC elija su personaje
    aleatoria();
}

function iniciarJuego() {
    let botonPersonajeJugador = document.getElementById('boton-personaje');
    // Agregar un evento al botón de seleccionar personaje
    botonPersonajeJugador.addEventListener('click', seleccionarPersonajeJugador);
}

function aleatoria() {
    let personajes = ['Zuko', 'Katara', 'Aang', 'Toph'];
    let personajeAleatorio = personajes[Math.floor(Math.random() * personajes.length)];
    let spanPersonajeEnemigo = document.getElementById('personaje-enemigo');
    spanPersonajeEnemigo.innerHTML = personajeAleatorio;
}

// Iniciar el juego cuando la página haya cargado
window.addEventListener('load', iniciarJuego);