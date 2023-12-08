Algoritmo Actividad4_5
	Definir a,b Como Entero;
	Definir mes Como Caracter;
	Definir orden Como Entero;
	Dimension mes[12];
	Dimension orden[12];
	
	Para a=1 Hasta 12 Con Paso 1 Hacer
		orden[a]=a;
		Escribir "Ingrese el nombre del mes ",a;
		Leer mes[a];
	Fin Para
	
	Para a=1 Hasta 12 Con Paso 1 Hacer
		Escribir Sin Saltar"El mes ",orden[a];
		Escribir " es  : ",mes[a];
	Fin Para
FinAlgoritmo
