class vehiculo
{
    int pasajeros;
	int capacidad;
	int mpg;
}
   
class ejemplo2
{
    public static void main(String[] args)
	{
	    vehiculo auto1 = new vehiculo();
		vehiculo auto2 = auto1;
		
		auto1.mpg = 50;
		System.out.println(auto1.mpg);
		System.out.println(auto2.mpg);
		
		vehiculo auto2 = new vehiculo();
		vehiculo auto3 = auto2;
		
		
	}
}
