num1 = float(input("Ingrese el primer numero: "))
num2 = float(input("Ingrese el segundo numero: "))
num3 = float(input("Ingrese el tercer numero: "))

mayor = num1 

if num2 > mayor:
    mayor = num2

if num3 > mayor:
    mayor = num3

    print("El numero mayor es: ", mayor)