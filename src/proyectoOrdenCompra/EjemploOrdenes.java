package proyectoOrdenCompra;

public class EjemploOrdenes {
    public static void main(String[] args) {

        System.out.println("----- Orden de compra 1 -----");
        OrdenCompra ordenCompra = new OrdenCompra("Orden de compra: par Zapatillas, una Remera, Una gorra y un Jeans");
        ordenCompra.setCliente(new Cliente("Lucas", "Guzmán"));

        ordenCompra.addProducto(new Producto("Adidas", "Jordan", 45000));
        ordenCompra.addProducto(new Producto("Dublin", "Oversize", 16000));
        ordenCompra.addProducto(new Producto("Vans", "Snapback", 9000));
        ordenCompra.addProducto(new Producto("Levi's", "Jeans Chupin", 18000));

        System.out.println("CLIENTE: " + ordenCompra.getCliente());
        for (Producto producto :
                ordenCompra.getProducto()) {
            System.out.println(producto);
        }

        System.out.println("Gran Total = $" + ordenCompra.granTotal());

        System.out.println("----- Orden de compra 2 -----");
        OrdenCompra ordenCompra2 = new OrdenCompra("Orden de compra: par Zapatillas, una Remera, Una Gafas y un Short");
        ordenCompra2.setCliente(new Cliente("Miguel", "Dominguez"));


        ordenCompra2.addProducto(new Producto("Adidas", "Urban", 35000));
        ordenCompra2.addProducto(new Producto("Adidas", "Playera", 10000));
        ordenCompra2.addProducto(new Producto("Gafas", "Gafas de Sol", 5000));
        ordenCompra2.addProducto(new Producto("Levi's", "Short", 10000));

        System.out.println("CLIENTE: " + ordenCompra2.getCliente());
        for (Producto producto :
                ordenCompra2.getProducto()) {
            System.out.println(producto);
        }

        System.out.println("Gran Total = $" + ordenCompra2.granTotal());

        System.out.println("----- Orden de compra 3 -----");
        OrdenCompra ordenCompra3 = new OrdenCompra("Orden de compra: Yogur, Pan, Mayonesa, Aceite");
        ordenCompra3.setCliente(new Cliente("Analía", "Elías"));


        ordenCompra3.addProducto(new Producto("Serenisima", "Yogur de Frutilla", 1500));
        ordenCompra3.addProducto(new Producto("Bimbo", "Pan lactal", 4000));
        ordenCompra3.addProducto(new Producto("Hellmann's", "Mayonesa Clásica", 1000));
        ordenCompra3.addProducto(new Producto("Cocinero", "Aceite de Girasol", 3000));

        System.out.println("CLIENTE: " + ordenCompra3.getCliente());
        for (Producto producto :
                ordenCompra3.getProducto()) {
            System.out.println(producto);
        }

        System.out.println("Gran Total = $" + ordenCompra3.granTotal());

        System.out.println("\nTOTAL DE ORDENES DE COMPRAS: " + OrdenCompra.getUltimoID());

    }
}
