// Programa java para ilustrar el error
// con modificador private
class A {
    public void mostrar()
	{
	    System.out.println("java            ");
	}
}
class B
{
    public static void main(String[] args)
	{
	    A obj = new A();
		// tratando de acceder al metodo private de otra clase
		obj.mostrar();
	}
}