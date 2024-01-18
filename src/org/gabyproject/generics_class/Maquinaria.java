package org.gabyproject.generics_class;

public class Maquinaria {
    private String tipo;

    public Maquinaria(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return this.tipo;
    }
}
