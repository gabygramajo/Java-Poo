package clases_relacionadas;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMENINO("Femenino");

    private final String sexo;

    Sexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return sexo;
    }
}
