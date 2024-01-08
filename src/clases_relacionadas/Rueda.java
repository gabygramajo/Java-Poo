package clases_relacionadas;

public class Rueda {
    private String fabricante;
    private int aro;
    private double ancho;

    public Rueda(String fabricante, int aro, double ancho) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAro() {
        return aro;
    }

    public double getAncho() {
        return ancho;
    }

    @Override
    public String toString() {
        return "fabricante='" + fabricante + '\'' +
                ", aro=" + aro +
                ", ancho=" + ancho;
    }
}
