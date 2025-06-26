![Juego LLDA](https://github.com/MerAtim/UTN-Tercer-Semestre/blob/main/assets/Juego%20LLDA.png?raw=true)

# 🎮 Avatar: La Leyenda de Aang

## 🌟 Descripción

Un divertido juego inspirado en la serie “Avatar: La Leyenda de Aang”, donde podés elegir a tu personaje favorito y enfrentarte a un oponente en emocionantes combates por turnos usando ataques físicos.



## 🎯 Características Principales

### ⚙️ Reglas del Juego

- El usuario puede ver las reglas del juego presionando un boton.
- Las reglas tienen un lenguaje simple y claro para mejor entendimiento.
- Pueden ocultarse para evitar que interfiera en el juego.

### 👥 Selección de Personajes

- Zuko 🔥  
- Katara 💧  
- Aang 💨  
- Toph ⛰️  

Seleccioná tu personaje y combatí contra un oponente elegido aleatoriamente.

### ⚔️ Sistema de Combate 
- Tipos de ataque:  
  - 👊 Puño  
  - 🦶 Patada  
  - 🔁 Barrida  

- Lógica estilo piedra-papel-tijera:  
  - Puño vence a Barrida  
  - Patada vence a Puño  
  - Barrida vence a Patada  

- Sistema de vidas:  
  - Ambos jugadores comienzan con 3 vidas  
  - Cada ataque exitoso reduce 1 vida del oponente

### 🧠 Inteligencia del Enemigo

- El enemigo elige su ataque de forma aleatoria  
- El resultado de cada ronda se muestra en pantalla

### 🛎️ Final del Juego

- Cuando un jugador pierde todas las vidas, se muestra un mensaje de victoria o derrota  
- Los botones de ataque se desactivan al finalizar el juego  
- Se puede reiniciar la partida con un botón



## 🛠️ Tecnologías Utilizadas
- HTML5  
- CSS3  
- JavaScript (vanilla)  
- DOM (Document Object Model)



## 🎨 Interfaz del Juego
- Diseño responsive  
- Personajes con imágenes redondeadas  
- Botones de ataque interactivos  
- Panel de mensajes dinámico  
- Indicadores de vidas  
- Botón de reinicio funcional



## 🕹️ ¿Cómo Jugar?

1. Seleccioná tu personaje y hacé clic en el botón “Seleccionar”.  
2. El juego asignará un oponente aleatorio.  
3. Elegí uno de los tres ataques disponibles.  
4. El enemigo también atacará de forma aleatoria.  
5. ¡Ganás si dejás sin vidas al enemigo!



## 🎯 Objetivo

Derrotar al oponente reduciendo sus vidas a 0 utilizando estrategia y suerte en el sistema de combate.



**¡Que comience la batalla!**



<br>

---

<br>


## 📑 Tabla de contenidos

- 🧠 Conceptos clave explicados
  - 📌 ¿Qué es el DOM?
  - 🎮 Eventos del Juego
  - 🏷️ ¿Qué hace un label?
  - 🏷️ ¿Qué es un span?
  - 🔍 ¿Para qué se usa getElementById?
  - 🧱 Extructuras fundamentales que usamos en JavaScript
- 🎨 Estilos con CSS

<br>

# 🧠 Conceptos clave explicados

<br>
<br>

## 📚 ¿Qué es el DOM?

El **Document Object Model (DOM)** es la forma en que el navegador organiza internamente las etiquetas HTML para que JavaScript pueda manipularlas dinámicamente. 
Es la representación en forma de árbol del contenido HTML. Nos permite **interactuar dinámicamente con los elementos** desde JavaScript: cambiarlos, ocultarlos, agregarles estilos o escuchar sus eventos.

- `window` representa todo el navegador  
- `document` representa solo el contenido de la página web  
- Los botones, imágenes y textos viven dentro del `document`

Podemos usar funciones llamadas **event listeners** para detectar interacciones como clics, movimientos o cambios, y ejecutar respuestas dinámicas en el juego.


<br>


## 🔁 Eventos del Juego

El juego usa `addEventListener` para:

- Detectar clics en los botones de ataque  
- Escuchar cuándo se selecciona un personaje  
- Ejecutar lógica de combate y mostrar mensajes  
- Controlar el reinicio del juego

      
       boton.addEventListener("click", funcionQueSeEjecuta);
      



## 🏷️ ¿Qué hace un `label`?

Un `<label>` se asocia a un campo de formulario (`input`). Sirve para **mejorar la accesibilidad y usabilidad**, permitiendo que al hacer clic en el texto también se seleccione el elemento relacionado:

      
      <input type="radio" id="zuko" name="personaje">
      <label for="zuko">Zuko</label>
      


## 🏷️ ¿Qué es un span?

`<span>` es una etiqueta en HTML usada para agrupar texto sin que tenga un formato visual especial como los encabezados `(<h1>)` o párrafos `(<p>)`.
Se usa cuando querés aplicar estilos o modificar partes específicas del texto.

🔸 En el juego, usamos `<span>` para mostrar dinámicamente los nombres de los personajes y las vidas:

    Tu personaje <span id="personaje-jugador"></span> tiene <span id="vida-jugador">3</span> vidas

Y luego `JavaScript` cambia ese contenido con `innerHTML`.


<br>


## 🔍 ¿Para qué se usa getElementById?

La función getElementById se usa en `JavaScript` para obtener un `elemento del HTML` usando su atributo `id`. Una vez que lo tenemos, podemos modificarlo, agregarle clases, texto, o eventos:

    
    let boton = document.getElementById("boton-reiniciar");
    boton.addEventListener("click", reiniciarJuego);
    
<br>


## 🧱 Estructuras fundamentales para explicar

<br>

🔁 if, else if, else <br>
Permite tomar decisiones. En el juego las usamos para comparar ataques y definir quién gana.

    
    if (ataqueJugador === ataqueEnemigo) {
    // Empate
    } else if (ataqueJugador === "Puño" && ataqueEnemigo === "Barrida") {
      // Ganaste
    }
    

<br>

🔄 Math.random() <br>
Sirve para obtener un número aleatorio. Se usa para que el enemigo elija ataque o personaje al azar.

    
    let numeroAleatorio = Math.floor(Math.random() * 3);
    

<br>

🧩 Funciones <br>
Son bloques de código que hacen algo específico. Por ejemplo, una función para reiniciar el juego:

    
    function reiniciarJuego() {
      // reiniciar juego
    }
    

<br>


📝 innerHTML <br>
Permite cambiar el contenido de un elemento HTML desde JavaScript.

    
    document.getElementById("vida-jugador").innerHTML = 2;
    

<br>


🎯 querySelector() <br>
Es similar a getElementById, pero más flexible: permite seleccionar por clase, etiqueta, o combinaciones.

    
    let mensaje = document.querySelector('#mensajes p');
    

<br>

⏳ setTimeout() <br>
Ejecuta algo después de cierto tiempo. Se usa en tu juego para mostrar errores temporales como cuando no se elige un personaje.

   
    setTimeout(() => {
    mensaje.remove();
    }, 2000);


<br>


✅ checked <br>
checked es una propiedad de los botones tipo radio o checkbox.
Sirve para saber si ese botón está seleccionado.

🔸 En el juego, lo usamos para saber qué personaje eligió el usuario:

    if (zuko.checked) {
      spanPersonajeJugador.innerHTML = 'Zuko';
    }


También se puede asignar:

    document.getElementById("zuko").checked = true;


<br>

## 🎨 Estilos con CSS
Usamos fuentes de `Google Fonts` como Overlock SC, Nunito, etc (importamos).

Fondo animado con background-image.

Sombra en los textos (text-shadow) y efectos en los botones (box-shadow, border-radius).

Modal de reglas con bordes animados usando SVG en background.


<br>

## 📝 Notas Adicionales

Este juego es completamente interactivo gracias al uso del DOM y los event listeners.  
Ideal para aprender cómo combinar JavaScript con interfaces dinámicas, lógica de combate y control de flujo según las decisiones del usuario.

---
