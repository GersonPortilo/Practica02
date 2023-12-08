//tipo de conversion explicita
class ejemploconversion2
{
    public static void main(String[] args)
	{
	    double d = 100.04;
		double c = 128.5;
		
		long l = (long)d;
		
		int i = (int)c;
		
		byte h = (byte)i;
		
		System.out.println("Valor Double "+d);
		System.out.println("Valor Double "+c);
		
		System.out.println("Valor Long "+l);
		System.out.println("Valor long "+i);
		
	}
}	
