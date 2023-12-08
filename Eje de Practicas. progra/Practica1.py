# Crear una lista vacía para almacenar los sueldos
sueldos = []

# Usar un bucle for para pedir los sueldos al usuario y almacenarlos en la lista
for i in range(5):
    sueldo = float(input(f"Ingrese el sueldo del operario {i + 1}: "))
    sueldos.append(sueldo)

# Imprimir la lista de sueldos
print("Lista de sueldos de operarios:", sueldos)

# Calcular el promedio de sueldos
promedio = sum(sueldos) / len(sueldos)

# Imprimir el promedio de sueldos
print("Promedio de sueldos:", promedio)