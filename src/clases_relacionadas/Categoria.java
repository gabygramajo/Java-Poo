package clases_relacionadas;

public enum Categoria {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Atation Wagon", "Auto grande", 5),
    HATCHBACK("Hatchback", "Auto compacto", 5),
    PICKUP("Pickup", "Camioneta", 4),
    SUV("Suv", "Todo Terreno Deportivo", 4),
    COUPE("Coupé", "Auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 3);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuerta;

    Categoria(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuerta = numeroPuerta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    @Override
    public String toString() {
        return this.nombre +
                ", " + this.descripcion  +
                ", N° Puertas : " + this.numeroPuerta;
    }
}
