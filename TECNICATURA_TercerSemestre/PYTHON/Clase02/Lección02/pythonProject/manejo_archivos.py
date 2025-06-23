# Declaramos una variable

try:
    archivo = open('prueba.txt', 'w', encoding='utf8')  
    # Abre (o crea) el archivo 'prueba.txt' en modo escritura ('w'), con codificación UTF-8.
    # Modo 'w' sobrescribe el archivo si ya existe.

    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    # Escribe esta línea en el archivo

    archivo.write('Los acentos son importantes para las palabras\n')
    # Escribe esta línea en el archivo

    archivo.write('como por ejemplo: acción, ejecución y producción\n')
    # Escribe esta línea en el archivo, con palabras que contienen acentos

    archivo.write('Las letras son:\nr read leer, \na append anexa, \nw write escribe, \nx crea un archivo')
    # Escribe las letras que indican modos de apertura con sus significados, usando saltos de línea

    archivo.write('\nt esta es para texto o text, \nb archivos binarios, \nw+ leer y escribir son iguales r+\n')
    # Continúa explicando otros modos de apertura y sus usos

    archivo.write('Saludos a todos los alumnos de la tecnicatura\n')
    # Escribe un saludo

    archivo.write('Con esto terminamos')
    # Escribe la última línea sin salto de línea
except Exception as e:
    print(e)  # Si ocurre algún error durante la apertura o escritura, imprime el error
finally:  # Este bloque se ejecuta siempre, haya o no error
    archivo.close()  # Cierra el archivo para liberar recursos
# archivo.write('Todo quedo perfecto'): este es un error
# Esta línea está comentada porque escribir después de cerrar el archivo genera error
