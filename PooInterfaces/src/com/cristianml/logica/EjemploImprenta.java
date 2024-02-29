package com.cristianml.logica;

import static com.cristianml.logica.Genero.PROGRAMACION;
import static com.cristianml.logica.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        // Instanciamos un curriculum y un informe
        Curriculo curriculum = new Curriculo("Experto programador.", new Persona("Crisitan", "Montaño Laime"), "Ing. Informática" );
        curriculum.addExperiencia("Java FX.").addExperiencia("SQL.").addExperiencia("JUnit.")
                .addExperiencia("Mockito.").addExperiencia("Spring Boot.")
                .addExperiencia("Bases De datos no relacionales(MongoDb).");

        Informe informe = new Informe("Algo de contenido...", new Persona("Maribel", "Montaño"), new Persona("Melani", "Laime"));

        // Creamos un libro
        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de Diseño: Elem. Reusables POO"
                , PROGRAMACION);
        // Agregamos páginas al libro
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        // Imprimimos las hojas
        imprimir(informe);
        imprimir(curriculum);
        imprimir(libro);
        System.out.println(TEXTO_DEFECTO);

        // Podemos crear clase anónima de una Iterfaz para poder instanciarla
        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola qué tal, imprimiendo un objeto genérico de una clase anónima";
            }
        });
    }
}