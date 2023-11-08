package com.example.rocketseat.estruturadeclasse.excecoes;

import com.example.rocketseat.estruturadeclasse.pessoa.Pessoa;

public class Excecoes {

//    checked exceptions

//    unchecked exceptions

//    public static void main(String[] args) throws Exception {
//        int numero = 10;
//        if (numero < 100) {
//            throw new Exception("O número é menor que 100");
//        }
//    }

//    public static void main(String[] args) {
////        try/catch
//        try {
//            validarNumero();
//        }   catch (Exception e) {
//            System.out.println("Deu ruim");
//            e.printStackTrace(); //mostra o erro junto com println
//        }
//
//    }

    public static void main(String[] args) {
        Pessoa p = null;
        p = new Pessoa();
        p.getCpf();
    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O número é menor que 100");
        }
    }
}