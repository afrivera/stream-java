package org.afrivera.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamGenerate {
    public static void main(String[] args) {

        Stream.generate(()-> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "Hola Mundo";
                })// hola mundo infinito
                .limit(7) // sino se limita es infinito
                .forEach(System.out::println);
    }
}
