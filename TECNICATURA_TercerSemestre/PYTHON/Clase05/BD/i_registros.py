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
            # Tupla
            valores = ('Wally', 'Cerbino', 'wcerbino@gmail.com')
            cursor.execute(sentencia, valores)
            # Función .commit() -> Guarda los cambios en la base de datos.
            # El bloque with hace de manera automática la función .commit()
            # conexion.commit()
            # Función .rowcount -> Si uno de los registros falla, ese no se guardará en la base de datos
            registros_insertados = cursor.rowcount
            print(f'Los registros insertados son: {registros_insertados}')
# Excepción
except Exception as e:
    print(f'Ocurrió un error: {e}.')
# Bloque finally
finally: 
    conexion.close()
