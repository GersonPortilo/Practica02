Algoritmo Actividad4_3
	Definir i,j,a,b Como Entero;
	Definir M,c como Caracter;
	a=5;
	b=2;
	Dimension M[a,b];
	Para i=1 Hasta a Con Paso 1 Hacer
		Para j=1 Hasta b Con Paso 1 Hacer
			Si (j%2)<>0 Entonces
				Escribir Sin Saltar"Ingrese nombre continente ";
				Leer c;
				M[i,j]=c;
			SiNo
				Escribir Sin Saltar"Ingrese Pais ";
				Leer c;
				M[i,j]=c;
			Fin Si
		Fin Para
	Fin Para
	Escribir "-----------------------";
	Para i=1 Hasta a Con Paso 1 Hacer
		Escribir Sin Saltar"  " ;
		Para j=1 Hasta b Con Paso 1 Hacer
			Escribir Sin Saltar"   ",M[i,j];
		Fin Para
		Escribir " " ;
	Fin Para
	Escribir "------------------------";
FinAlgoritmo
