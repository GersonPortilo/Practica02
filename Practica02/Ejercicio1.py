# Pedir al usuario que ingrese las tres notas

nota1 = float(input("Ingrese la primera norta: "))
nota2 = float(input("Ingrese la segunda norta: "))
nota3 = float(input("Ingrese la tercera norta: "))

# Calcular el promedio
promedio = (nota1 + nota2 + nota3)/3

if promedio >= 7:
    print("Promocionado")

else:
     print("No Promocionado")
