public class b1_array
{
    public static void main (String args[])
	{ 
	    // declarar e inicializar array 4D
		int b[][] = {{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
		
		// imprimir array 4D
		for (int i=0; i<b.length; i++)
		{
			for (int j=0; j<b[i].length; j++)
		     System.out.println(b[i][j] + " ");
		     
			System.out.println();
		}
	}
}
