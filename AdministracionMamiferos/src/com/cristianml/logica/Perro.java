package com.cristianml.logica;

public class Perro extends Canino{
    private Integer fuerzaMordida;

    public Perro(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanioColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunirse() {
        return null;
    }
}
