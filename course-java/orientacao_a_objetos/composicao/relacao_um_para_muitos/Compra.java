package orientacao_a_objetos.composicao.relacao_um_para_muitos;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(Item item) {
        if(item instanceof Item) {
            itens.add(item);
            item.compra = this;
        }
    }

    void adicionarItem(String nome, int quantidade, double preco) {
        Item item = new Item(nome, quantidade, preco);
        adicionarItem(item);
    }

    double obterValorTotal() {
        double total = 0.0;
        for(Item item: itens) {
            total += (item.preco * item.quantidade);
        }
        return total;
    }
}
