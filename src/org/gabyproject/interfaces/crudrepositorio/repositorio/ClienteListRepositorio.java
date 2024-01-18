package org.gabyproject.interfaces.crudrepositorio.repositorio;

import org.gabyproject.interfaces.crudrepositorio.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;

        for ( Cliente cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }

        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente cliente = this.porId(id);
        this.dataSource.remove(cliente);
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        // para no modificar de forma directa el dataSource creamos otro arreglo a partir de los datos de esta
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);

        // Clase anónima
        listaOrdenada.sort(( a,  b) -> {
                /*
                 * usamos la exp. Lamda, ya que al ser un solo método, se asume q es el compare.
                 * */
                int resultado = 0;

                if (dir == Direccion.ASC) {
                    resultado = ordanar(a, b, campo);
                } else if (dir == Direccion.DESC) {
                    resultado = ordanar(b, a, campo);
                }
                return resultado;
            });

        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    public static int ordanar(Cliente a, Cliente b, String campo) {
        int resultado = 0;
        switch (campo) {
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                    resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
                    resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
