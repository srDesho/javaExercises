package com.cristianml.repositorio;

import com.cristianml.logica.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio{
    private List<Cliente> dataSourcce;

    public ClienteListRepositorio() {
        this.dataSourcce = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSourcce;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for (Cliente cli : dataSourcce) {
            if (cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        dataSourcce.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        dataSourcce.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        return null;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return null;
    }
}
