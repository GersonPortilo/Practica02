import java.util.Random;

public class Notas 
{
    public static void main(String[] args) 
	{
        Random r = new Random();
        int nota1 = r.nextInt(10) + 1;
        int nota2 = r.nextInt(10) + 1;
        int nota3 = r.nextInt(10) + 1;
        double promedio = (nota1 + nota2 + nota3) / 3.0;
        
        System.out.println("Notas del estudiante 1: " + nota1);
        System.out.println("Notas del estudiante 2: " + nota2);
        System.out.println("Notas del estudiante 3: " + nota3);
        System.out.println("Promedio final: " + promedio);
    }
}