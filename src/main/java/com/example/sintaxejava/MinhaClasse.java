package com.example.sintaxejava;

public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "João";
        String segundoNome = "da Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome + " " + segundoNome;
    }
}
