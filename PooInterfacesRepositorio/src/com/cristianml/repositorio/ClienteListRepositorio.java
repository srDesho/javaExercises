package com.cristianml.repositorio;

import com.cristianml.logica.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements FullCrudRepositorio{
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
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSourcce);
        listaOrdenada.sort((Cliente a, Cliente b) ->{
                int resultado = 0;
                if (dir == Direccion.ASC) {
                    resultado = ordenar(campo, a, b);
                } else if (dir == Direccion.DESC){
                    resultado = ordenar(campo, b, a);
                }
                return resultado;
        });
        return listaOrdenada;
    }

    @Override
    // Listar de manera que se va a paginar depende al rango
    public List<Cliente> listar(int desde, int hasta) {
        // Con subList podemos captura por ejemplo desde 1 hasta 10
        return dataSourcce.subList(desde, hasta);
    }

    // Creamos un método para complementar el ordenar y así evitarnos duplicar código en los If
    public static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                    resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
                    resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }

    @Override
    public int total() {
        return dataSourcce.size();
    }
}
