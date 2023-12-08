class arreglo2
{
    public static void main (String[] args)
	{
	  // declara un array de enteros.
	  String[] arr;
	  // asignando memoria para 5 enteros.
	  arr = new String[5];
	  
	  // inicializa el primer elemneto del array
	  arr[0] = "Gerson";
	  // inicializa el segundo elemneto del array
	  arr[1] = "Mateo";
	  
	  // y asi...
	  arr[2] = "Habacuc";
	  arr[3] = "Juan";
	  arr[4] = "Daniel";
	  
	  // accediendo a los elemntos del array
	  for (int i = 0; i < arr.length; i++)
	   System.out.println("Elemento en el indice " + i +" : "+ arr[i]);
	}
}