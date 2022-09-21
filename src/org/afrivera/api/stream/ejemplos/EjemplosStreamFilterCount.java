package org.afrivera.api.stream.ejemplos;

import org.afrivera.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFilterCount {
    public static void main(String[] args) {

        long count = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(n -> new Usuario(n.split(" ")[0], n.split(" ")[1]))
                .peek(System.out::println)
                .count(); // operador terminal anyMatch retorna un entero con la cantidad

        System.out.println(count);


    }
}
