import java.util.Scanner;
public class programa1
{
    public static void main(String[] args)
	{
		try
		{
	    Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int suma = 0;
		
		for (int i=1; i<=5; i++)
		{
		    System.out.println("Ingrese un numero");
			num=entrada.nextInt();
			suma=suma+num;
		}
		    System.out.println("El resultado de la suma es "+ "el siguiente: " + suma);
		}	
		catch (Exception e)
		{
		System.out.println("Intentamos ejecutar el resultado de la suma");
		}
		finally
		{
		System.out.println("Intentamos ejecutar el resultado finalmente tanto si se producen arrores como si no.");
		}
	}
}
