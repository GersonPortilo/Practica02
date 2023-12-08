# MANEJO DE ERRORES Y EXCEPCIONES EN PYTHON

while(True):
    try:

      n = float(input("Introduce un numero: "))
      m = 4
      print("{}/{} = {}".format(n,m,n/m))
      break
    except:
      print("Ha ocurrido un error")
    else:
       print("Codigo funcionando")
       break
    finally:
       print("Fin de la iteracion")
    