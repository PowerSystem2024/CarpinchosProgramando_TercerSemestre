window.human = false; // seteamos esta variable para que no se ejecute el efecto de particulas al cargar la pagina

var canvasEl = document.querySelector('.fireworks');  // Seleccionamos el canvas donde se dibujarán las partículas
var ctx = canvasEl.getContext('2d'); // Obtenemos el contexto del canvas para poder dibujar en él
var numberOfParticules = 50; // Número de partículas que se generarán al hacer clic
var pointerX = 0; // Definimos las coordenadas del puntero
var pointerY = 0;
var tap = ('ontouchstart' in window || navigator.msMaxTouchPoints) ? 'touchstart' : 'mousedown'; // Detectamos si el dispositivo es táctil o no para asignar el evento adecuado
// Si es táctil, usamos 'touchstart', si no, usamos 'mousedown' para detectar los clics del ratón
var colors = ['#FF1461', '#18FF92', '#5A87FF', '#FBF38C', '#FF61A6', '#FF6A5C',  "#FF00FF", "#00FFFF", "#FF4500", "#FFFF00", "#ADFF2F", "#FF1493", "#8A2BE2", "#00FF00", "#FF6347","#FFD700" ];

function setCanvasSize() { // Esta función ajusta el tamaño del canvas al tamaño de la ventana
  canvasEl.width = window.innerWidth * 2;
  canvasEl.height = window.innerHeight * 2;
  canvasEl.style.width = window.innerWidth + 'px';
  canvasEl.style.height = window.innerHeight + 'px';
  canvasEl.getContext('2d').scale(2, 2);
}
function updateCoords(e) { // Esta función actualiza las coordenadas del puntero según el evento recibido
    pointerX = e.clientX || e.touches[0].clientX;
    pointerY = e.clientY || e.touches[0].clientY;
  }
  
  function setParticuleDirection(p) { // Esta función establece la dirección de las partículas
    var angle = anime.random(0, 360) * Math.PI / 180;
    var value = anime.random(50, 180);
    var radius = [-1, 1][anime.random(0, 1)] * value;
    return {
      x: p.x + radius * Math.cos(angle),
      y: p.y + radius * Math.sin(angle)
    }
  }
  
  function createParticule(x, y) { // Esta función crea una partícula con propiedades aleatorias
    var p = {};
    p.x = x;
    p.y = y;
    p.color = colors[anime.random(0, colors.length - 1)];
    p.radius = anime.random(16, 32);
    p.endPos = setParticuleDirection(p);
    p.draw = function () {
      ctx.beginPath();
      ctx.arc(p.x, p.y, p.radius, 0, 2 * Math.PI, true);
      ctx.fillStyle = p.color;
      ctx.fill();
    }
    return p;
  }
  
  function createCircle(x, y) { // Esta función crea un círculo que se usará como fondo para las partículas
    var p = {};
    p.x = x;
    p.y = y;
    p.color = '#FFF';
    p.radius = 0.1;
    p.alpha = .5;
    p.lineWidth = 6;
    p.draw = function () {
      ctx.globalAlpha = p.alpha;
      ctx.beginPath();
      ctx.arc(p.x, p.y, p.radius, 0, 2 * Math.PI, true);
      ctx.lineWidth = p.lineWidth;
      ctx.strokeStyle = p.color;
      ctx.stroke();
      ctx.globalAlpha = 1;
    }
    return p;
  }
  
  function renderParticule(anim) { // Esta función se encarga de renderizar las partículas y el círculo en el canvas
    for (var i = 0; i < anim.animatables.length; i++) {
      anim.animatables[i].target.draw(); // Llama al método draw de cada partícula o círculo
    }
  }
  
  function animateParticules(x, y) { // Esta función anima las partículas al hacer clic en el canvas
    var circle = createCircle(x, y);
    var particules = [];
    for (var i = 0; i < numberOfParticules; i++) {
      particules.push(createParticule(x, y)); // Crea un número determinado de partículas
    }
    anime.timeline().add({ // Crea una línea de tiempo de animación
      targets: particules,
      x: function (p) { return p.endPos.x; }, // Mueve las partículas a su posición final desde su posición inicial
      y: function (p) { return p.endPos.y; },
      radius: 0.1,
      duration: anime.random(1200, 1800),
      easing: 'easeOutExpo', // easeOutExpo es una función de easing que hace que la animación sea más suave al final
      update: renderParticule
    })
      .add({ // Añade una segunda animación a la línea de tiempo
        targets: circle,
        radius: anime.random(80, 160), // Aumenta el radio del círculo
        lineWidth: 0,
        alpha: { // Disminuye la opacidad del círculo
          value: 0,
          easing: 'linear',
          duration: anime.random(600, 800),
        },
        duration: anime.random(1200, 1800),
        easing: 'easeOutExpo',
        update: renderParticule
      }, 0);
  }
  
  var render = anime({
    duration: Infinity,
    update: function () {
      ctx.clearRect(0, 0, canvasEl.width, canvasEl.height); // Limpia el canvas en cada frame de animación
    }
  });
  
  document.addEventListener(tap, function (e) { // Añade un evento de clic o toque al documento
    window.human = true; // Cambia la variable human a true para indicar que el usuario ha interactuado con la página
    render.play();
    updateCoords(e);
    animateParticules(pointerX, pointerY);
  }, false);
  
  var centerX = window.innerWidth / 2; // Calcula el centro del canvas en el eje X
  var centerY = window.innerHeight / 2;
  
  
  setCanvasSize(); // Llama a la función para establecer el tamaño del canvas al cargar la página
  window.addEventListener('resize', setCanvasSize, false); // Añade un evento de cambio de tamaño de ventana para ajustar el canvas