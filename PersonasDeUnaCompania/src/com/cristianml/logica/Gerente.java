package com.cristianml.logica;

public class Gerente extends Empleado{
    private double presupuesto;

    public Gerente(String nombre, String apellido, String nroFiscal, String direccion, int id_empleado, double remuneracion, double presupuesto) {
        super(nombre, apellido, nroFiscal, direccion, id_empleado, remuneracion);
        this.presupuesto = presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + " Presupuesto: " + presupuesto;
    }
}
