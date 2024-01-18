package org.gabyproject.interfaces.crudrepositorio.repositorio;

import org.gabyproject.interfaces.crudrepositorio.model.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);

}
