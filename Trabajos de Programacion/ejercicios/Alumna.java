public class Alumna extends Persona
{
   
    private String Materia;
	public String Nombre = "Felipe";
    public String getMateria()
	{
	    return Materia;
	}
	public void setMateria(String Materia)
	{
	    this.Materia = Materia;
	}
	public static void main(String[] args)
	{
	    Alumna a= new Alumna();
		a.setNombre("Gerson Habacuc Portillo");
		a.setDui("06469350-6");
		a.setMateria("Programacion I");
		Nombre = "Felipe";
		
		System.out.println("El estudiante "+a.getNombre());
		System.out.println("Esta incrito en la materia "+a.getMateria());
	}
}
		