# Encapsulamiento en POO

# crear un molde base
class Ejemplo:
      __atributo_privado = "Soy un atributo privado inalcanzable desde afuera"
      def __metodo_privado(self):
            print("Soy un atributo privado inalcanzable desde afuera")
      
      # como acceder
      def atributo_publico(self):
            return self.__atributo_privado
      
      def metodo_publico(self):
            return self.__metodo_privado
      

# main
e = Ejemplo()
print(e.atributo_publico())
e.metodo_publico()