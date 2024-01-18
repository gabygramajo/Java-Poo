package org.gabyproject.interfaces.crudrepositorio.repositorio;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
