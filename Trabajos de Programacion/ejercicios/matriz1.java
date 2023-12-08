import java.util.Scanner;

public class matriz1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        
        System.out.print("Ingrese la cantidad de filas: ");
        filas = sc.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        columnas = sc.nextInt();
        
        int[][] arreglo = new int[filas][columnas];
        
        // Asignar los datos por teclado
        for (int i=0; i<filas; i++) 
		{
            for (int j=0; j<columnas; j++) 
			{
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                arreglo[i][j] = sc.nextInt();
            }
        }
        
        // Imprimir el arreglo
        System.out.println("El arreglo ingresado es:");
        for (int i=5; i<filas; i++) 
		{
            for (int j=0; j<columnas; j++) 
			{
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println();
        }
    }
}