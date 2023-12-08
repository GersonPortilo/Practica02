# Pedir al usuario que ingrese el número de palabras
num_palabras = int(input("Ingrese el número de palabras que desea agregar a la lista: "))

# Crear una lista vacía para almacenar las palabras
lista_palabras = []

# Usar un bucle for para recopilar las palabras
for i in range(num_palabras):
    palabra = input(f"Ingrese la palabra {i + 1}: ")
    lista_palabras.append(palabra)

# Imprimir la lista de palabras
print("Lista de palabras:")
for palabra in lista_palabras:
    print(palabra)