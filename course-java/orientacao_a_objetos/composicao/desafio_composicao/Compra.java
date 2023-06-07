package orientacao_a_objetos.composicao.desafio_composicao;

import java.util.ArrayList;

public class Compra {
    Cliente cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    public Compra(Cliente cliente) {
        this.cliente = cliente;
        cliente.compras.add(this);
    }

    double obterValorTotal() {
        double valor_total = 0.0;
        for(Item item: itens) {
            valor_total += (item.produto.preco * item.quantidade);
        }
        return valor_total;
    }

    void adicionarItem(Produto produto, int quantidade) {
        itens.add(new Item(this, produto, quantidade));
    }
}
