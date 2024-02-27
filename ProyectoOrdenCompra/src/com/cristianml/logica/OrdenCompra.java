package com.cristianml.logica;

import java.util.Date;

public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private static int ultId;
    private int posicionProductos = 0;

    public OrdenCompra() {
        this.id = ++ultId;
    }

    public OrdenCompra(String descripcion) {
        this(); // Invocamos a la clase que crea el constructor por defecto para que incremente el idContador
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    // Método agregar producto
    public void addProducto(Producto producto){
        if (posicionProductos < this.productos.length) {
            productos[posicionProductos++] = producto;
        }
    }

    public int granTotal() {
        int total = 0;
        for (Producto producto : this.productos) {
            if (producto != null) {
                total += producto.getPrecio();
            }
        }
        return total;
    }

    public String detalle() {
        String detalle = "Id = " + this.id + " \n" +
                "Descripción: " + this.descripcion + "\n" +
                "Cliente: " + this.cliente + "\n" +
                "PRODCUTOS: \n";
        for (Producto producto : productos) {
            if (producto != null) {
                detalle += "Nombre: " + producto.getNombre() + " - Fabricante: " + producto.getFabricante() +
                        "- Precio: " + producto.getPrecio() + "\n";
            }
        }
        detalle += "Gran total: " + granTotal();
        return detalle;
    }
}
