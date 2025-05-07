# Importación de Base de Datos
import psycopg2

# Variable de conexión
conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='Test_BD',
    client_encoding='utf8'
)

# print(conexion)

# Bloque try 
try:
    # Bloque With
    with conexion:
        with conexion.cursor() as cursor:
            # Sentencia INSERT con uso de parámetros
            sentencia = 'INSERT INTO persona (nombre, apellido, email) VALUES (%s, %s, %s)'
            # Tupla de tuplas
            valores = (
            ('Wally', 'Cerbino', 'wcerbino@gmail.com'),
            ('Zuki', 'Garín', 'zgarin@gmail.com'),
            ('Chimuelo', 'Cerbino', 'chcerbino@gmail.com'),
            ('Milo', 'Ríos', 'mrios@gmail.com'))
            # Función .executemany -> Permite agregar más de una tupla.
            cursor.executemany(sentencia, valores)
            # Función .rowcount
            registros_insertados = cursor.rowcount
            print(f'Los registros insertados son: {registros_insertados}')
# Excepción
except Exception as e:
    print(f'Ocurrió un error: {e}.')
# Bloque finally
finally: 
    conexion.close()
