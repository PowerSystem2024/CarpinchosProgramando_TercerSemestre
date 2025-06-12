# Integridad de los Datos en Bases de Datos

## Importancia del Control de Concurrencia
🔹 **Mantenimiento de la integridad**:  
El control de concurrencia es vital para preservar la integridad de los datos en entornos multiusuario. Sin él, las transacciones simultáneas pueden causar:
- Anomalías en los datos (ej. pérdida de actualizaciones o lecturas incorrectas).
- Inconsistencias significativas.

🔹 **Mecanismos clave**:  
Garantizan que las transacciones no interfieran entre sí, manteniendo la precisión y consistencia de la base de datos.

---

## ¿Qué es el Control de Concurrencia?
📌 **Definición**:  
En Sistemas de Gestión de Bases de Datos (SGBD), el control de concurrencia:
- Permite la ejecución simultánea de múltiples transacciones **sin inconsistencia**.
- Gestiona operaciones intercaladas para mantener la integridad.
- Facilita el acceso concurrente de usuarios, mejorando el rendimiento y escalabilidad.

---

## Conceptos Clave y Terminología
### Transacción
✔ **Definición**: Secuencia de operaciones tratadas como una unidad lógica única.  
✔ **Propiedades ACID**:
| Propiedad       | Descripción                                                                 |
|-----------------|-----------------------------------------------------------------------------|
| **Atomicidad**  | Todas las operaciones se completan o ninguna (todo o nada).                |
| **Consistencia**| La transacción lleva la BD de un estado válido a otro.                     |
| **Aislamiento** | Las operaciones son invisibles para otras transacciones hasta finalizar.   |
| **Durabilidad** | Los cambios persisten incluso ante fallos del sistema.                     |

---

## Optimización del Rendimiento
🚀 **Beneficios**:  
- Mayor rendimiento y uso eficiente de recursos.  
- Minimiza tiempos de espera y mejora la respuesta.  

---

## Problemas Comunes en Concurrencia
### 1. Actualizaciones Perdidas
🔴 **Causa**:  
Dos transacciones leen y actualizan el mismo dato basándose en valores iniciales, perdiéndose las actualizaciones intermedias.  
➡ **Impacto**: Inconsistencias graves.

### 2. Inconsistencias Temporales
🔴 **Causa**:  
Una transacción lee datos modificados por otra transacción **no confirmada**.  
➡ **Impacto**: Datos incorrectos o no fiables.

### 3. Puntos Muertos (Deadlocks)
🔴 **Causa**:  
Ciclo de dependencias donde transacciones esperan mutuamente por recursos bloqueados.  
➡ **Impacto**: Bloqueo indefinido que requiere intervención manual.

---

## Técnicas de Control de Concurrencia
### 🔐 Protocolos Basados en Bloqueos
#### Bloqueo de Dos Fases (2PL)
- **Fase de crecimiento**: Adquiere todos los bloqueos necesarios.  
- **Fase de contracción**: Libera bloqueos sin adquirir nuevos.  
✅ **Ventaja**: Garantiza serialización y consistencia.

#### Bloqueo Estricto de Dos Fases (S2PL)
- **Mejora**: Bloqueos exclusivos se mantienen hasta confirmar/cancelar.  
✅ **Ventaja**: Evita reversiones en cascada y aumenta integridad.

---

## Ejemplos Prácticos y Aplicaciones
### 🏦 Sistemas Bancarios
- **Uso**: Transacciones como depósitos, retiros y transferencias.  
- **Técnicas**: Bloqueos y marcas de tiempo para evitar pérdida de actualizaciones.  

### 🛒 Plataformas de E-Commerce
- **Uso**: Gestión de pedidos, inventario y pagos simultáneos.  
- **Técnica**: Control de Concurrencia Multiversión (MVCC) para operaciones sin conflicto.  

---

## Estudios de Caso
### 📊 Minorista en Línea
- **Solución**: Control de Concurrencia Optimista.  
- **Resultado**: Mayor rendimiento durante temporadas de alta demanda.  

### 💳 Institución Financiera
- **Solución**: Aislamiento de Instantáneas (IS).  
- **Resultado**: Informes consistentes incluso con alta concurrencia.  

---

## Tendencias Futuras
### 🌐 Tecnologías Emergentes
- Algoritmos híbridos (pesimistas + optimistas).  
- Hardware avanzado (memoria no volátil, procesadores multinúcleo).  

---

## Optimización de Consultas
⚡ **Objetivo**:  
Acelerar respuestas y mejorar eficiencia.  

### Proceso del Compilador SQL/XQuery
1. Genera planes de acceso ejecutables.  
2. Calcula costes de ejecución para diferentes estrategias.  

---

## Optimización en Bases NoSQL
### 🔧 Técnicas Clave
| Técnica         | Ejemplo de Herramienta       | Beneficio                          |
|-----------------|------------------------------|------------------------------------|
| **Almacenamiento en caché** | Redis, Memcached             | Reduce latencia y carga.          |
| **Particionamiento**        | MongoDB Sharding, Cassandra  | Mejora escalabilidad.             |
| **Replicación**             | Configuraciones en clúster   | Aumenta disponibilidad.           |
