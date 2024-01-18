package org.gabyproject.interfaces.crudrepositorio.repositorio;

import org.gabyproject.interfaces.crudrepositorio.model.Cliente;

import java.util.List;

public interface CrudRepositorio {

    List<Cliente> listar();

    Cliente porId(Integer id);

    void crear(Cliente cliente);

    void editar(Cliente cliente);

    void eliminar(Integer id);

}
