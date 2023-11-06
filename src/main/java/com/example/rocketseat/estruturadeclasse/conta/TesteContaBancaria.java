package com.example.rocketseat.estruturadeclasse.conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setNumero("123");
        contaBancaria1.setTitular ("Jose");
//        contaBancaria1.setSaldo(100);

        contaBancaria1.depositar(150);
        contaBancaria1.sacar(100);
    }
}
