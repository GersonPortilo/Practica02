public class mainPublico 
{
    public static void main(String[] args) 
	{
        publico pu = new publico();
        pu.setNombre("Habacuc");
        pu.setApellido("Portillo");
        pu.setGrado("Noveno");
        pu.setDui("06469350-6");
        pu.setEdad(20);
        pu.setNombreInstitucion("institucion publica tal ");
        pu.setArea("Educacion");
        System.out.printf("nombre: %s %s\nedad: %d\ndui:%s\ngrado cursado:%s\narea: %s\nnombre de la institucion:%s\n",
		pu.getNombre(),pu.getApellido(),
		pu.getEdad(),pu.getDui(),pu.getGrado(),pu.getArea(),pu.getNombreInstitucion());
    }
}