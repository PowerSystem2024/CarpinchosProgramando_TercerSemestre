# 🗄️ BASE DE DATOS NO RELACIONALES

## 🍃 MONGO DB

### 📥 ¿CÓMO PODEMOS INGRESAR DATOS A UN DOCUMENTO O DOCUMENTOS A UNA COLECCIÓN?

#### 🔹 INSERT
- El comando `insert` permite insertar datos en la shell de MongoDB​
- Permite admitir documentos con distintos parámetros sin importar la cantidad​

#### 🔹 INSERT ONE
```javascript
db.collection.insertOne({documento})
```
- Inserta un único documento en una colección

#### 🔹 INSERT MANY
```javascript
db.collection.insertMany([{doc1}, {doc2}])
```
- Permite insertar múltiples documentos en una colección​

---

## **💻 EJECUTAMOS COMANDOS**
#### 🔸 INSERT ONE
```javascript
> db.usuarios.insertOne({nombre: "Juan", edad: 25})
```

#### 🔸 INSERT MANY
```javascript
> db.usuarios.insertMany([
    {nombre: "María", edad: 30},
    {nombre: "Carlos", edad: 28}
  ])
```

---

## **🛠 COMANDOS BÁSICOS PARA MONGO**
| Comando         | Descripción                          | Ejemplo                  |
|-----------------|--------------------------------------|--------------------------|
| `show dbs`      | Muestra todas las bases de datos     | `> show dbs`             |
| `use`           | Crea/selecciona una base de datos    | `> use miDB`             |
| `db.find()`     | Consulta documentos                  | `> db.usuarios.find()`   |
| `cls`           | Limpia la pantalla                   | `> cls`                  |

---

## **🖥 STUDIO 3T**
### 🔌 ¿CÓMO CREAR UNA BASE DE DATOS DESDE STUDIO 3T?
#### 📌 REQUISITO PREVIO
```diff
+ ANTES DE INICIAR: Debe estar conectada la shell de MongoDB
```
#### 🔹 Pasos para conectar:
1. Abrir la shell de Mongo:
   - Ir a la carpeta `bin`
   - Ejecutar `mongosh` (minimizar, no cerrar)

2. Ejecutar:
```bash
mongod
```

3. En Studio 3T:
   - Seleccionar "Connected"
   - Aparecerán las conexiones disponibles

---

## 🏗 ¿CÓMO CREAMOS NUESTRA BASE DE DATOS?
1. Click derecho sobre la conexión
2. Seleccionar "Add Database"
3. Ingresar el nombre de la nueva base de datos
4. ¡Listo! Ya podemos ingresar datos a nuestra base
