package com.cristianml.repositorio;

import com.cristianml.logica.Cliente;

import java.util.List;

public interface PaginableRepositorio {
     List<Cliente> listar(int desde, int hasta);
}
