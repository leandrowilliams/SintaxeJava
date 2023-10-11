package com.example.candidatura;
import java.util.Scanner;

public class ProcessoSeletivo {

//    public static void main(String[] args) {
////        System.out.println("Processo seletivo");
//        analisarCandidato(1900.0);
//        analisarCandidato(2200.0);
//        analisarCandidato(2000.0);
//
//    }
//
//    static void analisarCandidato(double salarioPretendido) {
//        double salarioBase = 2000.00;
//        if (salarioBase > salarioPretendido) {
//            System.out.println("Ligar para o candidato");
//        } else if(salarioBase==salarioPretendido)
//            System.out.println("Ligar para o candidato com contra proposta");
//        else {
//            System.out.println("Aguardando o resultado dos demais candidatos");
//        }
//    }
    //melhorar depois

//    Primeiro se deve dizer qual é o salario padrao para que depois digite o salario que o candidato.
    public enum EstadoCandidato {
        LIGAR_CANDIDATO,
        LIGAR_COM_CONTRA_PROPOSTA,
        AGUARDAR_OUTROS_CANDIDATOS
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário base padrão: ");
        double salarioBasePadrao = scanner.nextDouble();

        System.out.println("Digite o salário pretendido do candidato: ");
        double salarioPretendido = scanner.nextDouble();

        EstadoCandidato estado = analisarCandidato(salarioPretendido, salarioBasePadrao);

        System.out.println("Estado do candidato: " + estado);
        scanner.close();
    }

    static EstadoCandidato analisarCandidato(double salarioPretendido, double salarioBasePadrao) {
        if (salarioBasePadrao > salarioPretendido) {
            return EstadoCandidato.LIGAR_CANDIDATO;
        } else if (salarioBasePadrao == salarioPretendido) {
            return EstadoCandidato.LIGAR_COM_CONTRA_PROPOSTA;
        } else {
            return EstadoCandidato.AGUARDAR_OUTROS_CANDIDATOS;
        }
    }
}