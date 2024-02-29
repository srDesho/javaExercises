package com.cristianml.logica;

public class Lobo extends Canino{
    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanioColmillos, Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
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
