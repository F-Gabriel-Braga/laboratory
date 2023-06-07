package br.com.cod3r.cm.model;

import br.com.cod3r.cm.exception.ExplosaoException;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private final int linha;
    private final int coluna;

    private boolean aberto = false;
    private boolean minado = false;
    private boolean marcado = false;

    private List<Campo> vizinhos = new ArrayList<Campo>();

    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    // VIZINHO -> A DIFERENÇA DA DISTÂNCIA ENTRE OS CAMPOS TEM QUE SER 1 (CRUZ) OU 2 (X)
    // |(x1 - x2) + (y1 - y2)|
    boolean adicionarVizinho(Campo vizinho) {
        boolean linhaDiferente = linha != vizinho.linha;
        boolean colunaDiferente = coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaLinha + deltaColuna;

        if(deltaGeral == 1 && !diagonal) {
            vizinhos.add(vizinho);
            return true;
        }
        else if(deltaGeral == 2 && diagonal) {
            vizinhos.add(vizinho);
            return true;
        }
        else {
            return false;
        }
    }

    void marcar() {
        if(!aberto) {
            marcado = !marcado;
        }
    }

    boolean abrir() {
        if(!aberto && !marcado) {
            aberto = true;
            if(minado) {
                throw new ExplosaoException();
            }
            if(vizinhancaSegura()) {
                vizinhos.forEach(v -> v.abrir());
            }
            return true;
        }
        return false;
    }

    boolean vizinhancaSegura() {
        return vizinhos.stream().noneMatch(v -> v.minado);
    }

    void minar() {
        minado = true;
    }

    public boolean isMinado() {
        return minado;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public boolean isAberto() {
        return aberto;
    }

    public boolean isFechado() {
        return !aberto;
    }

    void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    boolean objetivoAlcancado() {
        boolean desvendado = !minado && aberto;
        boolean projetegido = minado && marcado;
        return desvendado || projetegido;
    }

    long minasNaVizinhanca() {
        return vizinhos.stream().filter(v -> v.minado).count();
    }

    void reiniciar() {
        aberto = false;
        minado = false;
        marcado = false;
    }

    @Override
    public String toString() {
        if(marcado) {
            return "[x]";
        }
        else if(aberto && minado) {
            return "[*]";
        }
        else if(aberto && minasNaVizinhanca() > 0) {
            return String.format("[%d]", minasNaVizinhanca());
        }
        else if(aberto) {
            return "[ ]";
        }
        else {
            return "[?]";
        }
    }
}