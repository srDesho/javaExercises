package com.cristianml.logica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instanciamos y creamos los objetos
        Fruta producto1 = new Fruta("Manzana", 50, 6.5, "Rojo");
        Fruta producto2 = new Fruta("Pera", 65, 7.5, "Verde");
        Limpieza producto3 = new Limpieza("Jabón Líquido", 300, "Distintos", 1.5);
        Limpieza producto4 = new Limpieza("Lavandina", 290, "Distintos", 1.0);
        Lacteo producto5 = new Lacteo("Leche", 200, 4, 15);
        Lacteo producto6 = new Lacteo("Yogurt", 300, 10, 20);
        NoPerecible producto7 = new NoPerecible("Atún", 500, 10, 45);
        NoPerecible producto8 = new NoPerecible("Sardina", 1000, 10, 90);

        // Agregamos los productos en un arreglo de tipo Producto
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);

        // Mostramos los productos
        for (Producto prod : productos) {
            System.out.println(prod.toString());
        }
    }
}