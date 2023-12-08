import java.util.Scanner;
 public class Empleado
 {
	private Scanner teclado;
	private String nombre;
	private int sueldo;
	
	public Empleado()
	{
		teclado=new Scanner(System.in);
		System.out.print("Ingrese nombre:");
		nombre=teclado.next();
		System.out.print("Ingrese el sueldo:");
		sueldo=teclado.nextInt();
	}
	public void imprimir()
	{
	System.out.println("Nombre:"+nombre);
	System.out.println("sueldo:"+sueldo);
	}
	public void esMayorEdad()
	{
		if (sueldo<=3000) {
			System.out.print(nombre+" No debe pagar impuestos.");
		}else {
				System.out.print(nombre+" Si debe pagar impuestos.");
		}
	}
	
	public static void main(String[] args)
	{
		Empleado empleado1=new Empleado();
		empleado1.imprimir();
		empleado1.esMayorEdad();
	}
 }