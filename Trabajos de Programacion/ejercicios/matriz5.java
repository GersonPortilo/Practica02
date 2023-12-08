public class matriz5 {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        
        int[][] b = {{5,6},{7,8}};
        
        int[][] c = sumarMatrices(a, b);
        
        // Imprimir la matriz c
        for (int i=0; i<c.length; i++) {
            for (int j=0; j<c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // sumar dos matrices 
    public static int[][] sumarMatrices(int[][] a, int[][] b) {
        int filas = a.length;
        int columnas = a[0].length;
        int[][] c = new int[filas][columnas];
        
        for (int i=0; i<filas; i++) {
            for (int j=0; j<columnas; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        
        return c;
    }
}