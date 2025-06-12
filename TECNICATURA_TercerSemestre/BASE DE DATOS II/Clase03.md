# 🗃️ BASES DE DATOS NO RELACIONALES

## 📂 COLECCIONES

- Las colecciones son un conjunto de documentos.​
- Estos son documentos dinámicos, es decir, que su estructura puede cambiar.​
- Aunque siempre o en la mayoría de estructuras de base de datos es muy común encontrar lo que son este tipo de estructura con colecciones, ya que es una mejor organización y encierro de datos.​

### 🔍 ¿Qué tener en cuenta a la hora de crear una colección?

- Las colecciones no pueden tener un nombre que sea una cadena vacía, es decir, que tenemos que asignarle un nombre a una colección.​
- La colección no puede ser nombrada por un valor nulo y tampoco por una palabra reservada con el valor nulo.​

---

## 🧮 VARIABLES

​- Una variable es un espacio memoria en el sistema, el cual tiene un identificador o nombre.​
- En este espacio se puede almacenar información de cualquier tipo.​
- Por ejemplo: un espacio memoria donde se guarda algún dato, ya sea un nombre, un número, un número decimal​ o un hasta una operación o el resultado de una operación.​

### 📌 TIPOS DE VARIABLES

#### 🔘 Variable Nulo
```javascript
{ Edad: null }
```
- Llamamos variable nulo a aquella que ocupa un valor nulo​ o que el campo que no existe.​

#### 🔘 Variable Boolean
```javascript
{ Casado: true }
```
- Es una variable, la cual puede tener almacenado dos valores (true o false).​
- Podemos utilizarlo mucho para encuestas.​

#### 🔘 Variables Enteras (Numéricas)
```javascript
{ Edad: 15 }
```
- Esta variable almacena datos numéricos enteros, sin puntos decimales.​

#### 🔘 Variables Decimales
```javascript
{ Resultado: 50.0 }
```
- Esta variable almacena números o datos numéricos decimales.

#### 🔘 Variable de Cadena de Texto:
```javascript
{ Nombre: "Natalia" }
```
- Almacena datos de tipo caracter (puede contener números también).​
- Nota: Los valores no numéricos deben ir entre comillas.

#### 🔘 Variable Fecha
```javascript
{ Fecha: new Date() }
```
- Almacena fechas en milisegundos.​
- Se utiliza `new Date()`​.
- En la shell se muestran según la zona horaria del sistema.​

#### 🔘 Expresiones Regulares
- Se utilizan para realizar consultas en la base de datos.

#### 🔘 Arrays
```javascript
{ Hobbies: ["fútbol", "lectura", 123, true] }
```
- Almacenan múltiples valores de distintos tipos en una misma variable.​

#### 🔘 Documentos Embebidos
```javascript
{
  persona: {
    nombre: "Carlos",
    detalles: {
      profesion: "Ingeniero",
      experiencia: 5
    }
  }
}
```
- Documentos anidados dentro de otros documentos.​

#### 🔘 Datos Binarios
- Datos que no pueden manipularse directamente (se configuran mediante comandos).​

####       🔘 Código JavaScript
```javascript
{ calculo: function() { return 2+2; } }
```
- Permite implementar lógica de JavaScript directamente en documentos/consultas.​

---

## **💻 COMANDOS BÁSICOS**
1. Iniciar servicio y shell:
   - Abrir CMD (`Win + R` → `cmd`)
     - Ejecutar:
      ```bash
      mongod
      ```
     - Luego abrir MongoDB Shell

2. Comandos útiles:
```javascript
// Crear/Usar base de datos
> use primeraclase

// Limpiar pantalla
> cls

// Insertar documento
> db.insertar.insert({ "nombre": "juancito", "edad": 20 })

// Consultar documentos
> db.insertar.find()
```
