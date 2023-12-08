Algoritmo Numero_mayor
	definir a,b,c como entero;
	a=4;
	b=5;
	c=6;
	Escribir "Ingrese primer numero entero";
	Leer a;
	Escribir "Ingrese segundo numero entero";
	Leer b;
	Escribir "Ingrese tercer numero entero";
	Leer c;
	Si a>b y a>c  Entonces
		Escribir"el numero mayor es ",a;
	SiNo
		Si b>c Entonces
			Escribir"el numero mayor es ",b;
		SiNo
			Escribir"el numero mayor es ",c;
		Fin Si
	Fin Si
FinAlgoritmo
