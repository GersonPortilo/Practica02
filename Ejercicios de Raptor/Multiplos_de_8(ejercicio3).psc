Algoritmo Multiplos_de_8
	definir num, lim, i, multiplos como real;
	Escribir "De que numero desea obtener los multiplos? ";
	Leer num;
	Escribir "Hasta que numero desea que se imprima la serie? ";
	Leer lim;
	i<-1;
	multiplos<-num;
	Escribir "Los multiplos de ",num, "son: ";
	Mientras multiplos<lim Hacer
		Escribir "- ",multiplos;
		i<-i+1;
		multiplos<-num*i;
	Fin Mientras
FinAlgoritmo
