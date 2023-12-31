class Vehiculo {
    int pasajeros;  // número de pasajeros
    int capacidad;  // capacidad del combustible en galones
    int mpg;        // combustible consumido en millas por galón
    
    // Constructor para Vehiculo
    Vehiculo(int p, int c, int m) {
        pasajeros = p;
        capacidad = c;
        mpg = m;
    }
    
    // Retornando el rango
    int rango() {
        return mpg * capacidad;
    }
    
    // Calcular el combustible necesario para una distancia dada
    double capacidadnueva(int miles) {
        return (double) miles / mpg;
    }
}

class constructorp3 {
    public static void main(String[] args) {
        Vehiculo minivan = new Vehiculo(9, 15, 20);
        Vehiculo sportscar = new Vehiculo(10, 25, 30);
        double galones;
        int distancia = 250;
        galones = minivan.capacidadnueva(distancia);
        System.out.println("Para ir a " + distancia + " en minivan, se necesita " + galones + " galones");
        galones = sportscar.capacidadnueva(distancia);
        System.out.println("Para ir a " + distancia + " en sportscar,se necesita " + galones + " galones");
    }
}