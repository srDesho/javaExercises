package com.cristianml.logica;

public class EjemploMamiferos {
    public static void main(String[] args) {
        // Creamos un arreglo de tipo Mamifero
        Mamifero[] mamiferos = new Mamifero[5];

        // Instanciamos a los animales
        Mamifero leon = new Leon("Selva",1.3f, 2.0f, 150f, "Panthera Leo", 8.0f, 300, 10, 80.2f);
        Mamifero tigre = new Tigre("Selva Tropival", 1.0f, 2.5f, 150f, "Panthera Tigris", 7.0f, 60, "Panthera Tigris");
        Mamifero guepardo = new Guepardo("Sábanas y Praderas Abiertas", 90.0f, 1.4f, 60.2f, "Acinonyx jubatus", 7f, 100);
        Mamifero perro = new Perro("Entorno humano", 50f, 70f, 70f, "Canis lupus Familiaris", "Negro", 2.0f, 30);
        Mamifero lobo = new Lobo("Bosque", 70f, 90f, 100f, "Canis lupus", "Gris", 3.0f, 30, "Canis Lupus");

        // Añadimos al arreglo
        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = guepardo;
        mamiferos[3] = perro;
        mamiferos[4] = lobo;

        // Mostramos sus datos con un foreach
        for (Mamifero animal : mamiferos) {
            System.out.println("===============" + animal.getClass().getSimpleName() + "==============");
            System.out.println("Habitat = " + animal.getHabitat());
            System.out.println("Altura = " + animal.altura);
            System.out.println("Largo = " + animal.getLargo());
            System.out.println("Peso = " + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Clomillos:" + ((Canino) animal).getTamanioColmillos());
                System.out.println("Color:" + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) animal).getNumCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanaioGarras());
                System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número Integrantes:" + ((Leon) animal).getNumManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre:" + ((Tigre) animal).getEspecieTigre());
                }
            }
            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }
    }
}