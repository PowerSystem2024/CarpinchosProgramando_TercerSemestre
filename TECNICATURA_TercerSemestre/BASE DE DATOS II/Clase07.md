# MongoDB - Operadores Lógicos

## Operadores Lógicos en MongoDB

### `$gte` (Mayor o Igual Que)
Operador que permite consultar o traer datos que sean **mayor o igual a** un valor especificado.

**Ejemplo:**  
Recuperar todos los registros donde el campo `"cantidad"` sea 20 o más.

```javascript
db.logico_uno.find({ cantidad: { $gte: 20 } })
```

### Uso en práctica:
1. Creamos la base de datos `consulta`:
```javascript
use consulta
```

2. Creamos la colección `logico_uno` e insertamos datos:
```javascript
db.logico_uno.insertMany([
  {"nombre": "registro1", "cantidad": 40},
  {"nombre": "registro2", "cantidad": 10},
  {"nombre": "registro3", "cantidad": 60}
])
```

3. Aplicamos el operador `$gte`:
```javascript
db.logico_uno.find({"cantidad": {"$gte": 20}})
```

---

`$gt` (Mayor Que)
Operador que permite consultar datos que sean mayor que un valor especificado.

#### Ejemplo:
Recuperar todos los datos donde el campo `"edad"` sea mayor a 20.
```javascript
db.logico_dos.find({ "edad": { $gt: 20 } })
```
### Uso en práctica:
1. En la misma base `consulta`, creamos la colección `logico_dos`:
```javascript
db.logico_dos.insertMany([
  {"nombre": "rodrigo", "edad": 18},
  {"nombre": "juan", "edad": 30},
  {"nombre": "jesica", "edad": 40}
])
```
2. Aplicamos el operador `$gt`:
```javascript
db.logico_dos.find({"edad": {"$gt": 20}})
```

---

`$lt` (Menor Que)
Operador que permite consultar datos que sean menor que un valor especificado.

#### Ejemplo:
Recuperar todos los datos donde el campo "edad" sea menor a 40.
```javascript
db.logico_dos.find({ "edad": { $lt: 40 } })
```
#### Uso en práctica:
1. Aplicamos el operador `$lt` en la colección `logico_dos`:
```javascript
db.logico_dos.find({"edad": {"$lt": 40}})
```

---

Combinando `$gt` y `$lt`
Los operadores lógicos pueden combinarse para obtener resultados más específicos.

#### Ejemplo:
Recuperar todos los datos donde el campo `"edad"` sea mayor a 20 y menor a 40.
```javascript
db.logico_dos.find({ "edad": { "$gt": 20, "$lt": 40 } })
```
#### Uso en práctica:
```javascript
db.logico_dos.find({"edad": {"$gt": 20, "$lt": 40}})
```

---

`$lte` (Menor o Igual Que)
Operador que permite consultar datos que sean menor o igual a un valor especificado.

#### Ejemplo:
Recuperar todos los datos donde el campo "visitas" sea menor o igual a 4000.
```javascript
db.logico_tres.find({ "visitas": { "$lte": 4000 } })
```
#### Uso en práctica:
1. Creamos la colección logico_tres:
```javascript
db.logico_tres.insertMany([
  {"sitio": "www.facebook.com", "vistas": 4000},
  {"sitio": "www.youtube.com", "vistas": 3000}
])
```
2. Aplicamos el operador $lte:
```javascript
db.logico_tres.find({"visitas": {"$lte": 4000}})
```
3. También podemos combinarlo con $gt:
```javascript
db.logico_tres.find({"visita": {"$gt": 2000, "$lte": 4000}})
javascript
db.logico_tres.find({ "visitas": { "$lte": 3500 } })
```
