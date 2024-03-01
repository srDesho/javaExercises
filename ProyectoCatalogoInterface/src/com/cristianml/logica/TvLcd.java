package com.cristianml.logica;

public class TvLcd extends Electronico implements IProducto{
    private int pulgada;

    public TvLcd(String fabricante, int pulgada) {
        super(fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public int getPrecio() {
        return this.getPrecio();
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() ;
    }
}
