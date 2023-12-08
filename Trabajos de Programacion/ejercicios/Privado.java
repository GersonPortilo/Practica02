public class Privado extends Emplead
{
    private String nombreEmpresa, sector, clasificacion;

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
    public String getGrado() {
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

    public String getNombreEmpresa() 
	{
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) 
	{
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getSector() 
	{
        return sector;
    }

    public void setSector(String sector) 
	{
        this.sector = sector;
    }

    public String getClasificacion() 
	{
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) 
	{
        this.clasificacion = clasificacion;
    }
}