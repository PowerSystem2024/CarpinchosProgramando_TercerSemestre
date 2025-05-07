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
            # Eliminar un registro
            # Sentencia DELETE
            sentencia = 'DELETE FROM persona WHERE id_persona=%s'
            entrada = input('Digite el número de registro que desee eliminar: ')
            # Tupla de valores
            valores = (entrada)
            # Función .execute
            cursor.execute(sentencia, valores)
            # Función .rowcount
            registros_eliminados = cursor.rowcount
            print(f'Los registros eliminados son: {registros_eliminados}')
# Excepción
except Exception as e:
    print(f'Ocurrió un error: {e}.')
# Bloque finally
finally: 
    conexion.close()
