public class mainBachiller
{
    public static void main(String[] args) 
    {
        bachiller ba = new bachiller();
        ba.setNombre("Habacuc");
        ba.setApellido("Portillo");
        ba.setGradoCursado("Noveno");
        ba.setTipo("General");
        ba.setEdad(20);
        System.out.printf("nombre: %s %s\nedad: %d\ngrado cursado:%s\ntipo de bachiller:%s\n",ba.getNombre(),
		ba.getApellido(),ba.getEdad(),ba.getGradoCursado(),ba.getTipo());
    }
}