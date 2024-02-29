package com.cristianml.logica;

abstract public class Felino extends Mamifero{
    protected Float tamanaioGarras;
    protected Integer velocidad;

    public Felino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanaioGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanaioGarras = tamanaioGarras;
        this.velocidad = velocidad;
    }

    public Float getTamanaioGarras() {
        return tamanaioGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }
}
