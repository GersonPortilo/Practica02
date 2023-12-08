import java.util.Scanner;
class actividad1_2
{
    public static void main (String[] args)
	{
	    double sueldo,nuevo_sueldo,aumento;
		aumento = 0.10;
		
		Scanner informacion = new Scanner (System.in);
		System.out.println("Ingrese el sueldo del empleado ");
		sueldo = informacion.nextDouble();
		
		if(sueldo<=350)
		{
		    nuevo_sueldo = (sueldo*aumento)+sueldo;
			System.out.println("tendra aumento del 10% que es : "+sueldo*aumento);
			System.out.println("su sueldo ahora es de: "+nuevo_sueldo);
		}
		else
		{
		    System.out.println("su sueldo es de: "+sueldo);
			System.out.println("No obtuvo ningun aumento");
		}
	}
}