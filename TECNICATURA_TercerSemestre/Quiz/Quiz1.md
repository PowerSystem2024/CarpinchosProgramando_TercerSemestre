# 📝 Quiz: Miércoles 23 de abril del 2025

## 1. Analiza el siguiente bloque de código:
```
saludo = "Hola" 

profesor = "Profe" 

alert(saludo + profesor)
```
Nos da como resultado el mensaje de: `HolaProfe`

### **¿Por qué sale todo pegado? ¿Cómo arreglarías el código para obtener el resultado correcto?**

**Respuesta Correcta:** <br>
**b.** Porque en nuestro código nunca especificamos que deberíamos insertar un espacio entre la suma (concatenación) de ambas variables. La forma de resolverlo sería agregar el espacio manualmente.

```alert(saludos +" "+ profesor)```

<br>

## 2. Analiza el siguiente bloque de código:
```
a = 10
b = 20

alert("La suma de 10 + 20 es: " + a + b)
```

Nos da como resultado el mensaje: ```La suma de 10 + 20 es: 1020.```

### **¿Por qué ocurre esto? ¿Cómo arreglarías el código para obtener el resultado correcto?**

**Respuesta Correcta:** <br>
**a.** Porque primero estamos concatenando un texto (String) con un número y esta operación nos da como resultado otro texto con el número al final. Luego repetimos esta operación con el siguiente número y obtenemos el texto con los números al final. <br>
Para obtener el resultado correcto, debemos encapsular la suma de números entre paréntesis y luego sí concatenar este resultado con el texto del mensaje.

```
a = 10
b = 20

alert("La suma de 10 + 20 es: " + (a + b))
```
<br>

## 3. ¿Qué hace el siguiente bloque de código?
```
Math.random()
```
**Respuesta Correcta:** <br>
**a.** Devuelve un número aleatorio entre 0 y 1. Porque `Math.random()` no recibe argumentos y siempre devuelve un número aleatorio entre 0 y 1.


# 📸 Capturas del envio

![WhatsApp Image 2025-06-19 at 21 34 27](https://github.com/user-attachments/assets/b61073bb-4dc5-4cae-9ee0-5319db33450b)

![WhatsApp Image 2025-06-19 at 21 34 27 (1)](https://github.com/user-attachments/assets/c240cbea-c794-4186-b292-900f6686952d)
