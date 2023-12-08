# MODULOS DE PYTHON

# modulo datetime

from datetime import datetime, timedelta

dt = datetime.now()
print(dt)

# Fecha
print(dt.year)
print(dt.month)
print(dt.day)

# Hora
print(dt.hour)
print(dt.minute)
print(dt.second)
print(dt.microsecond)

# Formato
print("{}:{}:{}".format(dt.hour, dt.minute, dt.second))

print("{}/{}/{}".format(dt.day, dt.month, dt.year))

# Forma manual
#dt = datetime(2023,11,11)
#print(dt)

# Formato avanzado
print(dt.isoformat())

manual = dt.strftime("%A %d %B %Y %I:%M")
print(manual)

manual = dt.strftime("%a %d %B %Y %H:%M")
print(manual)

# Operadores
t = timedelta(days=24, hours=4, seconds=1000)
print(t)

# Suma








