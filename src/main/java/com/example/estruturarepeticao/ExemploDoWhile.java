package com.example.estruturarepeticao;
import java.util.Random;
public class ExemploDoWhile {

    public static void main(String[] args) {
        System.out.println("Discando...");

        Random random = new Random();

        do {
            //Executando repetidamente até que alguém atenda
            System.out.println("Telefone tocando");

        }while(tocando(random));

        System.out.println("Alô !!!");
    }
    private static boolean tocando(Random random) {
        boolean atendeu = random.nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }

}