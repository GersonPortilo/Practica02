public class mainUniversitario
{
    public static void main(String[] args) 
	{
        universitario uni = new universitario();
        uni.setNombre("Habacuc");
        uni.setApellido("Portillo");
        uni.setCarrera("Ingenieria");
        uni.setCiclo("3");
        uni.setEdad(20);
        System.out.printf("nombre: %s %s\nedad: %d\nciclo: %s\ncarrera: %s\n",uni.getNombre(),
		uni.getApellido(),uni.getEdad(),uni.getCiclo(),uni.getCarrera());
    }
}