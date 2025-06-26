# Importamos la excepción personalizada desde otro archivo
from NumerosIgualesException import NumerosIgualesException

# Inicializamos la variable resultado como None
resultado = None

# Iniciamos un bloque try para capturar posibles errores
try:
    # Pedimos al usuario que ingrese el primer número
    a = int(input("Digite el primer numero: "))
    
    # Pedimos al usuario que ingrese el segundo número
    b = int(input("Digite el Segundo numero: "))
    
    # Realizamos la división (esto puede causar una excepción si b es 0)
    resultado = a / b

    # Verificamos si ambos números son iguales
    if a == b:
        # Si son iguales, lanzamos una excepción personalizada
        raise NumerosIgualesException("Son numeros iguales")

# Capturamos un error de tipo incorrecto (por ejemplo, si se hace una operación inválida)
except TypeError as e:
    print(f"TypeError - Ocurrio un error:{type(e)}")

# Capturamos el error de división por cero
except ZeroDivisionError as e:
    print(f"ZeroDivisionError - Ocurrio un error:{type(e)}")

# Capturamos cualquier otra excepción que no hayamos manejado antes
except Exception as e:
    print(f"Exception - Ocurrio un error:{type(e)}")

# Si no se arrojó ninguna excepción, se ejecuta este bloque
else:
    print("no se arrojo ninguna excepcion")

# El bloque finally siempre se ejecuta, haya habido o no una excepción
finally:
    print("ejecucion de este bloque finally")

# Mostramos el resultado de la operación (puede ser None si ocurrió un error antes)
print(f"El resultado es {resultado}")

# Indicamos que el programa continúa su ejecución
print("seguimos...")



