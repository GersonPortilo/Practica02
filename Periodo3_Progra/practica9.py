# MODULOS DE PYTHON

# modulo collections
# counter
from collections import Counter

lista = [1,2,3,4,5,6,7,8,9,1,2,3,4]

print(Counter(lista))

# Uso de string
animales = "gato perro canario perro canario perro"
c = Counter(animales.split())
print(c)

# Funciones especificas
print(c.most_common(1)) # primeros elementos mas repetidos

print(c.most_common(2)) # primeros dos elementos mas repetidos

print(c.most_common())
