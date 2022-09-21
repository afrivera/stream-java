package org.afrivera.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemplosStream {
    public static void main(String[] args) {

        // creando un Stream
        Stream<String> nombre = Stream.of("Pato", "Paco", "Pepa", "Pepe");

        // el foreach no retorna nada
        nombre.forEach(System.out::println);

        // crear a partir de un arreglo
        String[] arr = {"Pato", "Paco", "Pepa", "Pepe"};
        Stream<String> nombres2 = Arrays.stream(arr);

        // a partir de un stringbuilder
        Stream<String> nombres3 = Stream.<String>builder().add("pato")
                .add("Paco")
                .add("Pepa")
                .add("Pepe")
                .build();
        nombres3.forEach(System.out::println);

        // a partir de un collection
        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepa");
        lista.add("Pepe");

        Stream<String> nombres4 = lista.stream();
        nombres4.forEach(System.out::println);

        // se puede invocar directamente el metodo
        lista.stream().forEach(System.out::println);
    }
}
