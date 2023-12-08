Algoritmo ejercicio4_while
	definir x, n como enteros;
	x=0;
	n=0;
	Mientras x<=50 Hacer
		si x mod 5==0 Entonces
			escribir x;
			n=n+x;
		FinSi
		x=x+1;
	Fin Mientras
	Escribir "la suma de los multiplos de 5 son: ",n;
	
FinAlgoritmo
