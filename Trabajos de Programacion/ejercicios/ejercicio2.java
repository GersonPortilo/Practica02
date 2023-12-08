import java.util.*;
public class ejercicio2
{
	public static void main (String[] args)
	{
		double numero, acumulador = 0;
		int i = 0;
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.println("Ingrese un numero");
			numero = s.nextDouble();
			acumulador=acumulador+numero;
			i++;
		}
		while(i<10);
		System.out.println("La suma es = "+acumulador);
	}
}
