package com.cristianml.logica;

public class Leon extends Felino{
    private Integer numManada;
    private Float potenciaRugidoDecibel;

    public Leon(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanaioGarras, Integer velocidad, Integer numManada, Float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanaioGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Integer getNumManada() {
        return numManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
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
