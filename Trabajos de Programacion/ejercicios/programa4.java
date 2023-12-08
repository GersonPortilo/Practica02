import java.util.Random;

public class Programa4 {
    public static void main(String[] args) {
        // aqui hacemos la matriz 5 x 6 como nos indica en el parcial
        int[][] matriz = new int[5][6];
        Random aleatorio = new Random();

        // aqui almacenamos la matriz con numeros menores o iguales a 10
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = aleatorio.nextInt(10) + 1;
            }
        }

        // Con esto mostramos los elementos de la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // sumamos los elementos de la matriz como nos indica en el parcial
        int sumaTotal = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("La suma total de los números en la matriz es: " + sumaTotal);

        // aqui solo sumamos todos los numeros pares de la matriz
        int sumaPares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (matriz[i][j] % 2 == 0) {
                    sumaPares += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de los números pares en la matriz es: " + sumaPares);

        // aqui solo sume los numeros impares de la matriz
        int sumaImpares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (matriz[i][j] % 2 != 0) {
                    sumaImpares += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de los números impares en la matriz es: " + sumaImpares);
    }
}