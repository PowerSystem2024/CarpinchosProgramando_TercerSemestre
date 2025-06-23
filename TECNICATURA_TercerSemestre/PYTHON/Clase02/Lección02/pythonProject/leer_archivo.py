archivo = open('prueba.txt', 'r',
               encoding='utf8')  # Abre el archivo 'prueba.txt' en modo lectura ('r'), con codificación UTF-8
# Modos comunes de apertura:
# 'r' -> read (lectura)
# 'a' -> append (agregar al final)
# 'w' -> write (escritura, sobreescribe archivo)
# 'x' -> crea un archivo nuevo (falla si ya existe)

# print(archivo.read())       # Lee y muestra todo el contenido del archivo
# print(archivo.read(16))     # Lee y muestra los primeros 16 caracteres
# print(archivo.read(10))     # Lee y muestra los siguientes 10 caracteres desde la posición actual
# print(archivo.readline())   # Lee y muestra la primera línea del archivo
# print(archivo.readline())   # Lee y muestra la segunda línea del archivo

# Vamos a iterar línea por línea en el archivo
# for linea in archivo:
#     print(linea)  # Itera y muestra cada línea del archivo

# print(archivo.readlines()[11])  # Lee todas las líneas como lista y muestra la línea número 12 (índice 11)

# Abrimos un segundo archivo para escribir (sobrescribe o crea nuevo) en modo escritura
archivo2 = open('copia.txt', 'w', encoding='utf8')
archivo2.write(archivo.read())  # Copia el contenido del archivo original en archivo2
archivo.close()  # Cierra el archivo original para liberar recursos
archivo2.close() # Cierra el archivo copia para guardar cambios

print('Se ha terminado el proceso de leer y copiar archivos')  # Mensaje indicando que terminó el proceso
