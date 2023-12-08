'''
Dtermine si un numero que entre desde teclado pertenece a un
 numero negativo o un numero positivo.
'''
# CONDICIONALES ANIDADAS
num = int(input("Ingrese un numero por favor: "))
if num < 0:
    print(f"{num} es un numero negativo")

elif num > 0:
      print(f"{num} es un numero positivo")
else:
     print("El numero ingresado es 0")
