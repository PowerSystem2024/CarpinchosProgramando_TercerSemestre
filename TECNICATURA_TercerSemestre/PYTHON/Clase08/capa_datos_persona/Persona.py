from logger_base import log  # Importa el objeto 'log' desde el módulo 'logger_base' para registrar mensajes de depuración

class Persona:
    # Constructor de la clase Persona con parámetros opcionales
    def __init__(self, id_persona=None, nombre=None, apellido=None, email=None):
        self._id_persona = id_persona  # Atributo privado para almacenar el ID de la persona
        self._nombre = nombre          # Atributo privado para almacenar el nombre
        self._apellido = apellido      # Atributo privado para almacenar el apellido
        self._email = email            # Atributo privado para almacenar el email

    # Método especial para representar el objeto como cadena de texto
    def __str__(self):
        return f'''
            Id Persona: {self._id_persona},
            Nombre: {self._nombre},
            Apellido: {self._apellido},
            Email: {self._email}
        '''

    # Métodos Getters and Setters

    # Getter para id_persona
    @property
    def id_persona(self):
        return self._id_persona

    # Setter para id_persona
    @id_persona.setter
    def id_persona(self, id_persona):
        self._id_persona = id_persona

    # Getter para nombre
    @property
    def nombre(self):
        return self._nombre

    # Setter para nombre
    @nombre.setter
    def nombre(self, nombre):
        self.nombre = nombre  # ⚠️ Esta línea tiene un error: debería ser self._nombre = nombre

    # Getter para apellido
    @property
    def apellido(self):
        return self._apellido

    # Setter para apellido
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    # Getter para email
    @property
    def email(self):
        return self._email

    # Setter para email
    @email.setter
    def email(self, email):
        self._email = email

# Bloque principal que se ejecuta solo si el archivo se ejecuta directamente
if __name__ == '__main__':
    # Crea un objeto Persona con todos los datos
    persona1 = Persona(1, 'Juan', 'Perez', 'jperez@mail.com')
    log.debug(persona1)  # Registra en el log el objeto persona1

    # Crea un objeto Persona sin ID
    persona2 = Persona(nombre='Jose', apellido='Lepez', email='ljose@mail.com')
    log.debug(persona2)  # Registra en el log el objeto persona2

    # Crea un objeto Persona solo con el ID
    persona1 = Persona(id_persona = 1)
    log.debug(persona1)  # Registra en el log el objeto persona1
