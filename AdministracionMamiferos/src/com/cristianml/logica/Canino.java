package com.cristianml.logica;

abstract public class Canino extends Mamifero{
    protected String color;
    protected Float tamanioColmillos;

    public Canino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanioColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }
}
