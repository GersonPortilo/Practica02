import java.util.Scanner;
public class AlumnoEje
{
    private Scanner teclado;
	private String nombre;
	private int edad;
	
	public AlumnoEje()
	{
	    teclado=new Scanner(System.in);
		System.out.print("Ingrese nombre");
		nombre=teclado.next();
		System.out.print("Ingrese edad");
		edad=teclado.nextInt();
	}
	public void imprimir()
	{
	    System.out.println("Nombre:"+nombre);
		System.out.println("Edad:"+edad);
	}
	public void esMayorEdad()
	{
	    if (edad>=18) {
		    System.out.print(nombre+" es mayor de edad.");
		} else {
		    System.out.print(nombre+" no es mayor de edad.");
        }
	{
	
	public static void main(String[] args)
	{
	    AlumnoEje alumno1=new AlumnoEje();
		alumno1.imprimir();
		alumno1.esMayorEdad();
	}
}