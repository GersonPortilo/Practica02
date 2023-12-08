import java.util.Scanner;

public class ejeri1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidadNumeros;
        double sumaNumeros = 0;
        int mayor = 0;
        int menor = 0;
        boolean primerNumero = true;
        
        System.out.print("Ingrese la cantidad de números a leer: ");
        cantidadNumeros = input.nextInt();
        
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            int numero = input.nextInt();
            sumaNumeros += numero;
            
            if (primerNumero) {
                mayor = numero;
                menor = numero;
                primerNumero = false;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }
                
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        
        double media = sumaNumeros / cantidadNumeros;
        
        System.out.println("El mayor número ingresado es: " + mayor);
        System.out.println("El menor número ingresado es: " + menor);
        System.out.println("La media de los números ingresados es: " + media);
    }
}