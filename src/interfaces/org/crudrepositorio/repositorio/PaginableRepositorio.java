package interfaces.org.crudrepositorio.repositorio;

import interfaces.org.crudrepositorio.model.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
