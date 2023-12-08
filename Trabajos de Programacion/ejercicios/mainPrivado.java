public class mainPrivado 
{
    
    public static void main(String[] args) 
	{
        privado pri = new privado();
        pri.setNombre("Habacuc");
        pri.setApellido("Portillo");
        pri.setGrado("Noveno");
        pri.setDui("06469350-6");
        pri.setEdad(20);
        pri.setNombreEmpresa("Boquitas Diana ");
        pri.setSector("servicios");
        pri.setClasificacion("grande");
        System.out.printf("nombre: %s %s \ndui: %s \nedad: %d\ngrado: %s\nnombre de la empresa: %s
		\nsector empresarial: %s
		\nclasificacion de empresa:%s\n",
		pri.getNombre(),pri.getApellido(),pri.getDui(),pri.getEdad(),pri.getGrado(),
		pri.getNombreEmpresa(),pri.getSector(),pri.getClasificacion());        
    }
}