package com.cristianml.logica;

public class Empleado extends Persona{
    private int id_empleado;
    private double remuneracion;

    public Empleado(String nombre, String apellido, String nroFiscal, String direccion, int id_empleado, double remuneracion) {
        super(nombre, apellido, nroFiscal, direccion);
        this.id_empleado = id_empleado;
        this.remuneracion = remuneracion;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    @Override
    public String toString() {
        return "id_empleado=" + id_empleado +
                ", remuneracion=" + remuneracion + " " + super.toString();
    }

    public void aumentarRemuneracion(double porcentaje) {
        this.remuneracion += this.remuneracion * (porcentaje/100);
    }

}
