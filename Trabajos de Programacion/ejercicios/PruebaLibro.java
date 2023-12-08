import java.util.Scanner;
public class PruebaLibro
{
    public static void main(String[] args)
	{
	    String tituloDelLibro;
		String autorDelLibro;
		int numeroDePaginas;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el titulo del libro: ");
		tituloDelLibro = teclado.nextLine();
		
		System.out.print("Introduzca el autor del libro: ");
		autorDelLibro = teclado.nextLine();
		
		System.out.print("Introduzca el numero de paginas del libro: ");
		numeroDePaginas = teclado.nextInt();
		
		Libro libro1 = new Libro(tituloDelLibro, autorDelLibro, numeroDePaginas);
		
		System.out.printf(libro1.getAtributos());
	}
}	 
//Gerson Habacuc Umaña Portillo