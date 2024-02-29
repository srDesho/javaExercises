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
        return "El perro caza con sus colmillos de tamaño " + getTamanioColmillos() + "' con una fuerza de " + getFuerzaMordida() + "PSI";
    }

    @Override
    public String dormir() {
        return "El perro de nombre científico " + getNombreCientifico() + " duerme en su habitat " + getHabitat();
    }

    @Override
    public String correr() {
        return "El perro de color " + getColor() + " duerme solo.";
    }

    @Override
    public String comunirse() {
        return "El perro de nombre: " + getNombreCientifico() + " tiene una altura de " + getAltura() + "cm y se comunica aullando.";
    }
}
