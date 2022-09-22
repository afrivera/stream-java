package org.afrivera.api.stream.ejemplos;

import org.afrivera.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamDistinctUsuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzalez",
                        "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Guzman",
                        "Pato Guzman", "Pato Guzman")
                .map(n -> new Usuario(n.split(" ")[0], n.split(" ")[1]))
                        .distinct();
        nombres.forEach(System.out::println);

    }
}
