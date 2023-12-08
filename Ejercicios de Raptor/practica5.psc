Algoritmo practica5
	definir i, piezas, apta, noapta como enteros;
	definir tabla como real;
	i=0;
	apta=0;
	noapta=0;
	Escribir "Ingrese la cantidad de piezas";
	Leer piezas;
	
	Mientras i<piezas Hacer
		Escribir "Ingrese el tamaño de la tabla";
		Leer tabla;
		Si (tabla>2.48 y tabla<2.53) Entonces
			apta=apta+1;
		SiNo
			noapta=noapta+1;
		Fin Si
		i=i+1;
	Fin Mientras
	Escribir "La cantidad de piezas aptas son: ",apta;
	
FinAlgoritmo
