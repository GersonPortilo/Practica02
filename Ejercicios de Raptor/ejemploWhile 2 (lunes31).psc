Algoritmo ejemploWhile
	definir num como entero;
	definir suma, producto como real;
	definir resp como caracter;
	suma=0;
	producto=0;
	resp='S';
	
	Mientras resp<>'n' y resp<>'N' Hacer
		Escribir "Ingrese un numero entero";
		Leer num;
		suma=suma+num;
		producto=producto*num;
		Escribir "Desea continuar ingresando numeros";
		Escribir "(s) (n)";
		Leer resp;
	Fin Mientras
	
	Escribir "El total de la suma es ",suma;
	Escribir "El total de la multiplicacion es ",producto;
FinAlgoritmo
