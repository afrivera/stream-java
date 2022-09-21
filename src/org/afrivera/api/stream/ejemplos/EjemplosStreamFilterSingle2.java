package org.afrivera.api.stream.ejemplos;

import org.afrivera.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamFilterSingle2 {
    public static void main(String[] args) {

        Usuario usuario = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(n -> new Usuario(n.split(" ")[0], n.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(3))
                .findFirst().get();

        System.out.println(usuario);


    }
}
