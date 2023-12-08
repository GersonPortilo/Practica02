Algoritmo Practica_vector1
	Definir n, b, c, valores Como Entero;
	Escribir "Ingrese la cantidad de numeros";
	Leer n;
	Dimension valores[n];
	Dimension c[n];
	Para b=1 Hasta n Hacer
		Escribir "Ingrese el " b " numero";
		Leer valores[b];
		c[b]=valores[b]*valores[b];
		Escribir "Elevado al cuadrado es: ",c[b];
	Fin Para
	
FinAlgoritmo
