package org.afrivera.api.stream.ejemplos;

import org.afrivera.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(n -> new Usuario(n.split(" ")[0], n.split(" ")[1]))
                .peek(System.out::println) // es un consumer no retorna nada
                .map(usuario -> {
                    String nombre = usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        //nombres.forEach(System.out::println);
        List<Usuario> lista = nombres.collect(Collectors.toList()); // para convertir a una lista con un operador terminal -> collect
        lista.forEach(System.out::println);


    }
}
