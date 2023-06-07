package br.com.cod3r.app.financeiro;


import br.com.cod3r.app.Calculadora;

import java.util.ServiceLoader;

public class Teste {
    public static void main(String[] args) {
        Calculadora calculadora = ServiceLoader.load(Calculadora.class)
                .findFirst()
                .get();
        System.out.println(calculadora.soma(1,2,3));
    }
}
