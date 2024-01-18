package org.gabyproject.interfaces.crudrepositorio.repositorio;

import org.gabyproject.interfaces.crudrepositorio.model.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
