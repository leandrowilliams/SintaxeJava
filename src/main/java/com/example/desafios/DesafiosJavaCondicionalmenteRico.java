package com.example.desafios;
import java.util.Scanner;

public class DesafiosJavaCondicionalmenteRico {

    public static void main(String[] args) {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        // Verifique se o saldo disponível é suficiente para o saque
        if (saldoTotal >= valorSaque) {
            // Realize o saque subtraindo o valor do saldo
            saldoTotal -= valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
    }

}

//Descrição:
//        Uma nova feature para um sistema bancário foi analisada pela equipe de desenvolvimento e será uma das tarefas a serem trabalhadas durante a sprint, como desenvolvedor da empresa você recebeu os requisitos para a nova implementação que consiste em uma solução algorítmica que permita aos clientes realizarem saques em caixas eletrônicos. No entanto, existem algumas regras a serem seguidas para garantir que um saque possa ser realizado com sucesso.
//
//        Regras do saque:
//        - Cada cliente digitará o valor do seu saldoTotal de sua conta bancária e o valorSaque.
//        - Um saque só pode ser realizado se o saldoDisponível na conta for igual ou superior ao valor solicitado.
//        - Se o saldo for suficiente, o valor solicitado deve ser subtraído do saldo disponível, indicando que o saque foi realizado.
//        - Se o saldo for insuficiente, o saque não deve ser realizado e uma mensagem adequada deve ser exibida.
//
//        Entrada:
//        A entrada consiste em dois valores inteiros que representam o total do saldo da conta e o valor do saque.
//
//        Saída:
//        Se o saque for realizado com sucesso, exibir a mensagem "Saque realizado com sucesso! Novo saldo: {saldo}", onde {saldo} é o novo saldo disponível na conta.
//
//        Se o saque não for possível devido a saldo insuficiente, exibir a mensagem "Saldo insuficiente. Saque nao realizado!"
//
//        Exemplos:
//        A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
//
//        Entrada:
//        1000
//        200
//
//        Saída:
//        Saque realizado com sucesso. Novo saldo: 800
//
//        Entrada:
//        1500
//        1800
//
//        Saída:
//        Saldo insuficiente. Saque nao realizado!
//
//        Entrada:
//        300
//        200
//
//        Saída:
//        Saque realizado com sucesso. Novo saldo: 100
//
//        A estrutura do código é essa:
//
//        import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        // Entrada de dados
//        Scanner scanner = new Scanner(System.in);
//        int saldoTotal = scanner.nextInt();
//        int valorSaque = scanner.nextInt();
//
//        //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
//    }
//}