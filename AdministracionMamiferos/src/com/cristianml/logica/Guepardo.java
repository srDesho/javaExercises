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
        return "El Guepardo caza a su presa a una velocidad de " + getVelocidad() + " km/h";
    }

    @Override
    public String correr() {
        return "El Guepardo corre a una velocidad de " + getVelocidad() + " km/h";
    }

    @Override
    public String comunirse() {
        return "El perro de nombre: " + getNombreCientifico() + " tiene una altura de " + getAltura() + "cm y se comunica Rugiendo fuerte ante la presa.";
    }
}
