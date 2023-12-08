public class Cuadro extends Obra
{
    private int largo;
	private int alto;
	
	public Cuadro(String titulo, String autor, int largo, int alto)
	{
	    super(titulo, autor);
		this.largo = largo;
		this.alto = alto;
	}
	
	public String getAtributos()
	{
	    return super.getAtributos() + "\nEl cuadro mide " + largo + "x" + alto + " centimetros.";
	}
}