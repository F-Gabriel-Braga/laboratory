package br.com.cod3r.cm;

import br.com.cod3r.cm.model.Tabuleiro;
import br.com.cod3r.cm.view.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(8, 8, 15);
        new TabuleiroConsole(tabuleiro);
    }
}
