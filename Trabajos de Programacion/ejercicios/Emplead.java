public class Emplead extends Person
{
    private String dui,grado;

    public String getDui() 
	{
        return dui;
    }
    public void setDui(String dui) 
	{
        this.dui = dui;
    }
    public String getGrado() 
	{
        return grado;
    }
    public void setGrado(String grado) 
	{
        this.grado = grado;
    }
    public int getEdad() 
	{
        return edad;
    }
    public void setEdad(int edad) 
	{
        this.edad = edad;
    }
    private int edad;
}