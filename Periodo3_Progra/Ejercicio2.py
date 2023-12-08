# Creando la clase
# molde llamado Alumno
class Alumno:
      def __init__(self, nombre, nota):
            self.nombre = nombre
            self.nota = nota

        # para imprimir
            def imprimir(self):
              print(f"Nombre: {self.nombre}")
              print(f"Nota: {self.nota}")

        # aprobado o no
            def resultado(self):
              # condicion
              if self.nota >= 6:
                    print(f"{self.nombre} ha aprobado")

              else: 
                    print(f"{self.nombre} noha aprobado")
