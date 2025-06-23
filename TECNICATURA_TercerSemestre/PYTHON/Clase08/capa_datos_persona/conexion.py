import psycopg2 as bd  # Importa la librería psycopg2 y la renombra como 'bd' (también se puede usar 'db')
from logger_base import log  # Importa el objeto 'log' desde el módulo logger_base para registrar mensajes
import sys  # Importa el módulo 'sys' para poder salir del programa en caso de error

class Conexion:
    # Datos de configuración para conectarse a la base de datos PostgreSQL
    _DATABASE = 'test_bd'        # Nombre de la base de datos
    _USERNAME = 'postgres'       # Nombre de usuario
    _PASSWORD = 'admin'          # Contraseña del usuario
    _DB_PORT = '5432'            # Puerto por defecto para PostgreSQL
    _HOST = '127.0.0.1'          # Dirección del servidor de base de datos (localhost)
    _conexion = None             # Variable de clase para mantener una única instancia de conexión
    _cursor = None               # Variable de clase para mantener una única instancia de cursor

    @classmethod
    def obtenerConexion(cls):
        # Si no hay conexión previa, se crea una nueva
        if cls._conexion is None:
            try:
                # Intenta establecer la conexión a la base de datos
                cls._conexion = bd.connect(host=cls._HOST,
                                           user=cls._USERNAME,
                                           password=cls._PASSWORD,
                                           port=cls._DB_PORT,
                                           database=cls._DATABASE)
                log.debug(f'Conexión Exitosa: {cls._conexion}')  # Log de depuración si la conexión fue exitosa
                return cls._conexion  # Devuelve la conexión
            except Exception as e:
                log.error(f'Ocurrió un error: {e}')  # Registra el error si la conexión falla
                sys.exit()  # Sale del programa en caso de error
        else:
            return cls._conexion  # Si ya hay una conexión, la reutiliza

    @classmethod
    def obtenerCursor(cls):
        # Si no hay cursor previo, se crea uno nuevo
        if cls._cursor is None:
            try:
                cls._cursor = cls.obtenerConexion().cursor()  # Obtiene un cursor a partir de la conexión
                log.debug(f'Se abrió correctamente el cursor: {cls._cursor}')  # Log del cursor
                return cls._cursor  # Devuelve el cursor
            except Exception as e:
                log.error(f'Ocurrió un error: {e}')  # Registra el error si falla al obtener el cursor
                sys.exit()  # Sale del programa
        else:
            return cls._cursor  # Si ya hay un cursor, lo reutiliza

# Este bloque se ejecuta solo si el archivo se corre directamente (no si se importa como módulo)
if __name__ == '__main__':
    Conexion.obtenerConexion()  # Intenta obtener la conexión a la base de datos
    Conexion.obtenerCursor()    # Intenta obtener el cursor de la base de datos
