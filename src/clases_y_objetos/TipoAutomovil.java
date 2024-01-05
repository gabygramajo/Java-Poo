package clases_y_objetos;

public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Atation Wagon", "Auto grande", 4),
    HATCHBACK("Hatchback", "Auto compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupé", "Auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 4);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuerta;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
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
        return "nombre='" + this.nombre + '\'' +
                ", descripcion='" + this.descripcion + '\'' +
                ", numeroPuerta=" + this.numeroPuerta;
    }
}
