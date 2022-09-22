package org.afrivera.api.stream.ejemplos;

import org.afrivera.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemplosStreamDistinctUsuarioSum {
    public static void main(String[] args) {

        IntStream largo = Stream.of("Pato Guzman", "Paco Gonzalez",
                        "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Guzman",
                        "Pato Guzman", "Pato Guzman")
                .map(n -> new Usuario(n.split(" ")[0], n.split(" ")[1]))
                        .distinct()
                .mapToInt(u-> u.toString().length())
                        .peek(System.out::println);
        // largo.forEach(System.out::println);se comenta porque siempre se usa un operador final
        // System.out.println("total: " + largo.sum());
        // estatisctis para obtener to do lo que se requiere
        IntSummaryStatistics stats = largo.summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());

    }
}
