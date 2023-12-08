Algoritmo ejercicio1
	definir a, meses como entero;
	definir gasto, suma_de_gastos,promedio como real;
	a=0;
	meses=0;
	gasto=0;
	suma_de_gastos=0;
	promedio=0;
	Escribir "ingrese la cantidad de meses transcurridos en numeros";
	Leer meses;
	Para a=1 Hasta meses Con Paso 1 Hacer
		Escribir "ingrese la cantidad gastada del mes ",a;
		Leer gasto;
		suma_de_gastos=suma_de_gastos+gasto;
	Fin Para
	promedio=suma_de_gastos/meses;
	Escribir "El promedio gastado hasta el momento es de : $",promedio;
FinAlgoritmo
