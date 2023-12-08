# BUCLE FOR

# for (valor inicial, valor final, incremento)
# for (int i=500; i<=1000; i++)

#for i in range(500, 1001, 2):
   # print(i)

# for i in range(100,0, -1):
   # print(i)


'''
Realizar un recorrido de numeros entre 1 y 10,
determinar cuantos numeros pareas hay
'''
# Mensaje de bienvenida
print("Recorrido de numero 1 al 10")

# Declaracion de la variable contador
contador = 0

# Declarando el ciclo for
for i in range(1,11):
    # para validar los numeros pares
    # usaremos la division modular
    if i%2 == 0:
        contador = contador + 1

    print(f"Hay {contador} numeros pares")