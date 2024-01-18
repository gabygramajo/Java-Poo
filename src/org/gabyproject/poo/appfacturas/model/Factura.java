package org.gabyproject.poo.appfacturas.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String description;
    private Date fecha;
    private int indiceItems;
    private static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(String description, Cliente cliente) {
        this.description = description;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    // atributo de relación
    private Cliente cliente;
    private ItemFactura[] items;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getFolio() {
        return folio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFecha() {
        //formateamos fecha
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");

        return df.format(this.fecha).toString();
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if(indiceItems < MAX_ITEMS)
            this.items[indiceItems++] = item;
    }

    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < indiceItems; i++)
            total += this.items[i].calcularImporte();

        return  total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N°: ");

        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(this.cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.description)
                .append("\n");

        sb.append("Fecha Emisión: ")
                .append(getFecha())
                .append("\n")
                .append("\n#\tnombre\tPrecio\tCant.\tTotal\n");

        for (int i = 0; i < indiceItems; i++) {
            sb.append(this.items[i])
                    .append("\n");
        }

        sb.append("\nGran Total: $")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
