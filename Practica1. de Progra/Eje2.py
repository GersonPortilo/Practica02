# CREAR LA LISTA
lista = [10,7,3,7,2]

# CREAR VARIABLES
acumulador = 0
contador = 0

# RECORRIDO
while contador < len(lista):
    acumulador = acumulador + lista[contador]
    contador = contador + 1

print(f"Los elementos de la lista son {lista}")
print(f"La suma de los elementos es: {acumulador}")
