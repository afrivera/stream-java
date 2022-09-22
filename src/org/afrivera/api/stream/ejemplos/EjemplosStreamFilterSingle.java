package org.afrivera.api.stream.ejemplos;

import org.afrivera.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(n -> new Usuario(n.split(" ")[0], n.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepex"))
                .peek(System.out::println); // es un consumer no retorna nada

        //nombres.forEach(System.out::println);
        Optional<Usuario> usuario = nombres.findFirst(); // retorna un optional, operador final
        // System.out.println(usuario.orElse(new Usuario("John", "Doe")).getNombre()); // orElse para predeterminar un return
        // System.out.println(usuario.orElseGet(()-> new Usuario("John", "Doe")).getNombre()); // con una expresión lambda
        // System.out.println(usuario.orElseThrow());
        if(usuario.isPresent()){
            System.out.println(usuario.get().getNombre());
        } else {
            System.out.println("No se encontro el objeto");
        }


    }
}
