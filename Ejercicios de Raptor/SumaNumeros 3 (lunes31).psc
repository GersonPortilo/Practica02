Algoritmo SumaNumeros
	Definir a,b,i como enteros;
	definir suma como real;
	definir bandera como Logico;
	suma=0;
	i=0;
	bandera=falso;
	Escribir "Ingrese primer numero entero";
	Leer a;
	Escribir "Ingrese segundo numero entero";
	Leer b;
	
	Mientras bandera=falso Hacer
		Para i=a Hasta b Con Paso 1 Hacer
			suma=suma+i;
		Fin Para
		
		Si i>b Entonces
			bandera=verdadero;
		SiNo
		Fin Si
	Fin Mientras
	Escribir "La suma es de ",suma;
	
	
	
FinAlgoritmo
