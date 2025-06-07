let ataqueJugador;
let ataqueEnemigo;
let vidaJugador = 3;
let vidaEnemigo = 3;

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
    seleccionarPersonajeEnemigo();

}

function iniciarJuego() {
    let botonPersonajeJugador = document.getElementById('boton-personaje');
    // Agregar un evento al botón de seleccionar personaje
    botonPersonajeJugador.addEventListener('click', seleccionarPersonajeJugador);

    let botonPunio = document.getElementById("boton-punio");
    botonPunio.addEventListener("click", ataquePunio);
    let botonPatada = document.getElementById("boton-patada");
    botonPatada.addEventListener("click", ataquePatada);
    let botonBarrida = document.getElementById("boton-barrida");
    botonBarrida.addEventListener("click", ataqueBarrida);

    let botonReiniciar = document.getElementById('boton-reiniciar');
    botonReiniciar.addEventListener('click', reiniciarJuego);
}

function seleccionarPersonajeEnemigo() {
    let personajes = ["Zuko", "Katara", "Aang", "Toph"];
    let personajeAleatorio =
    personajes[Math.floor(Math.random() * personajes.length)];
    let spanPersonajeEnemigo = document.getElementById("personaje-enemigo");
    spanPersonajeEnemigo.innerHTML = personajeAleatorio;
}

function ataquePunio() {
    ataqueJugador = "Puño"
    ataqueAleatorioEnemigo()
}

function ataquePatada() {
    ataqueJugador = "Patada"
    ataqueAleatorioEnemigo()
}

function ataqueBarrida() {
    ataqueJugador = "Barrida"
    ataqueAleatorioEnemigo()
}

function ataqueAleatorioEnemigo() {
    let ataqueAleatorio = Math.floor(Math.random() * 3);
    if (ataqueAleatorio == 0){
        ataqueEnemigo = "Puño"
    } else if (ataqueAleatorio == 1){
        ataqueEnemigo = "Patada"
    } else {
        ataqueEnemigo = "Barrida"
    }

    combate()
}

function combate() {
    let spanVidasJugador = document.getElementById('vida-jugador');
    let spanVidasEnemigo = document.getElementById('vida-enemigo');

    if (ataqueEnemigo === ataqueJugador) {
        crearMensaje("EMPATE");
    } else if (
        (ataqueJugador === 'Puño' && ataqueEnemigo === 'Barrida') ||
        (ataqueJugador === 'Patada' && ataqueEnemigo === 'Puño') ||
        (ataqueJugador === 'Barrida' && ataqueEnemigo === 'Patada')
    ) {
        crearMensaje("GANASTE");
        vidaEnemigo--; // Resta una vida al enemigo
        spanVidasEnemigo.innerHTML = vidaEnemigo; // Actualiza el DOM
    } else {
        crearMensaje("PERDISTE");
        vidaJugador--; // Resta una vida al jugador
        spanVidasJugador.innerHTML = vidaJugador; // Actualiza el DOM
    }

    revisarVidas(); // Verifica si alguien ganó o perdió
}

function revisarVidas(){
    if(vidaEnemigo == 0){
        //Ganamos
        crearMensajeFinal("Felicidades, ganaste el juego! 🤩🥳🎉")
    } else if(vidaJugador == 0){
        //Perdimos
        crearMensajeFinal("Perdiste, Mejor suerte la próxima vez! 😢😭😭😭");
    }
}

function crearMensaje(resultado) {
    let mensajes = document.querySelector('#mensajes p');
    mensajes.innerHTML += `<br>Tu personaje lanzó ${ataqueJugador} y el enemigo lanzó ${ataqueEnemigo}: ${resultado}`;
}

function crearMensajeFinal(resultadoFinal) {
    let mensajes = document.querySelector('#mensajes p');
    mensajes.innerHTML = resultadoFinal;

    // Deshabilitar botones de ataque tras terminar el juego
    document.getElementById("boton-punio").disabled = true;
    document.getElementById("boton-patada").disabled = true;
    document.getElementById("boton-barrida").disabled = true;
}

// Iniciar el juego cuando la página haya cargado
window.addEventListener('load', iniciarJuego);
