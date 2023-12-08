Algoritmo tiendadehelado 
	Definir totalcompra, precio, pordes, descuento, totalpagar como real;
	definir cantidad como entero;
	definir producto como caracter;
	Escribir "Descuento de compra del producto";
	Escribir "Ingrese el nombre del producto comprado:";
	leer producto;
	Escribir "Ingresa el precio del producto:";
	leer precio;
	Escribir "Ingresa la cantidad comparda del producto:";
	leer cantidad;
	totalcompra <- precio *  cantidad;
	Escribir "El total de la compra es:$", totalcompra;
	Si cantidad < 5  Entonces
		pordes <- 10;
	SiNo
		Si cantidad < 10 Entonces
	        pordes <- 15; 
		SiNo
			Si cantidad < 15 Entonces
				pordes <- 20;
			SiNo
				pordes <- 25;
			Fin Si
		Fin Si
	Fin Si
	Escribir "El porcentaje de descuento es:", pordes, "%";
	descuento <- totalcompra * pordes / 100;
	Escribir "El total de descuento es:", descuento;
	totalpagar <- totalcompra - descuento;
	Escribir "El total a pagar es:$", totalpagar;
FinAlgoritmo
