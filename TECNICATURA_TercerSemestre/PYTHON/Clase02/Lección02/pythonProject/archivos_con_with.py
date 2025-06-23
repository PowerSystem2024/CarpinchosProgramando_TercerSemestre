from ManejoArchivos import ManejoArchivos  # Importa la clase ManejoArchivos desde el módulo ManejoArchivos

# MANEJO DE CONTEXTO WITH: sintaxis simplificada, abre y cierra el archivo automáticamente
# El siguiente bloque comentado muestra la forma tradicional con open():
# with open('prueba.txt', 'r', encoding='utf8') as archivo:
#     print(archivo.read())

# No hace falta usar try ni finally porque el contexto with maneja automáticamente la apertura y cierre
# Esto se logra gracias a los métodos especiales __enter__ (abre el recurso)
# y __exit__ (cierra el recurso) que implementa la clase

with ManejoArchivos('prueba.txt') as archivo:  # Usa el manejador de contexto personalizado para abrir el archivo
    print(archivo.read())  # Lee y muestra el contenido del archivo
