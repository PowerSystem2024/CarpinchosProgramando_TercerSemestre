from persona import Persona
# Importa el cursor para ejecutar consultas
from cursor_del_pool import CursorDelPool
from logger_base import log # Importa el logger para registrar eventos y depuración

class PersonaDAO:
    """
    DAO: significa: Data Access Object
    CRUD significa:
                    Create -> Insertar
                    Read -> Seleccionar
                    Update -> Actualizar
                    Delete -> Eliminar
    """
    # Sentencias SQL
    _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona'
    _INSERTAR = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
    _ACTUALIZAR = 'Update persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'

    # Definimos los métodos de clase
    # Método para consultar todos los registros
    @classmethod
    def seleccionar(cls):
        with CursorDelPool() as cursor:  # Obtiene un cursor para ejecutar sentencias SQL
            cursor.execute(cls._SELECCIONAR)
            registros = cursor.fetchall()  # Recupera todos los registros de la consulta
            personas = [] #creamos una lista
            for registro in registros:
                # Crea objetos Persona con los datos recuperados
                persona = Persona(registro[0],registro[1],registro[2],registro[3])
                personas.append(persona)
            return personas

    # Método para insertar un nuevo registro
    @classmethod
    def insertar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.nombre, persona.apellido, persona.email)
            cursor.execute(cls._INSERTAR, valores)
            log.debug(f'Persona insertada: {persona}')
            return cursor.rowcount  # Retorna el número de registros insertados

    # Método para actualizar un registro existente
    @classmethod
    def actualizar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.nombre, persona.apellido, persona.email, persona.id_persona)
            cursor.execute(cls._ACTUALIZAR, valores)
            log.debug(f'Persona actualizada: {persona}')
            return cursor.rowcount  # Retorna el número de registros actualizados

    # Método para eliminar un registro
    @classmethod
    def eliminar(cls,persona):
        with CursorDelPool() as cursor:
            valores = (persona._id_persona, )
            cursor.execute(cls._ELIMINAR, valores)
            log.debug(f'Los objetos eliminados son: {persona}')
            return cursor.rowcount


if __name__== '__main__':
    # Eliminar un registro
    persona1 = Persona(id_persona = 16)
    personas_eliminadas = PersonaDAO.eliminar(persona1)
    log.debug(f'Personas eliminadas: {personas_eliminadas}')

    # Actualizar un registro
    persona1 = Persona(17,"Salvador", "Guerra", "favaguerra@gmail.com")
    personas_actualizadas = PersonaDAO.actualizar(persona1)
    log.debug(f'Personas actualizadas: {personas_actualizadas}')

    # Insertar un registro
    persona1 = Persona(nombre='Melina', apellido='Aguilar', email='meliaguilar@gmail.com')
    personas_insertadas = PersonaDAO.insertar(persona1)
    log.debug(f'Personas insertadas: {personas_insertadas}')

    # Seleccionar objetos/registros
    personas = PersonaDAO.seleccionar()
    for persona in personas:
        log.debug(persona)
