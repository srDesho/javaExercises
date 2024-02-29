package com.cristianml.logica;

public class Tigre extends Felino{
    private String especieTigre;

    public Tigre(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanaioGarras, Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanaioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
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
