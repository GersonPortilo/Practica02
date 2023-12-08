import java.util.Scanner;
public class EJ_3
{
	public static void main(String[] args)
	{
		try
		{
			double parcial1;
		    double parcial2;
		    double parcial3;
		    double promedio;
		
		    Scanner registro = new Scanner(System.in);
		    System.out.println("Complete los siguentes datos");
		    System.out.println("Nombre del alumno:");
		    String nombre = registro.next();
		    System.out.println("Ingrese la asignatura:");
		    String asignatura = registro.next();
	
	        while(true)
	        {
		        System.out.println("Ingrese la nota del parcial 1");
		        parcial1= registro.nextDouble();
		        if(parcial1>=0 && parcial1<=10)
		        {
			        break;
		        }
		         System.out.println("Calificacion del primer parcial invalida");	
		         System.out.println("por favor ingresar un valor de cero a diez");
	        }
			
	        while(true)
	        {
		        System.out.println("Ingrese la nota del parcial 2");
		        parcial2= registro.nextDouble();
		        if(parcial2>=0 && parcial2<=10)
		        {
			        break;
		        }
		        System.out.println("Calificacion del segundo parcial invalida");	
		        System.out.println("por favor ingresar un valor de cero a diez");
	        }
			
	        while(true)
	        {
		        System.out.println("Ingrese la nota del parcial 3");
		        parcial3= registro.nextDouble();
		        if(parcial3>=0 && parcial3<=10)
		        {
		        	break;
		        }
		        System.out.println("Calificacion del tercer parcial invalida");	
		        System.out.println("por favor ingresar un valor de cero a diez");
	        }
	
	        promedio=(parcial1+parcial2+parcial3)/3;
		
	            if (promedio>7)
	            {
		            System.out.println("Alumno :"+nombre);
		            System.out.println("promedio:"+promedio);
		            System.out.println("Materia:"+asignatura+" APROBADA");
	            }
                else
	            {
	                System.out.println("Alumno :"+nombre);
		            System.out.println("promedio:"+promedio);
		            System.out.println("Materia:"+asignatura+" REPROBADA");
	            }
		
	    }
		
        catch(Exception e)	
		{
		    System.out.println("ERROR, por favor ingrese los valores que se le piden");
		}
		
        finally
		{
			System.out.println("programa finalizado");
		}
	}
}	
	