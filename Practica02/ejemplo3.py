'''
Determine si dos numero que ingresen desde el teclado pueden dividirse
'''
#CONDICIONES COMPUESTAS
num1 = float(input("Favor ingrese el primer numero: "))
num2 = float(input("Favor ingrese el segundo numero: "))

if num2 > 0:
    div = num1 / num1
    print(div)
    print(f"{num1} y {num2} son numeros que se pueden dividir ")
else:
    print("ERROR MATH")
