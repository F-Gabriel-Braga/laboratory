package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {
    private OperacoesAritmeticas operacoes = new OperacoesAritmeticas();

    @Override
    public double soma(double ... nums) {
        Logger.info("SOMANDO...");
        return operacoes.soma(nums);
    }
}
