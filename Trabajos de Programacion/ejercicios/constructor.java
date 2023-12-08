// Un ejemplo simple de constructor
class Miclase
{
	Miclase(int i)
	{
	    x=i;
	}
}
class constructorDemo
{
    public static void main(String[] args)
	{
	    Miclase t1= new Miclase(15);
		Miclase t2= new Miclase(28);
	    System.out.println(t1.x + " - "+t2.x);
	}
}