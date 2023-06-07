package orientacao_a_objetos.composicao.desafio_composicao;

import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Compra> compras = new ArrayList<Compra>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    double obterTotalDasCompras() {
        double total_das_compras = 0.0;
        for(Compra compra: compras) {
            total_das_compras += compra.obterValorTotal();
        }
        return total_das_compras;
    }
}
