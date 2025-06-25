from logger_base import log
from conexion import Conexion

class CursorDelPool:
    def __init__(self):
        self._conexion = None  # se inicializa la conexion
        self._cursor = None # Cursor = none por si no se ha hecho ninguna conexion

    def __enter__(self): # El metodo enter se usa para iniciar la conexion
        log.debug('Inicio del método with y __enter__')
        self._conexion = Conexion.obtenerConexion()
        self._cursor = self._conexion.cursor()
        return self._cursor

    # El metodo exit se usa para cerrar la conexion
    def __exit__(self, tipo_excepcion, valor_excepcion, detalle_excepcion):
        log.debug('Se ejecuta el método __exit__')
        if valor_excepcion:  # Si encuentra una excepcion, se ejecuta el rollback
            self._conexion.rollback()
            log.debug(f'Ocurrió una excepción: {valor_excepcion}')
        else:
            self._conexion.commit()  # Si no hay excepcion se hace el commit de la transaccion
            log.debug('Commit de la transacción')
        self._cursor.close()
        Conexion.liberarConexion(self._conexion)


if  __name__ == '__main__':
    with CursorDelPool() as cursor: # Se usa el with para que se ejecute el metodo enter y exit
        log.debug('Ejecutando sentencia dentro del bloque WITH')
        cursor.execute('SELECT * FROM persona')
        log.debug(cursor.fetchall())
        log.debug('Fin del with')