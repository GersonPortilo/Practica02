# Haccer galletas
'''
UN molde, este molde servira para crear todas las galletas
caracteristicas:
color, sabor, textura
'''

# Definiendo una clase
# Consejo: el nombre deuna clase se debe hacer
# con la notacion Uppercase
class Galleta:
    pass

# Para invocar el contenido de una clase
# se una la instancia para crer un objeto

galleta = Galleta()

print(galleta)

otra_galleta = Galleta()

print(otra_galleta)

print(type(galleta))
print(galleta.__class__)

print(Galleta.__name__)
print(type(otra_galleta.__name__))
print(otra_galleta.__class__.__name__)