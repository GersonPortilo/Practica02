import java.util.Scanner;
public class Estaturas
{
    public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero de Estaturas");
		int n = sc.nextInt();
		
		double suma_total = 0;
		double suma_bajo = 0;
		int cant_bajo = 0;
		
		for(int i = 0; i < n; i++)
		{
		    System.out.println("Ingrese la estatura "+ (i+1) + ": ");
			double estatura = sc.nextDouble();
			suma_total += estatura;
			if(estatura < 1.6)
		    
			{
			    suma_bajo += estatura;
				cant_bajo ++;
			}
		}
		
		double promedio_total = suma_total/n;
		double promedio_bajo;
		if(cant_bajo > 0)
		{
		    promedio_bajo = suma_bajo/cant_bajo;
		}
		else
		{
		    promedio_bajo = 0;
		}
	}
}
	