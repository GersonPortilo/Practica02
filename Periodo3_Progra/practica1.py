# FUNCIONES EN PYTHON

# int, que transforma una cadena a un entero

n = int("10")
print(type(n)) # la funcion type sirve

# float, que transforma una cadema a un decimal o flotante

f = float("10.6")
print(f)

# str, que transforma cualquier valor a una cadena
c = "Un texto y dos numeros " + str(10) + " y " + str(3.14)
print(c)

# bin, convierte en entero a binario
b = bin(10)
print(b)

# hex, convierte de entero a hexadecimal
h = hex(10)
print(h)

# int(num, base)
# reconversion a entero
print(int("0b1010",2))
print(int("0xa",16))

# round, para redondeo
print(3.1699999999999999999999999,1)

# len, mide la longitud de una coleccion o cadena
print(len([]))
print(len("Un cadena"))