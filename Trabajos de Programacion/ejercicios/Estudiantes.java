
import java.util.Scanner;

public class Estudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear dos actividades y nota de parcial por periodo
        Actividad actividad1 = new Actividad("Tarea 1", 10);
        Actividad actividad2 = new Actividad("Examen 1", 20);

        // Crear al menos 5 estudiantes
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", "Matemáticas");
        Estudiante estudiante2 = new Estudiante("Maria", "Gomez", "Matemáticas");
        Estudiante estudiante3 = new Estudiante("Pedro", "Rodriguez", "Física");
        Estudiante estudiante4 = new Estudiante("Laura", "Hernandez", "Física");
        Estudiante estudiante5 = new Estudiante("Carlos", "Garcia", "Química");

        // Pedir las notas de cada estudiante para cada actividad
        pedirNotas(actividad1, actividad2, estudiante1, scanner);
        pedirNotas(actividad1, actividad2, estudiante2, scanner);
        pedirNotas(actividad1, actividad2, estudiante3, scanner);
        pedirNotas(actividad1, actividad2, estudiante4, scanner);
        pedirNotas(actividad1, actividad2, estudiante5, scanner);

        // Imprimir los resultados
        System.out.println("Resultados finales:");
        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());
        System.out.println(estudiante4.toString());
        System.out.println(estudiante5.toString());
    }

    public static void pedirNotas(Actividad actividad1, Actividad actividad2, Estudiante estudiante, Scanner scanner) {
        System.out.println("Ingresa la nota de " + actividad1.getNombre() + " para " + estudiante.getNombre() + ":");
        double nota1 = scanner.nextDouble();
        System.out.println("Ingresa la nota de " + actividad2.getNombre() + " para " + estudiante.getNombre() + ":");
        double nota2 = scanner.nextDouble();
        estudiante.agregarNota(actividad1, nota1);
        estudiante.agregarNota(actividad2, nota2);
    }
}

class Estudiante {
    private String nombre;
    private String apellido;
    private String materia;
    private Nota[] notas = new Nota[2];

    public Estudiante(String nombre, String apellido, String materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMateria() {
        return materia;
    }

    public void agregarNota(Actividad actividad, double nota) {
        if (actividad.getNombre().equals("Tarea 1")) {
            notas[0] = new Nota(actividad, nota);
        } else if (actividad.getNombre().equals("Examen 1")) {
            notas[1] = new Nota(actividad, nota);
        }
    }

    public double calcularPromedio() {
        double suma = 0;
        for (Nota nota : notas) {
            suma += nota.getNota();
        }
        return suma / notas.length;
    }

    public String toString() {
        return nombre + " " + apellido + " (" + materia + "): " + "Tarea 1: " + notas[0].getNota() + " / Examen 1: " + notas[1].getNota() + " / Promedio: " + calcularPromedio();
    }
}

class Actividad {
    private String nombre;
    private int puntajeTotal;

    public Actividad(String nombre, int puntajeTotal) {
        this.nombre = nombre;
        this.puntajeTotal = puntajeTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }
}

class Nota {
    private Actividad actividad;
    private double nota;

    public Nota(Actividad actividad, double nota) {
        this.actividad = actividad;
        this.nota = nota;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public double getNota() {
        return nota;
    }
}