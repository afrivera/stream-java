package org.afrivera.api.stream.ejemplos;

import org.afrivera.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamDistinct {
    public static void main(String[] args) {

        Stream.of("Pato Guzman",
                        "Paco Gonzalez", "Pepa Gutierrez",
                        "Pepe Mena", "Pepe Garcia", "Paco Gonzalez",
                        "Paco Gonzalez")
                .distinct()
                .forEach(System.out::println);


    }
}
