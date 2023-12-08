#Convertir grados Fahrenheit a grados Celsius.
#C = (F-32)*5/9

def convertir(f):
    return (f-32)*5/9 

n = float(input("Ingrese los grados celsius: "))
print(f"La conversion a grados Fahrenheit es: {convertir(n)}")
