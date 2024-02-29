package com.cristianml.logica;

public class Informe extends Hoja{
    private String autor;
    private String revisor;


    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String Imprimir() {
        return "Informe escrito por: " + this.autor + "\n"
                + "Revisado por: " + this.revisor + "\n"
                + this.contenido;
    }
}
