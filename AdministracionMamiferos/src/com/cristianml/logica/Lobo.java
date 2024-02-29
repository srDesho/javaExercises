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
        return "El lobo caza junto a su grupo de " + numCamada + " individuos en la selva.";
    }

    @Override
    public String dormir() {
        return "El Lobo " + color + " duerme en las cavernas de " + habitat;
    }

    @Override
    public String correr() {
        return "El lobo caza junto a su grupo de " + numCamada + "individuos.";
    }

    @Override
    public String comunirse() {
        return "El lobo de la especie " + this.especieLobo + " se comunica con aullidos agudos.";
    }
}
