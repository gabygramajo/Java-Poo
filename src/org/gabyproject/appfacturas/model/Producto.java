package org.gabyproject.appfacturas.model;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private static int ultimoCodigo;

    public Producto() {
        this.codigo = ++ultimoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigo +
                "\t" + nombre +
                "\t" +precio;
    }
}
