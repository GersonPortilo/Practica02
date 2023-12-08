Algoritmo Ejercicio3
	definir a, b Como Entero;
	definir c, pares, impares como real;
	a=0;
	b=0;
	c=0;
	pares=0;
	impares=0;
	Escribir "Ingrese un numero";
	Leer b;
	Para a=1 Hasta b Con Paso 1 Hacer
		c= a mod 2;
		Si c==0 Entonces
			pares=pares+a;
		SiNo
			impares=impares+a;
		Fin Si
	Fin Para
	Escribir "La suma de todos los numeros pares es :",pares;
	Escribir "La suma de todos los numeros impares es :",impares;
FinAlgoritmo
