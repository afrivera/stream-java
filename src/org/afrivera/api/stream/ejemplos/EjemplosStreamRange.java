package org.afrivera.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemplosStreamRange {
    public static void main(String[] args) {

        IntStream numeros =  IntStream.range(5,20)
                .peek(System.out::println);

        // Integer result = numeros.reduce(0, Integer::sum);
        //int result = numeros.sum(); // .sum solo está disponible en el tipo IntStream
        // System.out.println("result = " + result);
        IntSummaryStatistics stats = numeros.summaryStatistics();
        System.out.println("max = " + stats.getMax());
        System.out.println("Min = " + stats.getMin());
        System.out.println("Sum = " + stats.getSum());
        System.out.println("Average = " + stats.getAverage());
        System.out.println("Total = " + stats.getCount());


    }
}
