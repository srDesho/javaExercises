package com.cristianml.logica;

import java.util.Date;

public class Libro extends Producto implements ILibro{
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return null;
    }

    @Override
    public String getAutor() {
        return null;
    }

    @Override
    public String getTitulo() {
        return null;
    }

    @Override
    public String getEditorial() {
        return null;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }
}
