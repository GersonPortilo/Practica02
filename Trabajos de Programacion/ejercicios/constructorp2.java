class vehiculo 
{
    int pasajeros;  //números de pasajeros
    int capacidad;  //capacidad del combustible en galones
    int mpg;        //combustible consumido en miles por galon
    //Esto es un constructor para Vehiculo
    vehiculo (int p, int c, int m) 
	{
        pasajeros=p;
        capacidad=c;
        mpg=m;
    }
     //Retornando el rango
    int rango()
	{
        return (int)capacidad/mpg;
    }
    //Calcular el combustible necesario para una distancia dada
    double capacidadnueva(int miles);
	{
        return (double)miles/mpg;
    }
}
class constructorp2 
{
    public static void main(String[] args) 
	{
        vehiculo miniva = new vehiculo(9,15,20);
        vehiculo sportscar = new vehiculo(10,25,30);
        double galones;
        int distancia = 250;
        galones=miniva.capacidadnueva(distancia);
        System.out.println("Para ir a "+distancia+" en minivan, se necesita "+galones+" galones");
        galones=sportscar.capacidadnueva(distancia);
        System.out.println("Para ir a "+distancia+" en sportscar, se necesita "+galones+" galones");
	}
}
