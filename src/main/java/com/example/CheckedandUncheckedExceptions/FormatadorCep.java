package com.example.CheckedandUncheckedExceptions;
import java.util.Scanner;

public class FormatadorCep {
//    public static void main(String[] args) {
//        try {
//            String cepFormatado = formatarCep("23765064");
//            System.out.println(cepFormatado);
//        } catch (CepInvalidoException e) {
////            throw new RuntimeException(e);
//            System.out.println("O CEP precisa ter 8 digitos");
//        }
//    }
//
//    static String formatarCep(String cep) throws CepInvalidoException{
//        if(cep.length() != 8)
//            throw new CepInvalidoException();
//
//        //simulando um cep formatado
//        return "23.765-064";
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cepFormatado = null;
        boolean cepValido = false;

        while (!cepValido) {
            System.out.println("Digite um CEP válido (8 dígitos):");
            String cepDigitado = scanner.nextLine();

            try {
                cepFormatado = formatarCep(cepDigitado);
                cepValido = true;
            } catch (CepInvalidoException e) {
                System.out.println("CEP inválido. Tente novamente.");
            }
        }

        System.out.println("CEP formatado: " + cepFormatado);
        scanner.close();
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // Simulando um CEP formatado
        return cep.substring(0, 5) + "-" + cep.substring(5);
    }

}
