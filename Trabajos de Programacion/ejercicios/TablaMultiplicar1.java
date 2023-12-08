import java.util.Scanner;

public class TablaMultiplicar1 {
    private int tabla;
    private int cantidadterminos;

    // Constructor que toma un entero indicando qué tabla queremos ver
    public TablaMultiplicar1(int tabla) {
        this.tabla = tabla;
        this.cantidadTerminos = 10;
    }

    // Constructor que toma dos enteros indicando la primera tabla y la cantidad de términos a mostrar
    public TablaMultiplicar1(int primeraTabla, int cantidadTerminos) {
        this.tabla = primeraTabla;
        this.cantidadTerminos = cantidadTerminos > 0 ? cantidadTerminos : 10;
    }

    // Método para imprimir la tabla de multiplicar
    public void imprimirTabla() {
        System.out.println("Tabla de multiplicar del " + tabla);
        for (int i = 1; i <= cantidadTerminos; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la tabla que desea ver: ");
        int tabla = teclado.nextInt();
        TablaMultiplicar1 tabla1= new TablaMultiplicar1(tabla);
        tabla1.imprimirTabla();

        System.out.print("Ingrese la primera tabla que desea ver: ");
        int primeraTabla = teclado.nextInt();
        System.out.print("Ingrese la cantidad de términos a mostrar: ");
        int cantidadTerminos = teclado.nextInt();
        TablaMultiplicar1 tabla2 = new TablaMultiplicar1(primeraTabla, cantidadTerminos);
        tabla2.imprimirTabla();
    }
}