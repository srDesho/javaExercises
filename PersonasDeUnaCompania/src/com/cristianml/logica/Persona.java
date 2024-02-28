package com.cristianml.logica;

public class Persona {
    private String nombre;
    private String apellido;
    private String nroFiscal;
    private String direccion;

    protected Persona() {
    }

    public Persona(String nombre, String apellido, String nroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroFiscal = nroFiscal;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNroFiscal() {
        return nroFiscal;
    }

    public void setNroFiscal(String nroFiscal) {
        this.nroFiscal = nroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nroFiscal='" + nroFiscal + '\'' +
                ", direccion='" + direccion + '\'';
    }
}
