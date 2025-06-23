class PersonaDao:
    """
    DAO significa: Data Access Object
    CRUD significa:
                    Create -> Insertar
                    Read   -> Seleccionar
                    Update -> Actualizar
                    Delete -> Eliminar
    """
    # Consulta SQL para seleccionar todas las personas ordenadas por ID
    _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona'

    # Consulta SQL para insertar una nueva persona en la base de datos
    _INSERTAR = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'

    # Consulta SQL para actualizar los datos de una persona por su ID
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'

    # Consulta SQL para eliminar una persona por su ID
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'
