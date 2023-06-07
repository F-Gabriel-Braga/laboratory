package br.com.cod3r.cm.view;

import br.com.cod3r.cm.exception.ExplosaoException;
import br.com.cod3r.cm.exception.SairException;
import br.com.cod3r.cm.model.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {

    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        executarJogo();
    }

    private void executarJogo() {
        try {
            boolean continuar = true;

            while (continuar == true) {
                cicloDoJogo();

                System.out.print("NOVA PARTIDA? (S/N) ");
                String resposta = entrada.nextLine();
                if("n".equalsIgnoreCase(resposta)) {
                    continuar = false;
                }
                else {
                    tabuleiro.reiniciar();
                }
            }
        }
        catch (SairException e) {
            System.out.println("JOGO ENCERRADO!");
        }
        finally {
            entrada.close();
        }
    }

    private void cicloDoJogo() {
        try {
            while (!tabuleiro.objetivoAlcancado()) {
                System.out.println(tabuleiro);
                String digitado = capturarValorDigitado("Digite (x, y): ");
                Iterator<Integer> xy = Arrays.stream(digitado.split(",")).map(e -> Integer.parseInt(e.trim())).iterator();

                digitado = capturarValorDigitado("1 - ABRIR OU 2 - MARCAR/DESMARCAR: ");

                if("1".equals(digitado)) {
                    tabuleiro.abrir(xy.next(), xy.next());
                }
                else if("2".equals(digitado)) {
                    tabuleiro.marcar(xy.next(), xy.next());
                }
            }
            System.out.println(tabuleiro);
            System.out.println("VOCÊ GANHOU!");
        }
        catch (ExplosaoException e) {
            System.out.println(tabuleiro);
            System.out.println("VOCÊ PERDEU!");
        }
    }

    private String capturarValorDigitado(String texto) {
        System.out.print(texto);
        String digitado = entrada.nextLine();
        if("SAIR".equalsIgnoreCase(digitado)) {
            throw  new SairException();
        }
        return digitado;
    }
}
