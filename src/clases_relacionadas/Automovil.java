package clases_relacionadas;

public class Automovil implements Comparable <Automovil> {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas = new Rueda[5];

    private Categoria tipo;

    static  String colorPatente = "Naranja";
    private static int ultimoId;

    public static final Integer VELOLIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOLIDAD_MAX_CIUDAD = 60;

    public Automovil() {

    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Categoria tipo) {
        this(fabricante, modelo, color, motor);
        this.tipo = tipo;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Categoria tipo, Estanque estanque) {
        this(fabricante, modelo, color, motor, tipo);
        this.estanque = estanque;
    }


    public Automovil(String fabricante, String modelo, Color color, Motor motor, Categoria tipo, Estanque estanque, Persona conductor) {
        this(fabricante, modelo, color, motor, tipo, estanque);
        this.conductor = conductor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Categoria tipo, Estanque estanque, Persona conductor, Rueda rueda) {
        this(fabricante, modelo, color, motor, tipo, estanque, conductor);
        setRuedas(rueda);
    }

    public int getId() {
        return id;
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda getRuedas() {
        return ruedas[0];
    }

    public void setRuedas(Rueda rueda) {
        agregarRuedas(rueda);
    }

    public Categoria getCategoria() {
        return tipo;
    }

    public void setCategoria(Categoria tipo) {
        this.tipo = tipo;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Automovil.ultimoId = ultimoId;
    }

    private void agregarRuedas(Rueda rueda) {
        for (int i = 0; i < 5; i++) {
            this.ruedas[i] = rueda;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof clases_y_objetos.Automovil))
            return false;

        clases_y_objetos.Automovil a = (clases_y_objetos.Automovil) obj;

        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    public String descripcionConductor() {
        return fabricante + " " + modelo + " - " +
                conductor.nombreCompleto() + ", " + conductor.getEdad() + " años.";
    }

    @Override
    public String toString() {
        return "\nCONDUCTOR\n\t" + conductor + "." +
                "\nCARACTERÍSTICAS\n\tFabricante: " + fabricante + "." +
                "\n\tModelo : " + modelo + "." +
                "\n\tCategoría : " + tipo + "." +
                "\n\tColor : " + color  + "." +
                "\n\tMotor : " + motor + "." +
                "\n\tCapacidad estanque : " + estanque + "." +
                "\n\tRuedas : " + ruedas[0] + ".";

    }

    @Override
    public int compareTo(Automovil o) {
        int edad = Integer.toString(conductor.getEdad())
                .compareTo(Integer.toString(o.conductor.getEdad()));

        if( edad == 0)
            return conductor.getNombre().compareTo(o.conductor.getNombre());

        return edad;
    }
}
