package io.github.fgabrielbraga.vendas.models.dto;

import io.github.fgabrielbraga.vendas.models.Item;
import io.github.fgabrielbraga.vendas.models.Produto;
import jakarta.validation.constraints.NotNull;

public class ItemDTO {

    private Long id;

    @NotNull(message = "O valor do item não foi computado!")
    private Float valorParcial;

    @NotNull(message = "A quantidade do item é obrigatória")
    private Integer quantidade;

    @NotNull(message = "O código da venda é obrigatório no item")
    private Long idProduto;

    private Long idVenda;

    public ItemDTO() {
    }

    public ItemDTO(Item item) {
        this.id = item.getId();
        this.valorParcial = item.getValorParcial();
        this.quantidade = item.getQuantidade();
        this.idProduto = item.getProduto().getId();
        this.idVenda = item.getVenda().getId();
    }

    public static Item convert(ItemDTO itemDTO) {
        Item item = new Item();
        item.setId(itemDTO.getId());
        item.setValorParcial(itemDTO.getValorParcial());
        item.setQuantidade(itemDTO.getQuantidade());
        item.setProduto(new Produto(itemDTO.getIdProduto()));
        return item;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getValorParcial() {
        return valorParcial;
    }

    public void setValorParcial(Float valorParcial) {
        this.valorParcial = valorParcial;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Long idVenda) {
        this.idVenda = idVenda;
    }
}
