from ast import Num


print("Coversor de monedas a dolares")

centavo=int(input("Ingrese la cantidad de monedas de centavos"))
cinco=int(input("Ingrese la cantidad de monedas de cinco"))
diez=int(input("Ingrese la cantidad de monedas de diez"))
coras=int(input("Ingrese la cantidad de monedas de coras"))
dolar=int(input("Ingrese la cantidad de monedas de dolares"))

num1=centavo*0.01
num2=cinco*0.05
num3=diez*0.10
num4=coras*0.25

total = num1+num2+num3+num4+dolar
print(round(total,2))
