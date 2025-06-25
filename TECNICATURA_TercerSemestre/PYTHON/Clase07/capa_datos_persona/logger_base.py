import logging as log  # Importamos el módulo 'logging' y lo renombramos como 'log' para facilitar su uso

# Configuramos el sistema de logging con una configuración básica
log.basicConfig(
    level=log.DEBUG,  # Establece el nivel mínimo de mensajes que se van a registrar (DEBUG es el más detallado)
    format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s',  # Formato del mensaje
    datefmt='%I:%M:%S %p',  # Formato de la hora (12 horas con AM/PM)
    handlers=[
        log.FileHandler("capa_datos.log"),  # Guarda los logs en un archivo llamado 'capa_datos.log'
        log.StreamHandler()  # Muestra los logs en la consola (salida estándar)
    ]
)

if __name__ == '__main__':  # Verificamos que el script se esté ejecutando directamente (no importado como módulo)
    
    log.debug('Mensaje a nivel debug')        # Mensaje detallado para depuración, útil durante el desarrollo
    log.info('Mensaje a nivel info')          # Mensaje informativo para eventos generales
    log.warning('Mensaje a nivel warning')    # Mensaje de advertencia: algo no ideal pero no detiene el programa
    log.error('Mensaje a nivel error')        # Mensaje de error: indica un problema que debe atenderse
    log.critical('Mensaje a nivel critical')  # Mensaje crítico: error grave que podría detener el programa