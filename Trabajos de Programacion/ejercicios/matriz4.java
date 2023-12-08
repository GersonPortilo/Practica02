public class matriz4 
{
    public static void main(String[] args) 
	{
        int[][] arreglo = new int[8][10];
        
        // Inicializar el arreglo con ceros
        for (int i=0; i<arreglo.length; i++) 
		{
            for (int j=0; j<arreglo[i].length; j++) 
			{
                arreglo[i][j] = 0;
            }
        }
        
        // Imprimir el arreglo
        for (int i=0; i<arreglo.length; i++) 
		{
            for (int j=0; j<arreglo[i].length; j++) 
			{
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println();
        }
    }
}