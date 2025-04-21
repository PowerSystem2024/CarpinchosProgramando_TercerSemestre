# 🖥️ Proyecto MundoPC - Aplicación de Polimorfismo

## 📌 ¿Qué es el polimorfismo?

### El **polimorfismo** es un concepto de la programación orientada a objetos que permite que un mismo método se comporte de manera diferente según el tipo de objeto que lo utilice.

---

## 🔍 ¿Cómo lo aplicamos en MundoPC?

### En este proyecto, usamos polimorfismo a través de la clase `DispositivoEntrada`, que actúa como **clase padre** de `Raton` y `Teclado`.

## ✅ Método polimórfico

### Creamos un método llamado:

```js
function describirDispositivo(dispositivo) {
    console.log(dispositivo.toString());
}
```
### Este método recibe un objeto de tipo **DispositivoEntrada**, pero gracias al polimorfismo podemos pasarle tanto un objeto Raton como uno Teclado, y el método se adapta automáticamente para mostrar el toString() correspondiente a cada clase.

### Un mismo método (describirDispositivo) se comporta de manera distinta según el tipo real del objeto que recibe.

## 📦 La clase **Orden**

### La clase Orden no usa polimorfismo directamente, pero se ve beneficiada por él.
### Esto ocurre porque Orden contiene objetos Computadora, y cada Computadora a su vez contiene objetos Raton, Teclado y Monitor. Los dos primeros (Raton y Teclado) son polimórficos, ya que vienen de la clase DispositivoEntrada.

## 🎯 ¿Por qué es útil esto?
### Gracias a esta estructura:
### • Podemos crear órdenes con diferentes tipos de dispositivos.
### • No hace falta modificar la lógica interna de la clase Orden.
### • Se logra una mayor flexibilidad y reutilización del código.
