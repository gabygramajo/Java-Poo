package org.gabyproject.interfaces.crudrepositorio.repositorio;

// Herencia múltiples de las interfaces para agrupar todas
public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,
        PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio{
}
