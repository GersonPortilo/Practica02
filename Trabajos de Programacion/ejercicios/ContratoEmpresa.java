import java.util.Scanner;

public class ContratoEmpresa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String grado;
        int edad;
        
        System.out.println("Bienvenido a nuestra empresa");
        
        while (true) {
            System.out.print("Ingrese su nombre: ");
            nombre = sc.nextLine();
            System.out.print("Ingrese su grado de estudios (preparatoria, licenciado o ingeniero): ");
            grado = sc.nextLine();
            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();
            
            if (edad >= 19) {
                break;
            } else {
                System.out.println("No podemos contratarlo hasta que cumpla 18 años.");
            }
            
            sc.nextLine();
        }
        
        if (grado.equalsIgnoreCase("preparatoria")) {
            System.out.println("Usted " + nombre + ", ha sido contratado/a en el área de producción.");
        } else if (grado.equalsIgnoreCase("licenciado") || grado.equalsIgnoreCase("ingeniero")) {
            System.out.println("Usted " + nombre + ", ha sido contratado/a en el área administrativa.");
        } else {
            System.out.println("Grado de estudios no válido. Por favor, intente nuevamente.");
            return;
        }
        
        System.out.println("Bienvenido a la empresa");
        
        sc.close();
    }
}