import java.util.Scanner;
class actividad1_3
{
    public static void main (String[] args)
	{
	    double cantidad,cantidad1,resultado;
		int opera;
		Scanner informacion = new Scanner (System.in);
		System.out.println("Ingrse la primera cantidad");
		cantidad = informacion.nextDouble();
		System.out.println("Ingrese la segundad cantidad");
		cantidad1 = informacion.nextDouble();
		System.out.println("Ingrese en numero de la operacion que desea realizar");
		System.out.println("1-suma"+" 2-resta"+" 3-multiplicacion"+" 4-divicion");
		opera = informacion.nextInt();
		
		if(opera==1)
		{
		    resultado=(cantidad+cantidad1);
			System.out.println("La suma da como resultado "+resultado);
		}
		if(opera==2)
		{   
		    resultado=(cantidad-cantidad1);
		    System.out.println("La resta da como resultado "+resultado);
		}
		if(opera==3)
		{ 
            resultado=(cantidad*cantidad1);
            System.out.println("La multiplicacion da como resultado "+resultado);
        }
        if(opera==4)
        {
            resultado=(cantidad/cantidad1);
            System.out.println("La divicion da como resultado "+resultado);
        }
	}
}
    		