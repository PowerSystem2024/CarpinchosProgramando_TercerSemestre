from pelicula import Pelicula
from catalogo_peliculas import CatalogoPeliculas

def mostrar_menu():
    print("\n--- Menú del Catálogo de Películas ---")
    print("1. Agregar película")
    print("2. Listar películas")
    print("3. Eliminar archivo de películas")
    print("4. Salir")

opcion = 0
while opcion != 4:
    mostrar_menu()
    try:
        opcion = int(input("Selecciona una opción: "))
    except ValueError:
        print("Por favor, ingresa un número válido.")
        continue

    if opcion == 1:
        nombre = input("Escribe el nombre de la película: ")
        pelicula = Pelicula(nombre)
        CatalogoPeliculas.agregar_pelicula(pelicula)
        print("Película agregada con éxito.")
    elif opcion == 2:
        CatalogoPeliculas.listar_peliculas()
    elif opcion == 3:
        CatalogoPeliculas.eliminar()
    elif opcion == 4:
        print("¡Hasta luego!")
    else:
        print("Opción no válida, intenta nuevamente.")
