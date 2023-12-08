Algoritmo ejercicio1_do_while
	definir pares, ceros, negativos, a, i Como Entero;
	pares=0;
	ceros=0;
	negativos=0;
	a=1;
	Repetir
		Escribir a, "-Ingrese un numero";
		Leer i;
		si i==0 Entonces
			ceros=ceros+1;
		SiNo
			Si i<0 Entonces
				negativos=negativos+1;
			SiNo
				si (i mod 2=0) Entonces
					pares=pares+1;
				FinSi
			Fin Si
		FinSi
		a=a+1;
	Hasta Que a>20
	Escribir "Los numeros pares son: ",pares;
	Escribir "Los numeros ceros son: ",ceros;
	Escribir "Los numeros negativos son: ",negativos;
FinAlgoritmo
