package com.cristianml.logica;

import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente = new Cliente();
    private Producto[] productos = new Producto[4];
}
