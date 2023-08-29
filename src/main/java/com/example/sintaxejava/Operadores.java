package com.example.sintaxejava;

public class Operadores {
//    public static void main(String[] args) {
//        int numero = 5;
//        numero = - numero;
//        System.out.println(numero);
//
//        numero = numero * -1;
//        System.out.println(numero);
//    }

//    public static void main(String[] args) {
//        boolean variavel = true;
//        System.out.println(!variavel);
//        System.out.println(variavel);
//    }

//    public static void main(String[] args) {
//        int a, b;
//
//        a = 6;
//        b = 6;
//
////        String resultado = "";
////        if (a == b)
////            resultado = "verdadeiro";
////        else
////            resultado = "falso";
//
//        String resultado = (a == b) ? "verdadeiro" : "falso";
//
//        System.out.println(resultado);
//    }

    public static void main(String[] args) {

        String nomeUm = "João";
        String nomeDois = new String("João");

        System.out.println(nomeUm.equals(nomeDois) ? "verdadeiro" : "falso");

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois: " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente que o numeroDois: " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que o numeroDois: " + simNao);
    }
}
