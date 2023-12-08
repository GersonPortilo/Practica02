# MANEJO DE ERRORES Y EXCEPCIONES EN PYTHON

try:
      n = input("Introduce un numero: ")
      5/n
except Exception as e:
      print("Ha ocurrido un error", type(e).__name__)