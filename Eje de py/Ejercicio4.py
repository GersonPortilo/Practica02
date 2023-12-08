#Calcular la hipotenusa de un triangulo rectangulo

from math import sqrt

a = float(input("Ingrese el cateto a: "))
b = float(input("Ingrese el cateto b: "))
c = sqrt((a**2) + (b**2))

print(f"La Hipotenusa del triangulo es: {c}")