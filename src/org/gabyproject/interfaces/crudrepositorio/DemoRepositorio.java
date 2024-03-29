package org.gabyproject.interfaces.crudrepositorio;

import org.gabyproject.interfaces.crudrepositorio.model.Cliente;
import org.gabyproject.interfaces.crudrepositorio.repositorio.ClienteListRepositorio;
import org.gabyproject.interfaces.crudrepositorio.repositorio.OrdenablePaginableCrudRepositorio;
import org.gabyproject.interfaces.crudrepositorio.repositorio.Direccion;

import java.util.List;

public class DemoRepositorio {
    public static void main(String[] args) {
        OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();

        repo.crear(new Cliente("Jano", "Pérez"));
        repo.crear(new Cliente("Ana", "Gómez"));
        repo.crear(new Cliente("Bea", "González"));
        repo.crear(new Cliente("Carlos", "López"));
        repo.crear(new Cliente("María", "Martínez"));
        repo.crear(new Cliente("Pedro", "Sánchez"));
        repo.crear(new Cliente("Laura", "Fernández"));
        repo.crear(new Cliente("Miguel", "Gutiérrez"));
        repo.crear(new Cliente("Sofía", "Díaz"));
        repo.crear(new Cliente("Alejandro", "Hernández"));
        repo.crear(new Cliente("Lucía", "Ruiz"));
        repo.crear(new Cliente("Gabriel", "Torres"));

        List<Cliente> clientes = repo.listar();
//        clientes.forEach(cliente -> System.out.println(cliente));
        clientes.forEach(System.out::println);

        System.out.println("#### paginable ####");

        List<Cliente> paginable = repo.listar(2, 4);
        paginable.forEach(System.out::println);

        System.out.println("#### ordenar asc ####");

        List<Cliente> clientesOrdenAsc = repo.listar("nombre", Direccion.ASC);
        clientesOrdenAsc.forEach(System.out::println);

        System.out.println("#### ordenar desc ####");

        List<Cliente> clientesOrdenDesc = repo.listar("nombre", Direccion.DESC);
        clientesOrdenDesc.forEach(System.out::println);

        System.out.println("#### editar ####");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(3);
        repo.editar(beaActualizar);
        System.out.println(repo.porId(3));

        System.out.println("#### eliminar ####");
        repo.eliminar(12);
        clientes.forEach(System.out::println);

        System.out.println("#### Total de registros ####");
        System.out.println("Total registros: " + repo.total());
    }
}
