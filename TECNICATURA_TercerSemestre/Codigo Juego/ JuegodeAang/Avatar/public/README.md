# Carpinchos Programando  
![carpincho](https://github.com/user-attachments/assets/34c61984-7f45-403c-a3ae-a57dd16a27bf) 

# 🎮 Avatar: La Leyenda de Aang

## 🌟 Descripción

Un divertido juego inspirado en la serie “Avatar: La Leyenda de Aang”, donde podés elegir a tu personaje favorito y enfrentarte a un oponente en emocionantes combates por turnos usando ataques físicos.

---

## 🎯 Características Principales

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

---

## 🛠️ Tecnologías Utilizadas
- HTML5  
- CSS3  
- JavaScript (vanilla)  
- DOM (Document Object Model)

---

## 🎨 Interfaz del Juego
- Diseño responsive  
- Personajes con imágenes redondeadas  
- Botones de ataque interactivos  
- Panel de mensajes dinámico  
- Indicadores de vidas  
- Botón de reinicio funcional

---

## 🕹️ ¿Cómo Jugar?

1. Seleccioná tu personaje y hacé clic en el botón “Seleccionar”.  
2. El juego asignará un oponente aleatorio.  
3. Elegí uno de los tres ataques disponibles.  
4. El enemigo también atacará de forma aleatoria.  
5. ¡Ganás si dejás sin vidas al enemigo!

---

## 🎯 Objetivo

Derrotar al oponente reduciendo sus vidas a 0 utilizando estrategia y suerte en el sistema de combate.

---

## 📚 ¿Qué es el DOM?

El **Document Object Model (DOM)** es la forma en que el navegador organiza internamente las etiquetas HTML para que JavaScript pueda manipularlas dinámicamente.

- `window` representa todo el navegador  
- `document` representa solo el contenido de la página web  
- Los botones, imágenes y textos viven dentro del `document`

Podemos usar funciones llamadas **event listeners** para detectar interacciones como clics, movimientos o cambios, y ejecutar respuestas dinámicas en el juego.

---

## 🔁 Eventos del Juego

El juego usa `addEventListener` para:

- Detectar clics en los botones de ataque  
- Escuchar cuándo se selecciona un personaje  
- Ejecutar lógica de combate y mostrar mensajes  
- Controlar el reinicio del juego

---

## 📝 Notas Adicionales

Este juego es completamente interactivo gracias al uso del DOM y los event listeners.  
Ideal para aprender cómo combinar JavaScript con interfaces dinámicas, lógica de combate y control de flujo según las decisiones del usuario.

---

**¡Que comience la batalla!**