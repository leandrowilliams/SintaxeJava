package com.example.metodo;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("O volume atual é: " + smartTv.volume);

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("O canal atual é: " + smartTv.canal);
        System.out.println("O volume atual é: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);


    }
}
