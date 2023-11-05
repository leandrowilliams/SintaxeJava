package com.example.rocketseat.estruturadeclasse;

//HelloWorld = Nome da minha classe
//public = Tipo de acesso da classe
//class = Tipo da classe

public class HelloWorld {

    // Todo conteudo devera ser inserido aqui dentro

    public static void main(String[] args) {
//        Numeros (int, double, float, long)
//        Texto (String)
//        Booleanos (boolean)

        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 132408132483210418L;
        String dadoDoTipoString = "Colocar o meu texto";
        boolean dadoDoTipoBoolean = true; //false

//        if - else
        if(dadoDoTipoInt == 10){
            //sysout = sout
            System.out.println("Entrou no if do 10");
        }else if(dadoDoTipoInt < 12){
            System.out.println("Entrou no if do 12");
        } else {
            System.out.println("Entrou no else");
        }

//        While (Enquanto algo for verdadeiro, faça alguma coisa)
        int valorInicial = 0;
        while (valorInicial < 3) {
            System.out.println("O valor inicial é menor que 3");
            System.out.println(valorInicial);
            valorInicial++;

        }
        System.out.println("Saiu do while");

//        For
        for (int i = 0; i <= 4; i++) {
            System.out.println("O valor do i é: " + i);
        }
        System.out.println("Finalizando o FOR");

    }

}

// Fora do escopo da classe