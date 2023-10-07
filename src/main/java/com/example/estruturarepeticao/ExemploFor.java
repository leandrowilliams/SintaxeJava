package com.example.estruturarepeticao;

public class ExemploFor {

    public static void main(String[] args) {
        for(int carneirinhos = 1 ; carneirinhos <=50; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }

        System.out.println(" ------------------------ ");

        // Outras estruturas

        //estrutura 1
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }

        System.out.println(" ------------------------ ");

        //estrutura 2
        //o que importa é somente o bloco condicional
        int carneirinhos = 1;
        for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }

        //for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução ) { }

    }

}
