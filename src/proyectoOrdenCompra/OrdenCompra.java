package proyectoOrdenCompra;

import java.util.Date;

public class OrdenCompra {
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private int indiceProducto = 0;
    private static int ultimoID;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        identificador = ++OrdenCompra.ultimoID;
        this.productos = new Producto[4];
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProducto() {
        return productos;
    }

    public int getIndiceProducto() {
        return indiceProducto;
    }

    public static int getUltimoID() {
        return ultimoID;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto (Producto[] listaDeProductos) {
        productos = listaDeProductos;
    }

    public void addProducto (Producto producto) {
        if(indiceProducto <= 3) {
            productos[indiceProducto] = producto;
            ++indiceProducto;
        }

    }

    public int granTotal () {
        int total = 0;

        for (Producto producto :
                productos) {
            total += producto.getPrecio();
        }

        return total;
    }

}
