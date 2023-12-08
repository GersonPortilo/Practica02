public class Universitario extends Estudiant
{
    public String getCiclo() 
	{
        return ciclo;
    }
    public void setCiclo(String ciclo) 
	{
        this.ciclo = ciclo;
    }
    public String getCarrera() 
	{
        return carrera;
    }
    public void setCarrera(String carrera) 
	{
        this.carrera = carrera;
    }
    private String ciclo , carrera;

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
}