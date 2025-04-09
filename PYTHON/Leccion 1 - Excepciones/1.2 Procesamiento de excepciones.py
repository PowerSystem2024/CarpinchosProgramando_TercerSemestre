resultado = None
a = 10
b = 0
try:
    resultado = a / b
except Exception as e:
    print(f"Ocurrio un error:{e}")
    
print(f"El resultado es {resultado}")

print("seguimos...")

#CODIGO QUE SE ROMPE

#resultado = None  #Da un error y dice que no se puede mezclar "str" y "int"
#a = "10"          #y se detiene abruptamente el programa  
#b = 0
#try:
#   resultado = a / b
#except Exception as e:
#    print(f"Ocurrio un error:{e}")
    
#print(f"El resultado es {resultado}")

#print("seguimos...")  

#FIN DE CODIGO QUE SE ROMPE

resultado = None #Da un error y dice que no se puede mezclar "str" y "int"
a = "10"         #pero el programa no se detiene abruptamente 
b = 0
try:
    resultado = a / b
except Exception as e:
    print(f"Ocurrio un error:{e}")
    
print(f"El resultado es {resultado}")

print("seguimos...")

