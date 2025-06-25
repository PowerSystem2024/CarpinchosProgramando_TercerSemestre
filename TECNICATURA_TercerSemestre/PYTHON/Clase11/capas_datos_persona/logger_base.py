import logging as log  # Importamos el módulo 'logging' y lo renombramos como 'log' para facilitar su uso

# Llamamos una configuración básica del logging

log.basicConfig(
    level=log.DEBUG,
    format="%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s",
    datefmt="%I:%M:%S %p",
    handlers=[log.FileHandler("capa_datos.log", encoding="utf-8"), log.StreamHandler()],
)


if __name__ == '__main__':  # Verificamos que el script se esté ejecutando directamente
    # Configuramos el nivel de logging para que se muestren todos los mensajes desde DEBUG en adelante

    log.debug('Mensaje a nivel debug')       # Mensaje para depuración, útil durante el desarrollo
    log.info('Mensaje a nivel info')         # Mensaje informativo general
    log.warning('Mensaje a nivel warning')   # Mensaje de advertencia, algo no está bien pero no detiene el programa
    log.error('Mensaje a nivel error')       # Mensaje de error, hubo un problema importante
    log.critical('Mensaje a nivel critical') # Mensaje crítico, error muy grave que podría detener el programa
