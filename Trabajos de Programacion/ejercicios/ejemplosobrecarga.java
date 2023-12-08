class sobrecarga
{
    void demoSobrec()
	{
	    System.out.println("Sin parametros\n");
	}
	void demoSobrec(int a)//Sobrecargando demoSobrecpara un parametro int
	{
	    System.out.println("Un parametro: " +a+"\n");
    }
        int demoSobrec(int a, int b)//sobrecargando demoSobrec para dos parametros
    {
        System.out.println("Dos parametros: "+a+", "+b);
        return a+b;
    }
    double demoSobrec(double a, double b)//sobrecargando demoSobrec para dos pari
    {
        System.out.println("Dos parametros tipo double: "+a+", "+b);
        return a+b;	
	}
}
class ejemplosobrecarga
{
    public static void main(String[] args)
	{
	    sobrecarga sc = new sobrecarga();
		int sumaint;
		double sumadouble;
		//Llamando todas las versiones de demoSobrec
		sc.demoSobrec();
		sc.demoSobrec(2);
		sumaint=sc.demoSobrec(4,6);
		System.out.println("Resultado de demoSobrec(4,6) es: "+sumaint+"\n");
		sumadouble=sc.demoSobrec(1.1,2.2);
		System.out.println("Resultado de demoSobrec(1.1,2.2) es: "+sumadouble);
	}
}