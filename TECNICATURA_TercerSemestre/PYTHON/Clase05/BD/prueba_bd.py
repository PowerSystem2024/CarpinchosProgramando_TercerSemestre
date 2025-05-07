# Importación de Base de Datos - Permite la conexión con PostgreSQL
import psycopg2

# Variable de conexión
# Este código puede simplificarse en una sola línea:
# conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='Test_BD', client_encoding='utf8')
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
    # Gracias al with, no hay que cerrar manualmente el cursor.
    with conexion:
        with conexion.cursor() as cursor:
            # Cursor -> Objeto que permite ejecutar sentencias SQL en postgres.
            # cursor = conexion.cursor()
            # sentencia = 'SELECT * FROM persona'  -> Llamada a la totalidad
            # sentencia = 'SELECT id_persona, nombre FROM persona' -> LLamado a algo espcífico
            # sentencia = 'SELECT * FROM persona WHERE id_persona = 1' -> Muesta el id especificado
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s' # -> Placeholder (Parámetro posicional)
            # Variable que se utilizará como parámetro.
            id_persona = input('Digite un número para el id_persona: ')
            # Con .execute() se ejecutará la sentencia.
            # Se pasa el parámetro como una tupla al execute.
            cursor.execute(sentencia, (id_persona,))
            # registros = cursor.fetchall()
            # Método .fetchone() -> Apunta directamente a la tupla y no a la lista.
            registros = cursor.fetchone()
            
            print(registros)
# Excepción
except Exception as e:
    print(f'Ocurrió un error: {e}.')
# Bloque finally
finally: 
    # Cierre de la conexión de la base de datos
    # cursor.close() -> Gracias al with, no es necesario utilizar esta línea.
    conexion.close()

# Documentación psycopg2
# https://www.psycopg.org/docs/usage.html
