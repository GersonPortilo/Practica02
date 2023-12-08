import java.util.Scanner;

public class ejemplo3
{
    public static void main(String[] args)
	{
	    Scanner lectura = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		String nombre = lectura.next();
		System.out.println("Ingrese su edad: ");
		int edad = lectura.nextInt();
		System.out.println("Su nombre es: "+nombre+" y su edad es: "+edad+" años ");
	}//cierre del metodo
}// cierre de la clase