import java.util.Scanner;

public class ConversionMedidas 
    {
    public static void main(String[] args)
	    {
		
		//crear objeto scanner para leer datos del usuario
		Scanner sc = new Scanner(System.in);
		
		//solicitar al usuario la cantidad de centimetros a convertir
		System.out.println("Ingrese la cantidad de centimetros a convertir: ");
		double cm = sc.nextDouble();
		
		//convertir centimetros a pulgadas
		double pulgadas = cm / 2.54;
		
		//mostrar resultado de la conversion de centimetros a pulgadas
		System.out.println(cm + "centimetros equivale a " + pulgadas + "pulgadas");
		
		//solicitar al usuario la cantidad de libras a convertir 
		    System.out.println("Ingrese la cantidad de libras a convertir: ");
			double lbs = sc.nextDouble();
			
		//convertir libras a kilogramos 
		double kg = lbs * 0.45359237;
		
		//mostras el resultado de la conversion de libras a kilogramos 
		    System.out.println(lbs + "libras equivale a " + kg + "kilogramos");
		}
	}