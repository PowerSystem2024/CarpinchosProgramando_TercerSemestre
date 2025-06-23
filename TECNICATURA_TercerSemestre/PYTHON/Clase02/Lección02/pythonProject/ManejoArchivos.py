class ManejoArchivos:
    # Constructor que recibe el nombre del archivo
    def __init__(self, nombre):
        self.nombre = nombre  # Guarda el nombre del archivo

    # Método que se ejecuta al entrar al contexto (con with)
    def __enter__(self):
        print('Obtenemos el recurso'.center(50, '-'))  # Imprime mensaje centrado al obtener el recurso
        # Abre el archivo en modo lectura con codificación UTF-8 y lo guarda en self.nombre
        self.nombre = open(self.nombre, 'r', encoding='utf8')
        return self.nombre  # Retorna el objeto archivo para usarlo dentro del with

    # Método que se ejecuta al salir del contexto (con with)
    def __exit__(self, tipo_exception, valor_exception, traza_error):
        print('cerramos el recurso'.center(50, '-'))  # Imprime mensaje centrado al cerrar el recurso
        if self.nombre:  # Si el archivo está abierto
            self.nombre.close()  # Lo cierra para liberar el recurso
