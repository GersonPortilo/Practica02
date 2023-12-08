Algoritmo primer_ejercicio
	definir i, a, b como entero;
	definir sueldo,total como Real;
	i=0;
	a=0;
	b=0;
	total=0;
	Mientras i<>0 Hacer
		Escribir "1= ingrese sueldo";
		Escribir "0= salir";
		Leer i;
		Si i==1 Entonces
			Escribir "Ingrese el sueldo";
			Leer sueldo;
			si sueldo >=360 y sueldo <=500 Entonces
				a=a+1;
				total=total+sueldo;
		SiNo
			si sueldo >360 y sueldo <=800 Entonces
				b=b+1;
				total=total+sueldo;
			SiNo
				Escribir "El sueldo no es el correcto";
			FinSi
		FinSi
	FinSi	
Fin Mientras
Escribir "Sueldos entre $360 y $500: ",a;
Escribir "Sueldos mayores a $500: ",b;
Escribir "La empresa paga en sueldos: $ ",total;
	
	
FinAlgoritmo
