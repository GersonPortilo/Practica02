import java.util.Scanner;
class arreglo3
{
    public static void main (String[] args)
	{
	   Scanner capture = new Scanner(System.in);
	   
	   System.out.println("Cuantos nombres desea ingresar");
	   int a=capture.nextInt();
	   
	  // declara un array de enteros.
	  String[] arr;
	  // asignando memoria para 5 enteros.
	  arr = new String[a];
	  
	  for (int i = 0; i < arr.length; i++)
	  {
		System.out.println("Por favor ingrese un nombre");
		arr[i]=capture.nextLine();
	  }
	  // accediendo a los elemntos del array
	  for (int i = 0; i < arr.length; i++)
	   System.out.println("Elemento en el indice " + i +" : "+ arr[i]);
	}
}