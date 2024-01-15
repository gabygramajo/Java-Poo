package interfaces.org.crudrepositorio.repositorio;

import interfaces.org.crudrepositorio.model.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);

}
