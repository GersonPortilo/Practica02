public class Publico extends Emplead
{
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
    public void setGrado(String grado) 
	{
        super.setGrado(grado); 
    }

    @Override
    public String getGrado() 
	{
        return super.getGrado(); 
    }

    @Override
    public void setDui(String dui) 
	{
        super.setDui(dui);
    }

    @Override
    public String getDui() 
	{
        return super.getDui(); 
    }

    @Override
    public void setApellido(String apellido) 
	{
        super.setApellido(apellido);
    }

    @Override
    public String getApellido() 
	{
        return super.getApellido(); 
    }

    @Override
    public void setNombre(String nombre) 
	{
        super.setNombre(nombre); 
    }

    @Override
    public String getNombre() 
	{
        return super.getNombre();
    }
    private String area,nombreInstitucion;

    public String getArea() 
	{
        return area;
    }
    public void setArea(String area) 
	{
        this.area = area;
    }
    public String getNombreInstitucion() 
	{
        return nombreInstitucion;
    }
    public void setNombreInstitucion(String nombreInstitucion) 
	{
        this.nombreInstitucion = nombreInstitucion;
    }
}
