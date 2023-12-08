Algoritmo Practica_vector4
	Definir a,b Como Entero;
	Definir estudiantes Como Caracter;
	Definir edad Como Entero;
	Dimension estudiantes[15];
	Dimension edad[15];
	
	Para a=1 Hasta 15 Con Paso 1 Hacer
		Escribir "ingrese el nombre del estudiante";
		Leer estudiantes[a];
		Escribir "ingrese la edad del estudiante";
		Leer edad[a];
	Fin Para
	Para a=1 Hasta 15 Con Paso 1 Hacer
		Escribir sin saltar"ingrese el nombre del estudiante es : ",estudiantes[a];
		Escribir " Y su edad es : ",edad[a]," años";
	Fin Para
	
FinAlgoritmo
