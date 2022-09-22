package org.afrivera.api.stream.ejemplos;

import org.afrivera.api.stream.ejemplos.models.Factura;
import org.afrivera.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploFlatMapFactura {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("John", "Doe");
        Usuario usuario2 = new Usuario("Pepe", "Perez");

        usuario1.addFactura(new Factura("compras tecnologia"));
        usuario1.addFactura(new Factura("compras muebles"));

        usuario2.addFactura(new Factura("Bicicleta"));
        usuario2.addFactura(new Factura("notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2);
        usuarios.stream().flatMap(u->u.getFacturas().stream())
                .forEach(f-> System.out.println(f.getDescripcion().concat(" : cliente ")
                        .concat(f.getUsuario().toString())));

        /*for(Usuario u: usuarios){
            for(Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }*/
    }
}
