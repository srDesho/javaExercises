package com.cristianml.logica;

import com.cristianml.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Daniel", "Montaño"));
        repo.crear(new Cliente("Melani", "Jackson"));
        repo.crear(new Cliente("Andrés", "Guzmán"));
        repo.crear(new Cliente("Cristian", "Landivar"));

        // Agregamos a la lista para luego mostrar
        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        // Paginamos la lista de clientes
        System.out.println("=======================PAGINABLE======================");
        List<Cliente> paginable = ((PaginableRepositorio) repo).listar(2,4);
        paginable.forEach(System.out::println);

        // Ordenar la página según al atributo del cliente que elijamos, y el tipo de orden
        System.out.println("=============================ORDENABLE====================================");
        List<Cliente> clientesOrdenarAsc = ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC);
        for (Cliente cliente : clientesOrdenarAsc) {
            System.out.println(cliente);
        }

        // Editar un cliente de la Lista
        System.out.println("===================================EDITAR====================================");
        Cliente editarCliente = new Cliente("Cristian", "Laime");
        editarCliente.setId(4);
        repo.editar(editarCliente);
        repo.listar().forEach(System.out::println);

        // Eliminar un cliente
        System.out.println("==========================ELIMINAR=============================");
        repo.eliminar(3);
        repo.listar().forEach(System.out::println);
    }
}