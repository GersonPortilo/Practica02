Algoritmo ejercicio5_for
	definir b, c, i, n, pares Como Enteros;
	b=0;
	c=0;
	i=0;
	n=0;
	pares=0;
	
	Escribir "Ingrese el valor donde Iniciara";
	Leer b;
	Escribir "Ingrese  el valor donde terminara";
	Leer c;
	Para i=b Hasta c Con Paso 1 Hacer
		si i mod 2==0 Entonces
			Escribir i;
			pares=pares+1;
		FinSi
		si i mod 3==0 Entonces
			n=n+i;
		FinSi
	Fin Para
	
	
FinAlgoritmo
