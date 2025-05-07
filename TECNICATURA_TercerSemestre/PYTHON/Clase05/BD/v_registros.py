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
            # Si se agrega un registro inexistente, no se presentarán errores, simplemente no aparecerá nada.
            # sentencia = 'SELECT * FROM persona WHERE id_persona IN (1,2)'
            sentencia = 'SELECT * FROM persona WHERE id_persona IN %s'
            entrada = input('Digite los id_persona a buscar (separados por coma): ')
            # Variable que se utilizará como parámetro.
            # id_persona = input('Digite un número para el id_persona: ')
            # Creación de tuplas -> Hace que el código sea más dinámico. 
            # llaves_primarias = ((1, 2, 3),)
            # La función .split(' ,') elimina las comas, dejando solo los números.
            llaves_primarias = (tuple(entrada.split(', ')),)
            cursor.execute(sentencia, llaves_primarias)
            # Función .fetchall() -> Recupera todos los registros de la sentencia que se ha ejecutado.
            registros = cursor.fetchall()
            # Ciclo for
            for registro in registros:
                print(registro)
            # Método .fetchone()
            # registros = cursor.fetchone()
            
# Excepción
except Exception as e:
    print(f'Ocurrió un error: {e}.')
# Bloque finally
finally: 
    conexion.close()
