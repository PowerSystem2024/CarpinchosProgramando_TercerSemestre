# Logging
# Permite administrar los mensajes que se envía a la consola.

# Importación
import logging as log

# Llamado a una configuración básica
# Configuración de Logging
log.basicConfig(level=log.DEBUG,
                # format='hora: nivel [nombre del archivo: linea de ejecución] mensaje'
                format='%(asctime)s: %(levelname)s [%(filename)s: %(lineno)s] %(message)s',
                # datefmt -> Day Format
                # datefmt='Hora:Minuto:Segundo pm/am'
                datefmt='%I:%M:%S %p',
                # Handler (Manejador) -> objeto que procesa o maneja eventos o mensajes.
                handlers=[
                    log.FileHandler('capa_datos.log'),
                    log.StreamHandler()
                ])

# Configuración que este código únicamente se ejecute si se está trabajando trabajando dentro de este archivo logger_base.
if __name__ == '__main__':
    # Nivel Debbug
    #  Información muy detallada de la aplicación, por lo que se recomienda su uso en la etapa de desarrollo.
    # log.basicConfig(level=log.DEBUG)
    log.debug('Mensaje a nivel debug.')

    # Nivel Info
    #   Está desactivado por default. Corrobora que todo funciona como debería.
    # log.basicConfig(level=log.INFO)
    log.info('Mensaje a nivel info.')

    # Nivel Warning
    # log.basicConfig(level=log.WARNING)
    log.warning('Mensaje a nivel warning.')

    # Nivel Error 
    # log.basicConfig(level=log.ERROR)
    log.error('Mensaje a nivel error.')

    # Nivel Critical
    # log.basicConfig(level=log.CRITICAL)
    log.critical('Mensaje a nivel critical.')

# Página Web sobre Logging -> docs.python.org/3/howto/logging.html
