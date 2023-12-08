Algoritmo Practica_vector2
	Definir n,i Como Entero;
	Definir datos,numero1,numero2 Como Entero;
	Dimension datos[10];
	Escribir "Ingrese la cantidad de elementos:";
	Leer n;
	Para i=1 Hasta n Hacer
		Escribir "Ingrese el " i " elemento";
		Leer datos[i];
	Fin Para
	Si datos[1]>datos[2] Entonces
		numero1=datos[1];
		numero2=datos[2];
	SiNo
		numero1=datos[2];
		numero2=datos[1];
	Fin Si
	Para i=3 Hasta n Hacer
		Si datos[i]>numero1 Entonces
			numero2=numero1;
			numero1=datos[i];
		SiNo
			Si datos[i]>numero2 Entonces
				numero2=datos[i];
			Fin Si
		Fin Si
	Fin Para
	Escribir "El mayor elemento es: ",numero1;
	Escribir "El segundo mayor elemento es: ",numero2;
FinAlgoritmo
