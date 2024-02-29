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
        return "El León caza junto a su grupo de " + numManada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El león duerme muchas horas.";
    }

    @Override
    public String correr() {
        return "El león corre a una velocidad de " + this.getVelocidad() + " km/h";
    }

    @Override
    public String comunirse() {
        return "El león ruge para comunicarse, su potencia de rugido en decibelios es de: " + this.potenciaRugidoDecibel;
    }
}
