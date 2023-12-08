Algoritmo ejercicio3_while
	definir x, cont Como Entero;
	x=1000;
	cont=0;
	Mientras x<=1500 Hacer
		si x mod 3==0 Entonces
			Escribir x;
		FinSi
		x=x+1;
		cont=cont+1;
	Fin Mientras
	Escribir "Hay ",cont " Multiplos de 3 ";
FinAlgoritmo
