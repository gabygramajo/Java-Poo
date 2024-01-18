package org.gabyproject.interfaces.crudrepositorio.repositorio;

// Herencia múltiples de las interfaces para agrupar todas
public interface OrdenablePaginableCrudRepositorio extends OrdenableRepositorio,
        PaginableRepositorio, CrudRepositorio, ContableRepositorio{
}
