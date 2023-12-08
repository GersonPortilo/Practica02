public class Obra
{
    private String titulo;
	private String autor;
	public Obra(String titulo, String autor)
	{
	    this.titulo = titulo;
		this.autor = autor;
	}
	public void setTitulo(String titulo)
	{
	    this.titulo = titulo;
	}
	public void setAutor(String autor)
	{
	    this.autor = autor;
	}
	public String getAtributos()
	{
        return "El autor de \"" + titulo + "\" es " + autor + ".";
	}
}