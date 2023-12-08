import java.util.Scanner;
public class Promedio
{
    public static void main(String[] args)
	{
	    float acum = 1; //Acumulado
		float notas = 0;
		Scanner r = new Scanner(System.in);
	    System.out.println("Ingrese la cantidad de notas a promediar");
		float cn = r.nextFloat(); // cantidad de notas
		
		while(acum <= cn)
		{
		    System.out.println("Ingrese la nota numero: "+acum);
            float n = r.nextFloat();
			notas += n;
            acum++;			
		}
		{
		float promedio = notas / cn;
		System.out.println("El promedio es: "+promedio);
        }
	}
}
		