function obtenerNumeroAleatorio(min, max) {

  return Math.floor(Math.random() * (max - min + 1) + min);
}

function eleccion(jugada) {
  let resultado = "";
  if (jugada == 1) {
    resultado = "Piedra";
  } else if (jugada == 2) {
    resultado = "Papel";
  } else if (jugada == 3) {
    resultado = "Tijera";
  } else {
    resultado = "Mal elegido";
  }

  return resultado;
}

function reiniciar() {
let triunfos = 0;
let perdidas = 0;
let jugador = 0;
let pc = 0;

while (triunfos < 3 && perdidas < 3) {
  pc = obtenerNumeroAleatorio(1, 3);
  jugador = prompt("Elige : 1 piedra, 2 papel, 3 tijera");

  alert("PC elige: " + eleccion(pc));
  alert("Tu eliges: " + eleccion(jugador));

  //Combate
  if (jugador == pc) {
    alert("EMPATE");
  } else if ((jugador == 1 && pc == 3) || (jugador == 2 && pc == 1) || (jugador == 3 && pc == 2)) {
    alert("GANASTE");
    triunfos = triunfos + 1;
  } else {
    alert("PERDISTE");
    perdidas = perdidas + 1;
  }
}

alert("Ganaste " + triunfos + " veces. Perdiste: " + perdidas + " veces.");
}
window.onload = reiniciar //Le dice al navegador que cuando se cargue la página, ejecutá la función reiniciar()