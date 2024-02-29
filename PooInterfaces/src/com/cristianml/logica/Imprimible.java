package com.cristianml.logica;

public interface Imprimible {
    // podemos quitar la palabra public y dejarlo como default, ya que es lo mismo,
    // el default es públivo
    // public String imprimir();
    // String imprimir();

    // Podemos tener atributos pero que sean constantes, estas deben ser públicas, final,
    // y se pueden utilizar  en los métodos.
    final static String TEXTO_DEFECTO = "Imprimiendo valor por defecto.";

    // Podemos implementar un valor por defecto en el método para que sea ignorado en una clase que implemente
    // que implemente esta interface.
    default String imprimir(){
        return TEXTO_DEFECTO;
    }
    static void imprimir(Imprimible imprimible){
      System.out.println(imprimible.imprimir());
    }
}
