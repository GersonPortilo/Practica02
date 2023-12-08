# MODULOS DE PYTHON

# modulo collections
# defaultdict
from collections import defaultdict

d1 = defaultdict(float)
print(d1['value'])
print(d1)

d2 = defaultdict(str)
print(d2['value'])
print(d2)

d3 = defaultdict(object)
print(d3['value'])
print(d3)