public class Bachille extends Estudi
{
    private String gradoCursado, tipo;

    @Override
    public void setEdad(int edad) 
	{
        super.setEdad(edad); 
    }

    @Override
    public int getEdad() 
	{
        return super.getEdad(); 
    }

    @Override
    public void setApellido(String apellido) 
	{
        super.setApellido(apellido);
    }

    @Override
    public String getApellido() {
        return super.getApellido(); 
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); 
    }

    @Override
    public String getNombre() 
	{
        return super.getNombre(); 
    }
    public String getGradoCursado() 
	{
        return gradoCursado;
    }
    public void setGradoCursado(String gradoCursado) 
	{
        this.gradoCursado = gradoCursado;
    }
    public String getTipo() 
	{
        return tipo;
    }
    public void setTipo(String tipo) 
	{
        this.tipo = tipo;
    }
}