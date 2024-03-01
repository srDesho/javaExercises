package com.cristianml.logica;

import java.util.Date;

public class Comics extends Libro implements IProducto{
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String perso) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = perso;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }
}
