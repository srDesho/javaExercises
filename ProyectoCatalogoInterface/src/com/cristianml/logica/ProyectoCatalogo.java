package com.cristianml.logica;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        IProducto[] productos = new Producto[5];
        productos[0] = new Iphone(20000, "Apple", "Blanco", "14 PRO MAX");
        productos[1] = new Libro(5000, new Date(), "Eric Gamma", "Patrones de Diseño POO", "Gamma");
        productos[2] = new TvLcd(10000, "Samsung  ", 60);
        productos[3] = new Comics(8000, new Date(), "René Ríos", "Condorito", "Lord Cochrane", "Condorito");
        productos[4] = new Iphone(30000, "Apple", "Negro", "15 PRO MAX");

        // Iterar los datos de los productos

        for (IProducto produc : productos) {
            System.out.println("=====================" + produc.getClass().getSimpleName() + "====================");
            System.out.println("Precio del producto: " + produc.getPrecioVenta());
            if (produc instanceof Electronico) {
                System.out.println("Fabricante: " + ((Electronico) produc).getFabricante());
            }
            if (produc instanceof Iphone) {
                System.out.println("Color: " + ((Iphone) produc).getColor());
                System.out.println("Modelo: " + ((Iphone) produc).getModelo());
            }
            if (produc instanceof Libro) {
                System.out.println("Fecha publicación: " + ((Libro) produc).getFechaPublicacion());
                System.out.println("Autor: " + ((Libro) produc).getAutor());
                System.out.println("Título: " + ((Libro) produc).getTitulo());
                System.out.println("Editorial: " + ((Libro) produc).getEditorial());
            }
            if (produc instanceof TvLcd) {
                System.out.println("Pulgadas: " + ((TvLcd) produc).getPulgada());
            }
            if (produc instanceof Comics) {
                System.out.println("Personaje: " + ((Comics) produc).getPersonaje());
            }
        }
    }
}