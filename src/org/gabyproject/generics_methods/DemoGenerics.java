package org.gabyproject.generics_methods;

import org.gabyproject.interfaces.crudrepositorio.model.ClientePremium;
import proyectoOrdenCompra.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoGenerics {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Andrés", "Guzmán"));
        Cliente andres = clientes.get(0);

        Cliente[] clientesArreglo = {new Cliente("Lucy", "Martínez"),
                new Cliente("Andrés", "Guzmán")};

        Integer[] enterosArreglo = {1, 2, 3};

        List<Cliente> clientesList = fromArrayToList(clientesArreglo);
        List<Integer> enterosList = fromArrayToList(enterosArreglo);

        clientesList.forEach(System.out::println);
        enterosList.forEach(System.out::println);

        List<String> nombres = fromArrayToList(
                new String[]{"Andrés", "Pepe", "Luci", "Bea", "John"},
                enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiums = fromArrayToList(
                new ClientePremium[] {
                        new ClientePremium("Paco", "Fernández")
                });

        showCustomer(clientes);
        showCustomer(clientesList);
//        showCustomer(clientesPremiums);

        System.out.println("Máximo de 1, 9 y 4 es: " + max(1, 9, 4));
        System.out.println("Máximo de 3.9, 11.6 y 7.78 es: " + max(3.9, 11.6, 7.78));
        System.out.println("Máximo de zanahoria, arándanos y manzana es: " +
                max("zanahoria", "arándanos" , "manzana"));

        System.out.println("Máximo de \"Uno\", \"Dos\", \"Tres\", \"Cuatro\", \"Cinco\" es: " +
                max("Uno", "Dos", "Tres", "Cuatro", "Cinco"));

        System.out.println("Máximo de 11, 3, 14, 61 y 4 es: " + max(11, 3, 14, 61, 4));
    }

    // No generic method
    public static List<Cliente> fromArrayToList2(Cliente[] c) {
        return Arrays.asList(c);
    }

    // generic method
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // generic method with two parameters
    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G elemento :
                x) {
            System.out.println(elemento);
        }

        return Arrays.asList(c);
    }

    // BOUNDED GENERICS - para limitar genéricos
    // Solo para tipos de datos que extiendan de Number
    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // Solo para tipos de datos que sea o extiendan de Cliente
    public static <T extends Cliente> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // que sea o extiendan de Cliente e implementen la interfaz comparable
//    public static <T extends Cliente & Comparable<T> > List<T> fromArrayToList(T[] c) {
//        return Arrays.asList(c);
//    }

    // WildCard ?
    public static void showCustomer(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0)
            max = b;
        else if (c.compareTo(max) > 0)
            max = c;

        return max;
    }

    public static <T extends Comparable<T>> T max(T... args) {
        T max = args[0];

        for (T arg : args) {
            if (arg.compareTo(max) > 0)
                max = arg;
        }

        return max;
    }
}
