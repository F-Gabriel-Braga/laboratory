package orientacao_a_objetos.composicao.desafio_composicao;

public class Item {
    Compra compra;
    Produto produto;
    int quantidade;

    public Item(Compra compra, Produto produto, int quantidade) {
        this.compra = compra;
        this.produto = produto;
        this.quantidade = quantidade;
        produto.items.add(this);
    }
}
