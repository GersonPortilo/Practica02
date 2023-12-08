public class TablaMultiplicar {
    private int tabla;
    private int terminos;

    public TablaMultiplicar(int tabla) {
        this(tabla, 10);
    }

    public TablaMultiplicar(int tabla, int terminos) {
        this.tabla = tabla;
        this.terminos = terminos;
    }

    public void mostrarTabla() {
        for (int i = 1; i <= terminos; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
    }
}