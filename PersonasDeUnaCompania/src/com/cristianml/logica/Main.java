package com.cristianml.logica;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Cristian", "Montaño", "12", "Plan 3000",
                1, 3000.0, 500.0);
        gerente.setPresupuesto(600.0);
        gerente.aumentarRemuneracion(30);

        // Imprimimos datos y heredados
        System.out.println(gerente);
    }
}