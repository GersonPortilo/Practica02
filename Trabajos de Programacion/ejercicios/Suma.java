import java.util.*;

public class Suma
{
public static void main(String[] args)
    {	
	Scanner s = new Scanner(System.in);
	int x;
	do
	{
		System.out.println("Ingrese dos numeros por favor");
		int a = s.nextInt();
		int b = s.nextInt();
		int n = a+b;
		System.out.println("la suma es "+n);
		System.out.println("Desea realizar otra suma?");
		System.out.println("si=1, no=2");
		x = s.nextInt();
	}
	while(x==1);
	

    }
}