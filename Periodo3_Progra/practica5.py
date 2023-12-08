# FUNCIONES EN PYTHON

# Uso del return e invocaciones de funciones

# simepre debe ir la/las dunciones/es del codigo
def suma():
    suma = 50 + 10
    return suma

def msn(num, mensaje):
    if(num == 0):
        print(mensaje)
        return 1
    return 0

def prod(num, nombre):
    if(num == 0):
        print("Hola", nombre)
        return
    print("adios", nombre)

    # llamado de la funcion
    suma()


# llamando de funcion
suma()

resp = msn(1, "Hola")

prod(msn(1, "Hola"), "Juan")
