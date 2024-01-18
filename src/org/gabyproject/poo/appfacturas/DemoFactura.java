package org.gabyproject.poo.appfacturas;

import org.gabyproject.poo.appfacturas.model.Cliente;
import org.gabyproject.poo.appfacturas.model.Factura;
import org.gabyproject.poo.appfacturas.model.ItemFactura;
import org.gabyproject.poo.appfacturas.model.Producto;

import java.util.Scanner;

public class DemoFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("5544-2");
        cliente.setNombre("Gustavo");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una descripción de la factura: ");
        String desc = sc.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo() + ": ");
            producto.setNombre(sc.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(sc.nextDouble());

            System.out.print("Ingrese la cantidad: ");
            ItemFactura item = new ItemFactura(sc.nextInt(), producto);
            factura.addItemFactura(item);

            System.out.println();
            sc.nextLine(); // para mover el cursor
        }
        sc.close();
        System.out.println(factura);
    }
}
