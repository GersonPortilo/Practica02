Algoritmo Seleccion
	Definir a,b,c como reales;
	Definir d como entero;
	Escribir "Ingrese pimer numero";
	Leer a;
	Escribir "Ingrese segundo numero";
	Leer b;
	Escribir "Ingrese la opcion deseada";
	Escribir "1 - Suma";
	Escribir "2 - Resta";
	Escribir "3 - Mutiplicacion";
	Escribir "4 - Division";
	Leer d;
	Si d==1 Entonces
		c=a+b;
		Escribir "La Suma es ",c;
	SiNo
		Si d==2 Entonces
			c=a-b;
			Escribir "La Resta es ",c;
		SiNo
			Si d==3 Entonces
				c=a*b;
				Escribir "La Multiplicacion es ",c;
			SiNo
				Si d==4 Entonces
					c=a/b;
					Escribir "La Division es ",c;
				SiNo
					Escribir "Ingrese un valor entre 1 y 4";
				Fin Si
			Fin Si
		Fin Si
	FinSi
FinAlgoritmo
