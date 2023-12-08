import java.util.Scanner;
public class eje2
{
    public static void main (String[] args)
	{
		Scanner entrada = new Scanner(System.in);
	    int calculadora = 0;
		int suma = 0;
		int acumulador = 0;
		
		do
		{
			System.out.println("ingrese un numero");
		    numero = entrada.nextInt();
			suma += numero;
			calculadora++;
			
        }
        while(calculadora<10);
		 
		System.out.println("la suma de los numeros da "+suma);
		
    }
}	