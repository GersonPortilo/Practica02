public class ejemploconversion4
{
    public static void main(String args [])
	{
	byte z = 40;
	byte x = 50;
	byte y = 100;
	int q = x * z / y;
	System.out.println(q);
	System.out.println("----------------------------");
	 
	byte b = 42;
	char c = 'a';
	short s = 1024;
	int i =50000;
	float f = 5.67f;
	double d = .1234;
	
	double result = (f * b) + (i/c) - (d * s);
	System.out.println("Resultado = "+result);
	}
}
	