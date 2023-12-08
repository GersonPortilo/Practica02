Algoritmo Ejercicio4
	definir a, estudiantes, edad como entero;
	definir suma,promedio como reales;
	a=0;
	estudiantes=0;
	edad=0;
	suma=0;
	promedio=0;
	
	Escribir "Ingrese la cantidad de estudiantes del grupo";
	Leer estudiantes;
	Para a=1 Hasta estudiantes Con Paso 1 Hacer
		Escribir "Ingrese la edad del estudiante ",a;
		Leer edad;
		suma=suma+edad;
	Fin Para
	promedio=suma/estudiantes;
	Escribir "La suma de las edades de los estudiantes es de ",suma;
	Escribir "El promedio de edad de los estudiantes es de ",promedio;
	
	
	
	
	
	
FinAlgoritmo
