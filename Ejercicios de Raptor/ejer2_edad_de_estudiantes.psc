Algoritmo ejer2_edad_de_estudiantes
	definir estudiantes, i, edad Como Entero;
	definir suma, promedio Como Real;
	estudiantes=0;
	i=0;
	edad=0;
	suma=0;
	promedio=0;
	Escribir "Ingrese la candidad de estudiantes de la clase ";
	Leer estudiantes;
	Repetir
		Escribir "Ingrese la edad del estudiante";
		Leer edad;
		suma=suma+edad;
		i=i+1;
	Hasta Que i=estudiantes
	promedio=suma/estudiantes;
	Escribir "La edad promedio de la clase es : ",promedio," años";
	
FinAlgoritmo
