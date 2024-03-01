package com.cristianml.logica;

abstract public class Electronico implements IElectronico{
    protected String fabricante;

    public Electronico(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }


}
