# CAPTURANDO E INSERTANDO DATOS EN UNA LISTA (USO DE FOR)

# definir una lista vacia
numeros = []

# insertando datos desde el teclado
for i in range(5):
     # capturando
     valor = int(input("Digite un numero: "))

     # inserto una lista
     numeros.append(valor)

     # imprimiendo la lista
     print(numeros)