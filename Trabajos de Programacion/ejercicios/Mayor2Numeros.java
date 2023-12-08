import java.util.Scanner;
public class Mayor2Numeros
{
    public static void main(String[] args)
	{   
	    Scanner scn = new Scanner(System.in);
        
        System.out.println("Ingresar primer numero:");
		int numero1=scn.nextInt();
		System.out.println("Ingresar segundo numero:");
        int numero2=scn.nextInt();
		
		if(numero1==numero2)
		{
		    System.out.println("Son Iguales");
        }
        else if(numero1>numero2)
        {
            System.out.println("El numero mayor es: "+numero1);
		}
        else
        {
		    System.out.println("El numero mayor es: "+numero2);
        }
    }
}	