package com.cristianml.logica;

public class Informe extends Hoja implements Imprimible {
    private Persona autor;
    private Persona revisor;


    public Informe(String contenido, Persona autor, Persona revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor.toString() + "\n"
                + "Revisado por: " + this.revisor + "\n"
                + this.contenido;
    }
}
