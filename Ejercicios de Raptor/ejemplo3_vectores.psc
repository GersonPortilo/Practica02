Algoritmo ejemplo3_vectores
	definir a,i Como Entero;
	definir estudiantes Como Caracter;
	
	Escribir "Ingrese la cantidad de estudiantes";
	Leer a;
	dimension estudiantes[a];
	
	Para i=1 Hasta a Con Paso 1 Hacer
		Escribir "Ingrese en nombrde del alumno# ",i;
		Leer estudiantes[i];
	Fin Para
	
	Para i=1 Hasta a Con Paso 1 Hacer
		Escribir "el estudiante en la posicion ",i, " es ",estudiantes[i];
	Fin Para

	

	
	
	
	
FinAlgoritmo
