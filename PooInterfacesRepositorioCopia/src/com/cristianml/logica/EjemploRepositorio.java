package com.cristianml.logica;

import com.cristianml.repositorio.ClienteListRepositorio;
import com.cristianml.repositorio.Direccion;
import com.cristianml.repositorio.FullCrudRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class EjemploRepositorio {
    public static void main(String[] args) {
        FullCrudRepositorio repo = new ClienteListRepositorio();

        repo.crear(new Cliente("Cristian", "Montaño"));
        repo.crear(new Cliente("Andrés", "Guzmán"));
        repo.crear(new Cliente("Yoy", "Barba"));
        repo.crear(new Cliente("Melani", "Jackson"));

        repo.listar().forEach(System.out::println);


        // Buscar un cliente por id
        System.out.println("Cliente bucando: " + repo.porId(9));

        // Editar un cliente
        System.out.println("=========================EDITAR=======================");
        Cliente clienteEditar = new Cliente("Orladno", "Vargas");
        clienteEditar.setId(3);
        repo.editar(clienteEditar);
        repo.listar().forEach(System.out::println);

        // Eliminar un Cliente
        System.out.println("===========================ELIMINAR===============================");
        repo.eliminar(3);
        repo.listar().forEach(System.out::println);

        // Ordenar la lista del repositorio
        System.out.println("======================ORDENABLE==========================");
        List<Cliente> listaOrdenada = repo.listar("apellido", Direccion.ASC);
        listaOrdenada.forEach(System.out::println);

        // Paginar
        System.out.println("===========================PAGINABLE===============================");
        List<Cliente> paginarLista = new ArrayList<>(repo.listar(1, 3));
        paginarLista.forEach(System.out::println);

        // Calculamos la cantidad el clientes registrados en nuestro repositorio
        System.out.println("=================TOTAL REGISTRO==============");
        System.out.println("Total registrados = " + repo.total());
    }
}