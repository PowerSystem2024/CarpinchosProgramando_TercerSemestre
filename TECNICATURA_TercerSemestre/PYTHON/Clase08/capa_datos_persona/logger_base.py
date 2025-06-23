import logging as log  # Importa el módulo 'logging' y lo renombra como 'log' para usarlo más fácilmente

# doc.python.org/3/howto/logging.hyml
# Llamamos una configuración básica del logging

log.basicConfig(  # Configura el sistema de logging con opciones básicas
    level = log.DEBUG,  # Establece el nivel mínimo de mensajes a registrar (DEBUG es el más bajo, muestra todos)
    format = '%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s',  # Formato del mensaje: incluye hora, nivel, archivo, línea y mensaje
    datefmt='%I:%M:%S %p',  # Formato de la hora (12 horas con AM/PM)
    handlers=[  # Lista de manejadores de salida del log
        log.FileHandler("capa_datos.log"),  # Registra los logs en un archivo llamado 'capa_datos.log'
        log.StreamHandler()  # También muestra los logs en la consola
    ]
)

# Este bloque solo se ejecuta si el archivo se corre directamente (no si se importa como módulo)
if __name__ == '__main__':
    log.debug('Mensaje a nivel debug')       # Mensaje de depuración (muy detallado)
    log.info('Mensaje a nivel info')         # Mensaje informativo
    log.warning('Mensaje a nivel warning')   # Mensaje de advertencia
    log.error('Mensaje a nivel error')       # Mensaje de error
    log.critical('Mensaje a nivel critical') # Mensaje crítico, muy grave
