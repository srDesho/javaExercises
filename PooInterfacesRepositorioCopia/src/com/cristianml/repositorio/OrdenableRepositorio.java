package com.cristianml.repositorio;

import com.cristianml.logica.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
