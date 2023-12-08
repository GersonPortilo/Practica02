import java.util.Scanner;

public class matriz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam;
        int n;
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        tam = sc.nextInt();
        System.out.print("Ingrese el número del que desea obtener los múltiplos: ");
        n = sc.nextInt();
        
        int[] arreglo = obtenerMultiplos(n, tam);
        
        // Imprimir el arreglo
        System.out.println("Los múltiplos de " + n + " son:");
        for (int i=0; i<arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
    // Función para obtener los múltiplos de un número y almacenarlos en un arreglo
    public static int[] obtenerMultiplos(int n, int tam) {
        int[] arreglo = new int[tam];
        for (int i=1; i<=tam; i++) {
            arreglo[i-1] = n * i;
        }
        return arreglo;
    }
}