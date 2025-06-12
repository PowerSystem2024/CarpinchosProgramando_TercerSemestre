# 🧠 Normalización Avanzada en Bases de Datos NoSQL

## 📚 Concepto
La normalización avanzada se refiere al conjunto de técnicas y buenas prácticas utilizadas para organizar y estructurar los datos con el fin de:

- Minimizar la redundancia
- Mejorar la coherencia
- Optimizar el rendimiento

> **Nota**: A diferencia de las bases relacionales (que siguen formas normales estrictas), en NoSQL se busca un **equilibrio flexible** adaptado a modelos de documentos, grafos, columnas o clave-valor.

## ⚖️ Principios Clave
Busca un equilibrio entre:

✔️ **Desnormalización controlada**: Repetición intencional para mejorar rendimiento en lecturas  
✔️ **Modelado orientado a consultas**: Estructurar según patrones de acceso  
✔️ **Separación lógica**: Entidades en subdocumentos/colecciones sin acoplamientos  
✔️ **Uso eficiente de referencias**: Ej: `$lookup` en MongoDB solo cuando sea necesario  
✔️ **Control de tamaño**: Evitar documentos demasiado grandes  

## 🛠️ Ejemplo Práctico (Aplicación de Pedidos)
**Estructura recomendada**:
```json
// Colección 'clientes'
{
  "_id": "abc123",
  "nombre": "Ana",
  "email": "ana@email.com"
}

// Colección 'pedidos' (con referencia)
{
  "pedido_id": 1,
  "cliente_id": "abc123",
  "productos": [...]
}
```

**Buenas prácticas:**
- No almacenar todos los pedidos dentro del documento del cliente
- Usar referencias (`cliente_id`) y joins ocasionales
- Desnormalizar selectivamente datos frecuentemente accedidos juntos

---

## 🔄 Eliminación de Redundancia en NoSQL
### ❓ ¿Qué es la redundancia?
Ocurre cuando la misma información se repite innecesariamente, causando:
- Inconsistencias
- Mayor uso de almacenamiento
- Complejidad en actualizaciones

## 🛡️ Estrategias Anti-Redundancia
#### 1. Separación de Entidades
Ejemplo:
- ❌ Dirección del cliente en cada pedido
- ✅ Almacenar en colección `clientes` y referenciar

#### 2. Referencias/Relaciones
```json
{
  "pedido_id": 1,
  "cliente_id": "abc123"  // Referencia
}
```

#### 3. Subdocumentos Reutilizables
Para datos repetidos (ej: impuestos en productos)

#### 4. Funciones de Agregación
Calcular dinámicamente (totales, promedios) en lugar de almacenar

### ⚖️ Consideraciones Prácticas
- Eliminar completamente la redundancia puede afectar rendimiento
- Balancear según:
  - Patrones de consulta
  - Frecuencia de actualización
  - Necesidades de escalabilidad

---

## 🌐 Otras Categorías de Bases de Datos
### 🚀 In-Memory
- Ejemplos: Redis, Memcached
- Usos: Caching, colas, sesiones temporales

### ⏳ Series Temporales
- Ejemplos: InfluxDB, TimescaleDB
- Características: Optimizadas para datos con timestamp (IoT, métricas)

### 🧩 Orientadas a Objetos
- Ejemplo: InterSystems Caché
- Ventaja: Almacenan objetos nativos (sin ORM)

### 📄 XML/JSON Nativos
- Ejemplos: BaseX (XML), Couchbase (JSON)
- Consultas: XPath, XQuery, MapReduce

### 🔬 Científicas
- Ejemplos: SciDB, Rasdaman
- Casos: Datos multidimensionales (genómica, imágenes satelitales)

### 🎭 Multimodelo
- Ejemplos: ArangoDB, OrientDB
- Ventaja: Combina modelos (documentos + grafos + clave-valor)

### 🤖 Deductivas
- Ejemplos: Datalog
- Usos: IA, sistemas expertos

---

## 🔗 Conexión MongoDB Atlas + Compass
🎥 [Ver tutorial de conexión MongoDB Atlas + Compass](https://www.youtube.com/watch?v=7bXdy23vtNo)




































