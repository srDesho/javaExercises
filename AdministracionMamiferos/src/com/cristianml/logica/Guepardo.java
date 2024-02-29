package com.cristianml.logica;

public class Guepardo extends Felino{

    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanaioGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanaioGarras, velocidad);
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
