package org.afrivera.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemplosStreamReduceEnteros {
    public static void main(String[] args) {

        Stream<Integer> numeros =  Stream.of(5,10,15,20,25,30);

        Integer result = numeros.reduce(0, Integer::sum);
        // Integer result = numeros.reduce(0, (a,b)->a + b);
        System.out.println("result = " + result);


    }
}
