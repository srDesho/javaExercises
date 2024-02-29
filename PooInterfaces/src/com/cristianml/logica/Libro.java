package com.cristianml.logica;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {
    private Persona autor;
    private String titulo;
    private Genero genero;
    private List<Imprimible> paginas;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pag) {
        paginas.add(pag);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Título: ").append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor.toString()).append("\n").append("Género: ")
                .append(this.genero).append("\n");
        for (Imprimible pag : paginas) {
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
