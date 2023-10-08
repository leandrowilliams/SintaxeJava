package com.example.estruturarepeticao;
import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;

public class ExemploWhile {

    public static void main(String[] args) {
        DecimalFormat formatoMoeda = new DecimalFormat("R$ #,##0.00");
        double mesada = 50.0;

        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + formatoMoeda.format(valorDoce) + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + formatoMoeda.format(mesada));
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }

}
