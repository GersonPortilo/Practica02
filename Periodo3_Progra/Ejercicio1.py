# Realizar en Python un programa que conste de una clase llamada
# Alumno, que tenga como atributos el nombre y la nota del alumno.
# Definir los metodos para inicializar sus atributos, imprimirlos
# y mostrar un mensaje con el resultado de la nota y si ha aprobado o no.

class Alumno:
    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota

    def imprimir_informacion(self):
        print(f"Nombre: {self.nombre}")
        print(f"Nota: {self.nota}")

    def mostrar_resultado(self):
        if self.nota >= 5.0:
            print(f"{self.nombre} ha aprobado.")
        else:
            print(f"{self.nombre} no ha aprobado.")

# Ejemplo de uso:
nombre_alumno = input("Ingrese el nombre del alumno: ")
nota_alumno = float(input("Ingrese la nota del alumno: "))

alumno1 = Alumno(nombre_alumno, nota_alumno)

alumno1.imprimir_informacion()
alumno1.mostrar_resultado()