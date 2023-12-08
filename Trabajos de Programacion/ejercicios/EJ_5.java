class EJ_5
{
	public static void main (String[] arg)
	{
		try
		{
		int n=50;
		int a=0;
		int b=1;
		int c;
		int i=0;
		
	    do
		{
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
			i=i+1;
		}
		while(i<=n);
		}
		catch(Exception e)
		{
			System.out.println("error al ejecutar el programa");
		}
		finally
		{
			System.out.println(" fin de la ejecucion");
		}
	}
}