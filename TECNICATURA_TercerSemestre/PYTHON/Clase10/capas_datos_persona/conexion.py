from psycopg2 import pool # Importa el módulo de psycopg2 para manejo de conexiones a PostgreSQL
from logger_base import log  # Importa el logger definido en otro archivo (logger_base.py) para registrar eventos
import sys # Importa sys para poder finalizar el programa en caso de que haya error

class Conexion:
    # Datos de configuración para conectarse a la base de datos
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON = 1 #mínimo de conexiones
    _MAX_CON = 5 #máximo de conexiones
    _pool = None # Aca se va a almacenar el pool de conexiones

    @classmethod
    def obtenerConexion(cls):
       conexion = cls.obtenerPool().getconn() # este método se encarga de regresar una conexión hacia la bdd
       log.debug(f'Conexión obtenida del pool: {conexion}')
       return conexion

    @classmethod
    def obtenerCursor(cls):
       pass

    @classmethod
    def obtenerPool(cls):
        if cls._pool is None:
           try:
               # Crea un pool de conexiones
               cls._pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                     cls._MAX_CON,
                                                     host=cls._HOST,
                                                     user=cls._USERNAME,
                                                     password=cls._PASSWORD,
                                                     port=cls._DB_PORT,
                                                     database=cls._DATABASE)
               log.debug(f'Creación del pool exitosa: {cls._pool}')
               return cls._pool
           except Exception as e:
               log.error(f'Ocurrió un error al obtener el pool: {e}')
               sys.exit() # Finaliza el programa si no puede crear el pool
        else:
            return cls._pool
# Prueba
if __name__== '__main__':
    # Solicita varias conexiones del pool para probar el funcionamiento
    conexion1 = Conexion.obtenerConexion()
    conexion2 = Conexion.obtenerConexion()
    conexion3 = Conexion.obtenerConexion()
    conexion4 = Conexion.obtenerConexion()
    conexion5 = Conexion.obtenerConexion()
    # conexion6 = Conexion.obtenerConexion() # nos excedemos en una conexión





















