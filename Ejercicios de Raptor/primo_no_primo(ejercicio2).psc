Algoritmo primo_no_primo
	definir i, a, cont como entero;
	Escribir "Por favor ingrese un numero";
	Leer a;
	
	cont<-0;
	
	Para i<-1 Hasta a Hacer
		si a%i=0 Entonces
			cont<-cont+1;
		FinSi
	Fin Para
	Si cont=2 Entonces
		Escribir a," es un numero primo";
	SiNo
		Escribir a," no es un numero primo";
	Fin Si
	
	
FinAlgoritmo
