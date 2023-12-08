import java.util.Scanner;
class actividad1_4
{
    public static void main (String[] args)
	{
	    String producto;
		double iva = 0.13,iva_total,precio,cantidad;
		double descuento, total_a_pagar,total_a_pagar2;
		Scanner lectura = new Scanner (System.in);
		
		System.out.println("Bienvenido");
		System.out.println("Ingrese el nombre del producto");
		producto = lectura.nextLine();
		System.out.println("Ingrese el precio del producto");
		precio = lectura.nextDouble();
		System.out.println("Ingrese cauntas unidades lleva");
		cantidad = lectura.nextDouble();
		
		iva_total = (precio*cantidad)*iva;
		total_a_pagar = iva_total+(precio*cantidad);
		
		if(total_a_pagar>50)
		{
		    descuento = (total_a_pagar*0.05);
			total_a_pagar2 = (total_a_pagar-descuento);
			
		System.out.println("El IVA = "+iva_total);
		System.out.println("Precio bruto"+total_a_pagar);
		System.out.println("El precio final + descuento del 5% = "+total_a_pagar2);
		
		}
		else
		{
		System.out.println("El IVA = "+iva_total);
		System.out.println("Precio bruto "+total_a_pagar);
		}
	}
}
		
		