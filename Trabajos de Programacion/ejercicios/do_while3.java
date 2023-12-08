class do_while3
{
    public static void main (String[] args)
	{
		double numero, acumulador;
	    int i = 1;
		Scanner obj = new Scanner (System.in);
		
		do
		{
			System.out.println("ingrese un numero");
		    numero = obj.nextDouble();
			acumulador=acumulador+numero;
            i++;
        }
        while(i<10);
		 
		System.out.println("la suma de los numeros da "+acumulador);
		
    }
}	