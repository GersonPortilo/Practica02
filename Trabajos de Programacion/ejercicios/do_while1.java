class do_while1
{
    public static void main (String[] args)
	{
	    int i = 1;
		while (i<6)
		{
		    System.out.println(" bucle while "+i);
			i++;
		}
		//	i=1;
		do
		{
		    System.out.println(" bucle do_while "+i);
            i++;
        }
        while(i<6);
		
		System.out.println(" valor final "+i);
    }
}	