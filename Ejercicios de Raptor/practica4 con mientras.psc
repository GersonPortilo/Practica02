Algoritmo practica4
	definir a, menores, mayores como entero;
	a=1;
	menores=0;
	mayores=0;
	
	Mientras a<=10 Hacer
		Escribir "Ingrese la nota del alumno #",a;
		Leer a;
		Si a>7 Entonces
			mayores=mayores+1;
		SiNo
			menores=menores+1;
		Fin Si
		a=a+1;
	Fin Mientras
	Escribir "Alumnos con notas mayores a 7 son: ",mayores;
	Escribir "Alumnos con notas menores a 7 son: ",menores;
	
FinAlgoritmo
