package com.cristianml.repositorio;

import com.cristianml.logica.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
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
            if (cli.getId() != null && cli.getId().equals(id)) {
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
    // Listar ordenando segun al argumento recibido en la variable campo y si la direccion es asc o desc
    public List<Cliente> listar(String campo, Direccion dir) {
        dataSourcce.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                int resultado = 0;
                if (dir == Direccion.ASC) {
                    switch (campo) {
                        case "id" ->
                            resultado = a.getId().compareTo(b.getId());
                        case "nombre" ->
                            resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" -> a.getApellido().compareTo(b.getApellido());
                    }
                } else if (dir == Direccion.DESC) {
                    switch (campo) {
                        case "id" ->
                                resultado = b.getId().compareTo(a.getId());
                        case "nombre" ->
                                resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" ->
                                resultado = b.getApellido().compareTo(a.getApellido());
                    }
                }
                return resultado;
            }
        });
        return dataSourcce;
    }

    @Override
    // Listar de manera que se va a paginar depende al rango
    public List<Cliente> listar(int desde, int hasta) {
        // Con subList podemos captura por ejemplo desde 1 hasta 10
        return dataSourcce.subList(desde, hasta);
    }
}
