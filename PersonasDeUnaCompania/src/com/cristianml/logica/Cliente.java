package com.cristianml.logica;

public class Cliente extends Persona{
    private int id_cliente;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String nroFiscal, String direccion, int id_cliente) {
        super(nombre, apellido, nroFiscal, direccion);
        this.id_cliente = id_cliente;
    }

    public Cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    @Override
    public String toString() {
        return "id_cliente= " + id_cliente;
    }
}
