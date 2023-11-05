package com.example.rocketseat.estruturadeclasse;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
//        Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Dani");
        nomes.add("Vini");
        nomes.add("Elias");

//        System.out.println(nomes.get(1));
        for (String nome : nomes) {
            System.out.println("O nome é " + nome);
        }
//        and
        System.out.println("==========================================");

        nomes.forEach(nome -> System.out.println("O nome é "+ nome));

        System.out.println("==========================================");

        nomes.forEach(System.out::println);
    }

}
