# CAPTURANDO E INSERTANDO DATOS EN UNA LISTA (USO DE WHILE)

# definir una lista vacia
numeros = []

# captura inicial del conjunto de datos
valor = int(input("Digite un valor, para salir, digite 0: "))

# creando el while 
while valor != 0 :
    # inserto a la lista
    numeros.append(valor)

    # nueva captura de datos
    valor = int(input("Digite un valor, para salir, digite 0: "))

    # imprimo la lista
    print(numeros)