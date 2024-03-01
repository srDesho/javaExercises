package com.cristianml.logica;

public class Iphone extends Electronico implements IProducto{
    private String color;
    private String modelo;

    public Iphone(String fabricante, String color, String modelo) {
        super(fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public int getPrecio() {
        return this.getPrecio();
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio();
    }
}
