class arreglo1
{
    public static void main (String[] args)
	{
	  // declara un array de enteros.
	  int[] arr;
	  // asignando memoria para 5 enteros.
	  arr = new int[5];
	  
	  // inicializa el primer elemneto del array
	  arr[0] = 10;
	  // inicializa el segundo elemneto del array
	  arr[1] = 20;
	  
	  // y asi...
	  arr[2] = 30;
	  arr[3] = 40;
	  arr[4] = 50;
	  
	  // accediendo a los elemntos del array
	  for (int i = 0; i < arr.length; i++)
	   System.out.println("Elemento en el indice " + i +" : "+ arr[i]);
	}
}