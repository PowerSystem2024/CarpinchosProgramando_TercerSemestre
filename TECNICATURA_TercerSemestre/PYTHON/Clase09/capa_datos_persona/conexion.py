import psycopg2 as bd  # Se importa la librería psycopg2 para conectarse a PostgreSQL, usando un alias "bd"
from logger_base import log  # Se importa un logger personalizado para registrar eventos
import sys  # Se importa sys para poder cerrar el programa en caso de error

class Conexion:
    # Datos de configuración para la conexión a la base de datos
    _DATABASE = 'Test_BD'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _conexion = None  # Atributo para guardar la conexión
    _cursor = None  # Atributo para guardar el cursor

    @classmethod
    def obtenerConexion(cls):
        # Devuelve una conexión activa, o la crea si no existe
        if cls._conexion is None:
            try:
                cls._conexion = bd.connect(host=cls._HOST,
                                           user=cls._USERNAME,
                                           password=cls._PASSWORD,
                                           port=cls._DB_PORT,
                                           database=cls._DATABASE)
                log.debug(f'Conexión exitosa: {cls._conexion}')
                return cls._conexion
            except Exception as e:
                log.error(f'Ocurrió un error de tipo: {e}')
                sys.exit()  # Termina el programa si hay error
        else:
            return cls._conexion  # Devuelve la conexión existente
            
    @classmethod
    def obtenerCursor(cls):
        # Devuelve un cursor activo, o lo crea si no existe
        if cls._cursor is None:
            try:
                cls._cursor = cls.obtenerConexion().cursor()
                log.debug(f'Se abrió correctamente el cursor: {cls._cursor}')
                return cls._cursor
            except Exception as e:
                log.error(f'Ocurrió un error de tipo: {e}')
                sys.exit  # Ojo: falta paréntesis para que funcione correctamente
        else:
            return cls._cursor  # Devuelve el cursor existente

if __name__ == '__main__':
    # Si el archivo se ejecuta directamente, se inicia la conexión y se obtiene el cursor
    Conexion.obtenerConexion()
    Conexion.obtenerCursor()
