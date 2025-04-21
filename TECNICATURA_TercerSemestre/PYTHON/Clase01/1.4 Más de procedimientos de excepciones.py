resultado = None 
#Tiene que estar fuera del bloque "try" Porque sino no seria 
#una variable global Y no tendria valor fuera del "type"
#De esta manera puede incluirse dentro y fuera del bloque try

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
    
print(f"El resultado es {resultado}")

print("seguimos...")

#De esta manera nos perite ver mejor cada una de las pruebas 



