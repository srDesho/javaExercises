package com.cristianml.logica;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        // Creamos los clientes
        Cliente cristian = new Cliente("Cristian", "Montaño");
        Cliente daniel = new Cliente("Daniel", "García");
        Cliente maribel = new Cliente("Maribel", "Laime");

        // Creamos la orden de cliente Cristian
        OrdenCompra ordenCristian = new OrdenCompra("Cristian comprando productos");
        ordenCristian.setCliente(cristian);
        ordenCristian.setFecha(new Date());
        // Agregamos productos de Cristian
        Producto producto1Cristian = new Producto("Polo", "Polera", 50);
        Producto producto2Cristian = new Producto("Levis", "Pantalon", 100);
        Producto producto3Cristian = new Producto("Nike", "Tenis", 200);
        Producto producto4Cristian = new Producto("Barts", "Gorra", 20);

        ordenCristian.addProducto(producto1Cristian);
        ordenCristian.addProducto(producto2Cristian);
        ordenCristian.addProducto(producto3Cristian);
        ordenCristian.addProducto(producto4Cristian);

        // Creamos la orden de cliente Daniel
        OrdenCompra ordenDaniel = new OrdenCompra("Daniel comprando productos");
        ordenDaniel.setCliente(daniel);
        ordenDaniel.setFecha(new Date());
        // Agregamos productos de Daniel
        Producto producto1Daniel = new Producto("Razer", "Mouse", 500);
        Producto producto2Daniel = new Producto("Razer", "Teclado", 750);
        Producto producto3Daniel = new Producto("Samsung", "Monitor", 2000);
        Producto producto4Daniel = new Producto("Apple", "AirPords", 1000);

        ordenDaniel.addProducto(producto1Daniel);
        ordenDaniel.addProducto(producto2Daniel);
        ordenDaniel.addProducto(producto3Daniel);
        ordenDaniel.addProducto(producto4Daniel);

        // Creamos la orden de cliente Maribel
        OrdenCompra ordenMaribel = new OrdenCompra("Maribel comprando productos");
        ordenMaribel.setCliente(maribel);
        ordenMaribel.setFecha(new Date());
        // Agregamos productos de Maribel
        Producto producto1Maribel = new Producto("Arlex", "Mesa", 1500);
        Producto producto2Maribel = new Producto("Melody", "Sofá cama", 2500);
        Producto producto3Maribel = new Producto("Techo", "Almohada", 200);
        Producto producto4Maribel = new Producto("Solares", "Colchon", 1500);

        ordenMaribel.addProducto(producto1Maribel);
        ordenMaribel.addProducto(producto2Maribel);
        ordenMaribel.addProducto(producto3Maribel);
        ordenMaribel.addProducto(producto4Maribel);

        // Mostramos valores en consola, detalle del cliente Cristian
        System.out.println("ORDEN DE CLIENTE CRISTIAN");
        System.out.println("Id = " + ordenCristian.getId() + "\n" +
                "Descripción: " + ordenCristian.getDescripcion() + "\n" +
                "Cliente: " + cristian);
        // Iteramos los productos para ser mostrados
        System.out.println("PRODUCTOS DE CRISTIAN:");
            for (Producto producto : ordenCristian.getProductos()) {
                if (producto != null) {
                    System.out.println("Nombre: " + producto.getNombre() +
                            " - Frabricante: " + producto.getFabricante() +
                            " - Precio: " + producto.getPrecio());
                }
            }
        System.out.println("Gran total: " + ordenCristian.granTotal());

        // Mostramos detalles usando el método detalle() de la clase OrdenCompra
        System.out.println(ordenDaniel.detalle());
        System.out.println(ordenMaribel.detalle());
    }
}