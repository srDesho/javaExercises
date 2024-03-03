package com.cristianml.repositorio;

import com.cristianml.logica.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements FullCrudRepositorio{
    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        dataSource = new ArrayList<>();
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }

    @Override
    public List<Cliente> listar() {
        return this.dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente cli = null;
        for (Cliente cliente : dataSource) {
            if (cliente.getId() != null && (cliente.getId()).equals(id)) {
                cli = cliente;
                break;
            }
        }
        return cli;
    }

    @Override
    public void crear(Cliente cliente) {
        dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente editarCliente = porId(cliente.getId());
            editarCliente.setNombre(cliente.getNombre());
            editarCliente.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        dataSource.remove(this.porId(id));
    }

    @Override
    // Ordenar lista según al campo y dirección dada
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((Cliente a, Cliente b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    // Creamos el complemento para el método que ordena la lista
    private static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
            case "id" ->
                resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
            {
                resultado = a.getApellido().compareTo(b.getApellido());
            }
        }
        return resultado;
    }
}
