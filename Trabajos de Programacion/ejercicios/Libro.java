public class Libro extends Obra
{
    private int numeroDePaginas;
	
	public Libro(String titulo, String autor, int numeroDePaginas)
	{
	    super(titulo, autor);
		this.numeroDePaginas = numeroDePaginas;
	}
	public String getAtributos()
	{
	    return super.getAtributos() + "\nEl libro tiene " + numeroDePaginas + " Paginas.";
	}
}	