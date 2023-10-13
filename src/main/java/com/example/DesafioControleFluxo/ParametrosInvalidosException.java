package com.example.DesafioControleFluxo;

public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}


//    public ParametrosInvalidosException(String message) {
//        super(message);
//    }

//pode ser criado assim também, mas preferir do outro jeito que já pega o error e joga lá no
//        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");