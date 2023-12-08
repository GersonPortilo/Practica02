Algoritmo Actividad4_4
	Definir a,b,c Como Entero;
	Definir nombre Como Caracter;
	Definir nota Como Real;
	Escribir "Ingrese la cantidad de estudiantes";
	Leer c;
	Dimension nombre[c];
	Dimension nota[c];
	
	Para a=1 Hasta c Con Paso 1 Hacer
		Escribir "Ingrese el nombre del estudiante ",a;
		Leer nombre[a];
		Escribir "Ingrese la nota del estudiante ",a;
		Leer nota[a];
	Fin Para
	
	Para b=1 Hasta c Con Paso 1 Hacer
		Escribir Sin Saltar"La nota del alumno ",nombre[b];
		Escribir " es  : ",nota[b];
	Fin Para
	
FinAlgoritmo
