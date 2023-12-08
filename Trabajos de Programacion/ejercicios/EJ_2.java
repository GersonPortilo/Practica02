import java.util.Scanner;
public class EJ_2
{
	public static void main(String[] args)
	{
	
		try
		{		
		int rebote =0;
		int i=0;
		Scanner registro = new Scanner(System.in);
		System.out.println("ingresa la altura inicial en metros desde donde se deja caer la pelota, mayor a 50 centimetros");
		double altura = registro.nextDouble();
		 
		if(altura>0.50)
			{
				do 
				{
				rebote=rebote+1;
				altura=(altura*2)/3;
				System.out.println("Despues del rebote # "+rebote+" La altura es "+altura+" metros");
				i++;
				}
				while(altura>0.50);
			}
		else
		{
		System.out.println("La altura agragada esta fuera del rango");
		System.out.println("El progrma no tiene contemplado hacer calculos con esta altura");
		}

		}	
		
		catch (Exception e)
		{
		System.out.println("El valor ingresado no es numerico");
		}
		
		finally
		{
			System.out.println("fin de la ejecucion");
		}

	}
}