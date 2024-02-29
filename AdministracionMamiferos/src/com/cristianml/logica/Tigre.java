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
        return "El Tigre de especie: " + getEspecieTigre() + " caza con sus garras de tamaño de " + getTamanaioGarras() + "cm";
    }

    @Override
    public String dormir() {
        return "El tigre " + getNombreCientifico() + " duerme muchas horas.";
    }

    @Override
    public String correr() {
        return "El tigre de " + getPeso() + "kg de peso corre a una velocidad de + " + getVelocidad() + "km/h.";
    }

    @Override
    public String comunicarse() {
        return "El tigre ruge fuerte para asustar a sus enemigos.";
    }
}
