pies = int(input("Ingrese la cantidad de pies: "))
pulgadas = int (Input("Ingrese la cantidad de pulgadas: "))

conversion_pies_a_cm = pies * 30.48
conversion_pulgadas_a_cm = pulgadas * 2.54

distancia_cm = conversion_pies_a_cm + conversion_pulgadas_a_cm

print("La distancia ingresada es equivalente a",distancia_cm,"centrimetros")

