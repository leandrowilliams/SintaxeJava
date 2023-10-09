package com.example.estruturaexcepcionais;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeTryCatch {

    public static void main(String[] args) {
//        try {
//
//            //criando o objeto scanner
//            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
//
//            System.out.println("Digite seu nome");
//            String nome = scanner.next();
//
//            System.out.println("Digite seu sobrenome");
//            String sobrenome = scanner.next();
//
//            System.out.println("Digite sua idade");
//            int idade = scanner.nextInt();
//
//            System.out.println("Digite sua altura");
//            double altura = scanner.nextDouble();
//
//
//            //imprimindo os dados obtidos pelo usuario
//            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
//            System.out.println("Tenho " + idade + " anos ");
//            System.out.println("Minha altura é " + altura + "cm ");
//            scanner.close();
//        } catch (InputMismatchException i){
//            System.err.println("Os campos idade e altura precisam ser numéricos");
//        }


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        int idade = 0;
        double altura = 0.0;

        boolean dadosCorretos = false;

        while (!dadosCorretos) {
            try {
                System.out.println("Digite sua idade");
                idade = scanner.nextInt();

                System.out.println("Digite sua altura (em centímetros)");
                String alturaInput = scanner.next().replace(",", ".");
                altura = Double.parseDouble(alturaInput);

                dadosCorretos = true;
            } catch (InputMismatchException | NumberFormatException e) {
                System.err.println("Os campos idade e altura precisam ser numéricos. Por favor, tente novamente.");
                scanner.nextLine(); // Limpa o buffer do scanner para evitar loops infinitos
            }
        }

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
        scanner.close();
    }

}
