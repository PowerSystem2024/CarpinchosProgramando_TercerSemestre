# 🗃️ BASE DE DATOS NO RELACIONALES
## 🗑️ COMANDOS PARA ELIMINAR DATOS
### 📌 Posicionamiento inicial
```javascript
use NombreDeLaBase  // Seleccionar la base de datos
show collections    // Ver colecciones disponibles
```

#### 🔹 REMOVE()
```javascript
db.coleccion.remove({"nombre":"natalia"})
```
- Elimina documentos que coincidan con el criterio

#### 🔹 DELETEONE()
```javascript
db.coleccion.deleteOne({"nombre":"juan"})
```
- Elimina un único documento que coincida

---

## 🗂 ELIMINAR COLECCIONES
#### 🔥 DROP()
```javascript
db.coleccion.drop()  // Elimina la colección completa
```
- Devuelve true si la operación fue exitosa
- Elimina colecciones vacías o no utilizadas para liberar memoria

---

## 🔄 ACTUALIZACIONES DE DATOS
### ✏️ UPDATEONE() + $SET
```javascript
db.coleccion.updateOne(
  {"nombre":"Luis"},       // Filtro (1° parámetro)
  {$set:{"ubicación":"Buenos Aires"}}  // Actualización (2° parámetro)
)
```

### ✏️ UPDATEMANY()
```javascript
db.coleccion.updateMany(
  {"nombre":"Julian"},
  {$set:{"edad":"25"}}
)
```

### 🧹 $UNSET
```javascript
db.coleccion.updateOne(
  {"nombre":"Luis"},
  {$unset:{"ubicación":""}}  // Elimina el campo especificado
)
```

### ✂️ $RENAME
```javascript
db.coleccion.updateOne(
  {"Nombre":"Kevin"},
  {$rename:{"ubicación":"ciudad"}}  // Renombra campos
)
```

### ⬆️ $MAX
```javascript
db.coleccion.updateOne(
  {"Nombre":"Lucas"},
  {$max:{"time":1000}}  // Actualiza solo si el valor es mayor
)
```

### ⬇️ $MIN
```javascript
db.coleccion.updateOne(
  {"Nombre":"Kevin"},
  {$min:{"time":1000}}  // Actualiza solo si el valor es menor
)
```

---

## ➕ INCREMENTO ($INC)
### 📈 Ejemplo práctico:
```javascript
// Insertar documento inicial
db.incremento.insertOne({
  "Nombre":"youtube",
  "url":"www.youtube.com",
  "vistas":1000,
  "likes":50
})

// Incrementar valores
db.incremento.update(
  {"url":"www.youtube.com"},
  {$inc:{"vistas":1000}}  // Aumenta vistas en 1000
)

// Ver resultado
db.incremento.find()
```

---

## 🔍 CONSULTAS
### 📂 FIND()
```javascript
db.seleccion.insertMany([
  {"nombre":"jesica","edad":20},
  {"nombre":"fernando","edad":20}
])

db.seleccion.find({
  "nombre":{$in:["jesica","fernando"]}
})
```

### 🔎 FINDONE()
```javascript
db.primer_metodo.findOne({"nombre":"Fernando"})
```
- Devuelve el primer documento que coincida con el criterio
