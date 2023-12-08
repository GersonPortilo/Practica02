Algoritmo Contratacion_de_una_Empresa
	Definir Nombre como Caracter;
	Definir gradoDeEstudio, Edad como Entero;
	Escribir "Ingrese su nombre completo por favor ";
	Leer Nombre;
	Escribir " su grado de estudios: ingrese 1 si es Preparatoria, ingrese 2 si es Licenciado, ingrese 3 si es ingeniero ";
	Leer gradoDeEstudio;
	Escribir "Ingrese su Edad";
	Leer Edad;
	Si Edad >= 18 Entonces;
		Escribir "Usted ha sido contratado";
		Si gradoDeEstudio= 1 Entonces; 
			Escribir "A usted le corresponde al area de Produccion";
		SiNo
			Si gradoDeEstudio=2 Entonces;
				Escribir "A usted le corresponde al area administrativa";
			SiNo
				Si gradoDeEstudio=3 Entonces
					Escribir "A usted le correspode al area de gerencia ";
				SiNo
					Escribir "Su puesto no ha sido definido, consulte con recursos humanos";
				Fin Si
			Fin Si
		Fin Si
	SiNo
		Escribir "Su edad es menor a la requerida, intente de nuevo cuando los haya cumplido ";
	
	Fin Si
	
	
FinAlgoritmo
