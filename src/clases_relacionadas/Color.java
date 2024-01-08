package clases_relacionadas;

public enum Color {
    BLANCO("blanco"),
    NEGRO("negro"),
    ROJO("rojo"),
    AMARILLO("amarillo"),
    AZUL("azul"),
    GRIS("gris"),
    NARANJA("naranja");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // para no tener que utilizar el getColor
    @Override
    public String toString() {
        return this.color;
    }
}

