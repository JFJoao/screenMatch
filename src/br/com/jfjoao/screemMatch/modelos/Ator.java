package br.com.jfjoao.screemMatch.modelos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ator {
    public static void main(String[] args) {
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Toty");
        buscaPorArtista.add("Thais");
        buscaPorArtista.add("João");
        buscaPorArtista.add("Titi");
        buscaPorArtista.add("Tata");

        System.out.println("Lista sem ordenação:");
        System.out.println(buscaPorArtista);
        System.out.println("Lista ordenada:");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);


    }

}
