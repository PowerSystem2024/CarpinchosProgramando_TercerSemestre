resultado = None 

try:
    a = int(input("Digite el primer numero: "))
    b = int(input("Digite el Segundo numero: "))
    resultado = a / b  
    
except TypeError as e:
    print(f"TypeError - Ocurrio un error:{type(e)}")

except ZeroDivisionError as e:
    print(f"ZeroDivisionError - Ocurrio un error:{type(e)}")
     
except Exception as e:
    print(f"Exception - Ocurrio un error:{type(e)}")
else:
    print("no se arrojo ninguna excepcion")
finally: #Siempre se va a ejecutar
    print("ejecucion de este bloque finally")  
print(f"El resultado es {resultado}")

print("seguimos...")

