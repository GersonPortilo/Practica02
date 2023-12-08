# Realizar en Python un programa que tenga una clase Persona con las siguientes
# caracteristicas. La clase tendra como atributos el nombre y la edad de una 
# persona. Implementar los metodos necesarios para inicializar los atributos
# mostrar los datos e indicar si la persona es mayor de edad o no.

class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def mostrar_datos(self):
        print(f"Nombre: {self.nombre}")
        print(f"Edad: {self.edad} años")

    def es_mayor_de_edad(self):
        if self.edad >= 18:
            print(f"{self.nombre} es mayor de edad.")
        else:
            print(f"{self.nombre} no es mayor de edad.")

# Ejemplo de uso:
nombre_persona = input("Ingrese el nombre de la persona: ")
edad_persona = int(input("Ingrese la edad de la persona: "))

persona1 = Persona(nombre_persona, edad_persona)

persona1.mostrar_datos()
persona1.es_mayor_de_edad()