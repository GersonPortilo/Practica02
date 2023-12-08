import java.util.Scanner;

public class NumerosDescendentes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = input.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}