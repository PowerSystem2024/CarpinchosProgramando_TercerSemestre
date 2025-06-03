# Importación de Base de Datos - Permite la conexión con PostgreSQL
import psycopg2 as bd

# Variable de conexión
# Este código puede simplificarse en una sola línea:
# conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='Test_BD', client_encoding='utf8')
conexion = bd.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd',
    client_encoding='utf8'
)

# Bloque try 
try:
    with conexion:
        with conexion.cursor() as cursor:
            
            sentencia = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
            valores = ('Alex', 'Rojas', 'arojas@gmail.com')
            cursor.execute(sentencia, valores)
            
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = ('Juan Carlos', 'Roldan', 'jcroldan@email.com', 1)
            cursor.execute(sentencia, valores)
        
# Excepción
except Exception as e:
    print(f'Ocurrió un error, se hizo un rollback: {e}.')
# Bloque finally
finally: 
    # Cierre de la conexión de la base de datos
    # cursor.close() -> Gracias al with, no es necesario utilizar esta línea.
    conexion.close()
    
print('Termina la transaccion')