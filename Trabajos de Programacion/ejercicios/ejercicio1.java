import java.util.Scanner;
public class ejercicio1
{
    public static void main (String[] args)
	{
	    Scanner entrada = new Scanner(System.in);
		int numero;
	do
	{
	    System.out.println("Ingrese un numero");
	    numero = entrada.nextInt();
	}
	while (numero<=500);
	    System.out.println("El numero ingresado es mayor a 500");
	}
}
		
	