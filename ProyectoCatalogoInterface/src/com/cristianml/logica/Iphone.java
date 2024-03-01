package com.cristianml.logica;

public class Iphone extends Electronico {
    private String color;
    private String modelo;

    public Iphone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
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
    public double getPrecioVenta() {
        return this.getPrecio();
    }
}
