package clases_y_objetos;

public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private double cilindrada;
    private int capacidadEstanque = 40;

    private TipoAutomovil tipo;

    static  String colorPatente = "Naranja";
    private static int ultimoId;

    public static final Integer VELOLIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOLIDAD_MAX_CIUDAD = 60;

    public Automovil(String fabricante, TipoAutomovil tipo, String modelo, Color color, double cilindrada) {
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.id = ++ultimoId;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getId() {
        return id;
    }


    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(int rpm) {
        return "el auto " + this.fabricante + " frenando.";
    }

    public float calcularConsumo(int km, float procentajeBencina) {
        return km / (this.capacidadEstanque * procentajeBencina);
    }

    public float calcularConsumo(int km, int procentajeBencina) {
        return km / (this.capacidadEstanque * (procentajeBencina / 100f));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Automovil))
            return false;

        Automovil a = (Automovil) obj;

        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "fabricante = '" + fabricante + '\'' +
                ",tipo = '" + tipo + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", color = '" + color + '\'' +
                ", cilindrada = " + cilindrada;
    }
}
