package org.afrivera.api.stream.ejemplos;

import org.afrivera.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFilterAnyMatch {
    public static void main(String[] args) {

        boolean existe = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(n -> new Usuario(n.split(" ")[0], n.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(1)); // operador terminal anyMatch retorna un boolean

        System.out.println(existe);


    }
}
