Algoritmo Practica_vector3
	Definir tamaño, i Como Entero;
	Definir numeros_aleatorios, aprobados, desaprobados Como Reales;
	Definir sum_aprobados,sum_desaprobados, prom_aprovados, prom_desaprobados como reales;
	aprobados=0;
	desaprobados=0;
	sum_aprobados=0;
	sum_desaprobados=0;
	
	Escribir "Escribe un numero para el tamaño del arreglo";
	Leer tamaño;
	Dimension numeros_aleatorios[tamaño];
	
	Para i=1 Hasta tamaño Con Paso 1 Hacer
		numeros_aleatorios[i] = Aleatorio(0,10);
		Escribir numeros_aleatorios[i];
		Si numeros_aleatorios[i]>=6 Entonces
			aprobados=aprobados + 1;
			sum_aprobados=sum_aprobados + numeros_aleatorios[i];
		SiNo
			desaprobados=desaprobados + 1;
			sum_desaprobados=sum_desaprobados + numeros_aleatorios[i];
		Fin Si
	Fin Para
	prom_aprovados = sum_aprobados / aprobados;
	prom_desaprobados = sum_desaprobados / desaprobados;
	Escribir "Hay ",aprobados," aprobados";
	Escribir "Hay ",desaprobados," desaprobados";
	Escribir "El promedio de los aprobados es ",prom_aprovados;
	Escribir "El promedio de los desaprobados es ",prom_desaprobados;
FinAlgoritmo
