package com.example.rocketseat.estruturadeclasse.pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.cpf = "12345678901";
        pessoa.nome = "Daniele";
        pessoa.idade = 33;

        System.out.println(pessoa.cpf);

        System.out.println("======================");

//        Podendo usar a mesta instancia
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.idade = 22;
        pessoa2.cpf = "12345678909";

        System.out.println(pessoa2.cpf);

        System.out.println("===================");

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Joao";
        pessoa3.idade = 32;
        pessoa3.cpf = "12345678919";

        System.out.println(pessoa3.imprimirDadosDaPessoa());


    }
}
