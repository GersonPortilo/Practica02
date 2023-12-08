Algoritmo Actividad4_1
	Definir i,j,a,b Como Entero;
	Definir M,c como Entero;
	Definir sumatoria,pares,impares Como Real;
	Dimension m[5,6];
	sumatoria=0;
	impares=0;
	pares=0;
	Para i=1 Hasta 5 Con Paso 1 Hacer
		Para j=1 Hasta 6 Con Paso 1 Hacer
			m[i,j]=azar(10);
			sumatoria=sumatoria+m[i,j];
			Si (m[i,j]%2)<>0 Entonces
				impares=impares+m[i,j];
			SiNo
				pares=pares+m[i,j];
			Fin Si
		Fin Para
	Fin Para
	Para i=1 Hasta 5 Con Paso 1 Hacer
		Para j=1 Hasta 6 Con Paso 1 Hacer
			Escribir "El elemento en la posicion [",i,"] [",j,"] es ",m[i,j];
		Fin Para
	Fin Para
	Escribir "----------------";
	Escribir "La suma de los elementos en la matriz es : ",sumatoria;
	Escribir "La suma de los elementos pares en la matriz es : ",pares;
	Escribir "La suma de los elementos impares en la matriz es : ",impares;
FinAlgoritmo
