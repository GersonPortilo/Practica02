# Ejemplo sobre ub catalogo de peliculas
# Primero crear el molde del objeto
class Pelicula:
      # luego se crea los metodos
      # un metodo de clase es la forma de crear una 
      # caracteristica del objeto y que luego vamos a llamar

      # un constructor es igual que un metodo de clase
      # la diferencia que el invoca en la llamada de
      # las clase

      def __init__(self, titulo, duracion, lanzamiento):
           # aqui vamos a crear los atributos que recibe
           # el constructor
           # self.nombre_atributo = nombre_parametro
           self.titulo = titulo
           self.duracion = duracion
           self.lanzamiento = lanzamiento

           # impresion de pantalla
           print("Se ha creado la pelicula")


# segundo molde, este servira para crear un catalogo
class Catalogo: 

        # en la POO, tambien puede crear atributos (caracteristicas)
        # fuera de los metodos
        Pelicula = []

        def __init__(self, peliculas=[]):
                 self,peliculas = peliculas
         # ejemplo de metodos de clases
        def agregar(self, p):
                 self.peliculas.append(p)

        def mostrar(self):
                 for i in self.peliculas:
                       print(1)

    #########################################################################
    # MAIN

p = Pelicula("El Padrino", 175, 1972)
c = Catalogo([p])
                 
      

