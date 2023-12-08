public class programa
{
    public static void main (String[] args)
	{
	    try
		{
		int i = 1;
		while (i<6)
		{
		    System.out.println(" bucle while "+i);
			i++;
		}
			i=1;
		do
		{
		    System.out.println(" bucle do_while "+i);
            i++;
        }
        while(i<6);
		 
		    System.out.println("Intentamos ejecutar el bloque de instrucciones");
			System.out.println("Instruccion 1.");
			System.out.println("Instruccion 2.");
			System.out.println("Instruccion 3, etc.");
		}
		catch (Exception e)
		{
		System.out.println("Intentamos ejecutar el bloque de instrucciones");
		}
		finally
		{
		System.out.println("Intentamos a ejecutar finalmente tanto si se producen arrores como si no.");
		}
	}
}
		
	