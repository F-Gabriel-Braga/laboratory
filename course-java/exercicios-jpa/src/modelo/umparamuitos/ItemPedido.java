package modelo.umparamuitos;

import estrutura.Entidade;
import modelo.basico.Produto;

import javax.persistence.*;

@Entity
@Table(name = "itens")
public class ItemPedido implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER/*DEFAULT*/)
    @JoinColumn(name = "pedid_id")
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.EAGER/*DEFAULT*/)
    @JoinColumn(name = "prod_id")
    private Produto produto;

    @Column(name = "item_quantidade", nullable = false)
    private int quantidade;

    @Column(name = "item_preco", nullable = false)
    private Double preco;

    public ItemPedido() {
    }

    public ItemPedido(Pedido pedido, Produto produto, int quantidade) {
        this.setPedido(pedido);
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        if(produto != null && this.preco == null) {
            setPreco(produto.getPreco());
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
