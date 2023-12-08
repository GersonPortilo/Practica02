# FUNCIONES EN PYTHON

'''
vamos a creer una foncion que muestra por pantalla el resultado
de multiplicar un numero por 5
'''

# para usar una funcion, esta debe existir previamnete
# primero es declarar la funcion
def multiplicar(num):
    # las instrucciones
    res = num * 5
    print(f"{num} x 5 = {res}")

####################################################################
# cuerpo del programa
print("Inicio del programa...")

# llamado de la funcion
multiplicar(4)
multiplicar(113)

# fin
print("Finalizando...")