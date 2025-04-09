print(f"Separador UNO")
try:
    10 / 0
except Exception as e:
    print(f"Ocurrio un error:{e}")

# Exception es algo más genérico

print(f"Separador DOS")

try:
    10 / 2
except Exception as e:
    print(f"Ocurrio un error:{e}")

# Vemos que funciona correctamente

print(f"Separador TRES")

try:
    10 / 0
except ZeroDivisionError as e:
    print(f"Ocurrio un error:{e}")

# ZeroDivisionError es específico

print(f"Separador CUATRO")