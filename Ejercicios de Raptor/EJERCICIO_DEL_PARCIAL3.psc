Algoritmo EJERCICIO_DEL_PARCIAL3
	Definir a,b,estudiantes, edad Como Entero;
	Definir nombre Como Caracter;
	Definir materia Como caracter;
	Escribir "ingrese la cantidad de estudiantes";
	Leer estudiantes;
	Dimension nombre[10];
	Dimension edad[10];
	Dimension materia[10];
	Para a=1 Hasta 10 Con Paso 1 Hacer
		Escribir "ingrese el nombre del estudiante ",a;
		Leer nombre[a];
		Escribir "ingrese la edad";
		Leer edad[a];
		Escribir "ingrese la materia del estudiante ",a;
		Leer materia[a];
	Fin Para
	Para b=1 Hasta 10 Con Paso 1 Hacer
		Escribir Sin Saltar"la materia que esta cursando el alumno ",nombre[b];
		Escribir " es : ",materia[b];
	Fin Para
FinAlgoritmo
