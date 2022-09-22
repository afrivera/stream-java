package org.afrivera.api.stream.ejemplos;

import org.afrivera.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFlatMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(n -> new Usuario(n.split(" ")[0], n.split(" ")[1]))
                .flatMap(u -> {
                    if(u.getNombre().equals("Pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                }) // es muy parecido al map
                .peek(System.out::println); // es un consumer no retorna nada

        nombres.forEach(System.out::println);


    }
}
