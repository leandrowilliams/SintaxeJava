package com.example.candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class CasesArrayCListaDeCandidatos {

    public static void main(String[] args) {
//        selecaoCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de numero " + (indice+1) + " é " + candidatos[indice]);
        }
        System.out.println("======================================");
        System.out.println("Forma abreviada de interação For Each:");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBasePadrao = 2000.0;
        while(candidatosSelecionados < 10 && candidatosAtual < candidatos.length) {
            String candidato = candidatos [candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBasePadrao >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if(salarioBase==salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

}
