Algoritmo pago
	definir ht,he,het como enteros;
	definir ph,phe,pt como real;
	Escribir "por favor ingrese las horas trabajadas";
	leer ht;
	Escribir "por favor ingrese pago por hora";
	leer ph;
	Si ht>40 Entonces
		he=ht-40;
		si he>8 Entonces
			het=he-8;
			phe=(ph*2*8)+(ph*3*het);
		SiNo 
			phe=ph*2*he;
		FinSi
		pt=(ph*40)+phe;
	SiNo
		pt=ph*ht;
	Fin Si
	Escribir "El pago total por las horas trabajadas es:",pt;
FinAlgoritmo
