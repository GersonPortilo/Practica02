Algoritmo practica4
	definir i, notas, menores, mayores como entero;
	i=0;
	menores=0;
	mayores=0;
	
	Para i=1 Hasta 10 Hacer
		Escribir "Ingrese las notas del alumno #",i;
		Leer notas;
		Si notas<7 Entonces
			mayores=mayores+1;
		SiNo
			menores=menores+1;
		Fin Si
		
    Fin para
	Escribir "Alumnos con notas mayores a 7 son: ",mayores;
	Escribir "Alumnos con notas menores a 7 son: ",menores;
	
FinAlgoritmo
