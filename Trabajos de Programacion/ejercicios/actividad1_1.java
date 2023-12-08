import java.util.Scanner;
class actividad1_1
{
    public static void main (String[] args)
	{
	    int fecha_nac, fecha_act, edad;
		
		Scanner informacion = new Scanner (System.in);
		System.out.println("Ingrese su año de nacimiento");
		fecha_nac = informacion.nextInt();
		System.out.println("Ingrese el año actual");
		fecha_act = informacion.nextInt();
		
		edad = (fecha_act - fecha_nac);
		if (edad>=19)
		{
		    System.out.println("El usuiario es mayor de edad");
		}
        else
		{
		    System.out.println("El usuario es menor de edad");
		}
	}
}
		