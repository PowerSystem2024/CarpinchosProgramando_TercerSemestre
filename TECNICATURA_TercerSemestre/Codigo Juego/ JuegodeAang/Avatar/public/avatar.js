let ataqueJugador;
let ataqueEnemigo;
let vidaJugador = 3;
let vidaEnemigo = 3;

function seleccionarPersonajeJugador() {
    let zuko = document.getElementById('zuko');
    let katara = document.getElementById('katara');
    let aang = document.getElementById('aang');
    let toph = document.getElementById('toph');
    let spanPersonajeJugador = document.getElementById('personaje-jugador');
    let sectionSeleccionarAtaque = document.getElementById('seleccionar-ataque');
    let sectionSeleccionarPersonaje = document.getElementById('seleccionar-personaje');

    if (zuko.checked) {
        spanPersonajeJugador.innerHTML = 'Zuko';
    } else if (katara.checked) {
        spanPersonajeJugador.innerHTML = 'Katara';
    } else if (aang.checked) {
        spanPersonajeJugador.innerHTML = 'Aang';
    } else if (toph.checked) {
        spanPersonajeJugador.innerHTML = 'Toph';
    } else {
        // Mostrar mensaje visual en lugar de alert
        let mensajeError = document.createElement("p");
        mensajeError.innerHTML = 'Por favor, selecciona un personaje☝️';
        mensajeError.style.color = "red";
        sectionSeleccionarPersonaje.appendChild(mensajeError);

        setTimeout(() => {
            sectionSeleccionarPersonaje.removeChild(mensajeError);
        }, 2000);
        return; // <== importante: corta la función antes de seguir
    }

    // Solo se ejecuta si la selección fue válida
    sectionSeleccionarAtaque.style.display = 'block';
    sectionSeleccionarPersonaje.style.display = 'none';
    seleccionarPersonajeEnemigo();
}

function iniciarJuego() {
    let sectionSeleccionarAtaque = document.getElementById('seleccionar-ataque')
    sectionSeleccionarAtaque.style.display = 'none';

    let sectionReiniciar = document.getElementById('reiniciar');
    sectionReiniciar.style.display = 'none';

    let sectionMensajes = document.getElementById('mensajes')
    sectionMensajes.style.display = 'none';

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
    
    document.getElementById('boton-reglas').addEventListener('click', mostrarReglas);
    document.getElementById('cerrar-reglas').addEventListener('click', cerrarReglas);
    
    // Cierra el modal al hacer clic fuera del contenido
    window.addEventListener('click', function(event) {
        const modal = document.getElementById('modal-reglas');
        if (event.target === modal) {
            modal.style.display = 'none';
        }
    });
}

function seleccionarPersonajeEnemigo() {
    let personajes = ["Zuko", "Katara", "Aang", "Toph"];
    let personajeAleatorio =
    personajes[Math.floor(Math.random() * personajes.length)];
    let spanPersonajeEnemigo = document.getElementById("personaje-enemigo");
    spanPersonajeEnemigo.innerHTML = personajeAleatorio;
}

function ataquePunio() {
    ataqueJugador = " Puño 🤜🏻 "
    ataqueAleatorioEnemigo()
}

function ataquePatada() {
    ataqueJugador = " Patada 🦵🏻"
    ataqueAleatorioEnemigo()
}

function ataqueBarrida() {
    ataqueJugador = " Barrida 🦶🏻 "
    ataqueAleatorioEnemigo()
}

function ataqueAleatorioEnemigo() {
    let ataqueAleatorio = Math.floor(Math.random() * 3);
    if (ataqueAleatorio == 0){
        ataqueEnemigo = " Puño 🤜🏻 "
    } else if (ataqueAleatorio == 1){
        ataqueEnemigo = " Patada 🦵🏻"
    } else {
        ataqueEnemigo = " Barrida 🦶🏻 "
    }

    combate()
}

function combate() {
    let sectionMensajes = document.getElementById('mensajes')
    sectionMensajes.style.display = 'block';

    let spanVidasJugador = document.getElementById('vida-jugador');
    let spanVidasEnemigo = document.getElementById('vida-enemigo');

    if (ataqueEnemigo === ataqueJugador) {
        crearMensaje("EMPATE");
    } else if (
        (ataqueJugador === " Puño 🤜🏻 " && ataqueEnemigo === " Barrida 🦶🏻 ") ||
        (ataqueJugador === " Patada 🦵🏻" && ataqueEnemigo === " Puño 🤜🏻 ") ||
        (ataqueJugador === " Barrida 🦶🏻 " && ataqueEnemigo === " Patada 🦵🏻")
    ) {
        crearMensaje("GANASTE");
        vidaEnemigo--; // Resta una vida al enemigo
        spanVidasEnemigo.innerHTML = vidaEnemigo; // Actualiza el DOM
    } else {
        crearMensaje("PERDISTE");
        vidaJugador--; // Resta una vida al jugador
        spanVidasJugador.innerHTML = vidaJugador;
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
    let mensajes = document.querySelector('#mensajes p'); //querySelector selecciona un solo elemento del DOM y '#mensajes p' selecciona el elemento con id="mensajes"

    mensajes.innerHTML += `<br>Tu personaje lanzó ${ataqueJugador} y el enemigo lanzó ${ataqueEnemigo}: ${resultado}`;
}

function crearMensajeFinal(resultadoFinal) {
    let mensajes = document.querySelector('#mensajes p');
    mensajes.innerHTML = resultadoFinal;

    // Deshabilitar botones de ataque tras terminar el juego
    document.getElementById("boton-punio").disabled = true;
    document.getElementById("boton-patada").disabled = true;
    document.getElementById("boton-barrida").disabled = true;

    let sectionReiniciar = document.getElementById('reiniciar');
    sectionReiniciar.style.display = 'block';

}

function reiniciarJuego() {
    // Reiniciar las vidas a 3
    vidaJugador = 3;
    vidaEnemigo = 3;

    // Reiniciar los textos de vidas en el DOM
    document.getElementById('vida-jugador').innerHTML = vidaJugador;
    document.getElementById('vida-enemigo').innerHTML = vidaEnemigo;

    // Vaciar los mensajes
    let mensajes = document.querySelector('#mensajes p');
    mensajes.innerHTML = "";

    // Resetear la selección de personajes
    document.getElementById('personaje-jugador').innerHTML = "";
    document.getElementById('personaje-enemigo').innerHTML = "";

    document.querySelectorAll('input[type="radio"]').forEach(input => {
        input.checked = false;
        input.disabled = false; // Asegura que estén habilitados
    });

    // Habilitar los botones de ataque
    document.getElementById("boton-punio").disabled = false;
    document.getElementById("boton-patada").disabled = false;
    document.getElementById("boton-barrida").disabled = false;

    alert("Juego reiniciado. Selecciona nuevamente tu personaje.");
    let sectionSeleccionarPersonaje = document.getElementById('seleccionar-personaje');
    sectionSeleccionarPersonaje.style.display = 'block'
    iniciarJuego();
    }

function mostrarReglas(){
        const modal = document.getElementById('modal-reglas');
        modal.style.display = 'flex';
    }
    
function cerrarReglas(){
        const modal = document.getElementById('modal-reglas');
        modal.style.display = 'none';
    }
    

// Iniciar el juego cuando la página haya cargado
window.addEventListener('load', iniciarJuego);