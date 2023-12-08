def factorial(numero):
    if numero < 0:
        return "El factorial no está definido para números negativos."
    elif numero == 0:
        return 1
    else:
        resultado = 1
        for i in range(1, numero + 1):
            resultado *= i
        return resultado

# Ejemplo de uso:
numero = 5
resultado = factorial(numero)
print(f"El factorial de {numero} es {resultado}")

numero1 = 10
resultado1 = factorial(numero1)
print(f"El factorial de {numero1} es {resultado1}")

numero2 = 8
resultado2 = factorial(numero2)
print(f"El factorial de {numero2} es {resultado2}")