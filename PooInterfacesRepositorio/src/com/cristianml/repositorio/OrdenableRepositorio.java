package com.cristianml.repositorio;

import com.cristianml.logica.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    // Hacemos una sobrecarga de métodos
    List<Cliente> listar(String campo, Direccion dir);
}
