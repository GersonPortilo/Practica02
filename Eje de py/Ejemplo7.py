base = float(input("Ingrese el sueldo base "))
venta1 = float(input("Ingrese el valor de la primera venta "))
venta2 = float(input("Ingrese el valor de la segunta venta "))
venta3 = float(input("Ingrese el valor de la tercera venta "))

comi1 = venta1*0.10
comi2 = venta2*0.10
comi3 = venta3*0.10

r = comi1+comi2+comi3+base

print("El total es de ",r,"$")
