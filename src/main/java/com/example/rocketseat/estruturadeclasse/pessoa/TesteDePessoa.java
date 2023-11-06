package com.example.rocketseat.estruturadeclasse.pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("12345678901");
        pessoa.setNome("Daniele");
        pessoa.setIdade(33);

        System.out.println(pessoa.getCpf());

        System.out.println("======================");

//        Podendo usar a mesta instancia
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setIdade(22);
        pessoa2.setCpf("12345678909");

        System.out.println(pessoa2.getCpf());

        System.out.println("===================");

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Joao");
        pessoa3.setIdade(32);
        pessoa3.setCpf("12345678919");

        System.out.println(pessoa3.imprimirDadosDaPessoa());

        System.out.println("============================");

        Professor professor = new Professor();
        professor.setCpf("131324142344");
        professor.setNome("Pedro");
        professor.setIdade(43);
        professor.setSalario(50000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("13413241234");
        aluno.setIdade(19);
        aluno.setNome("Leandro");
        aluno.setMatricula("0134989");

        System.out.println(aluno.imprimirDadosDaPessoa());


    }
}
