package io.github.fgabrielbraga.vendas.models.dto;

import io.github.fgabrielbraga.vendas.models.Cliente;
import io.github.fgabrielbraga.vendas.models.Item;
import io.github.fgabrielbraga.vendas.models.Venda;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class VendaDTO {

    private Long id;

    @NotBlank(message = "A data de registro da venda é obrigatória")
    private String dataRegistro;

    @NotNull(message = "O código do cliente é obrigatório na venda")
    private Long idCliente;

    @NotEmpty
    private List<ItemDTO> itens;

    public VendaDTO() {
    }

    public VendaDTO(Venda venda) {
        this.id = venda.getId();
        this.dataRegistro = venda.getDataRegistro();
        this.idCliente = venda.getCliente().getId();
        this.itens = venda.getItems().stream().map(ItemDTO::new).collect(Collectors.toList());
    }

    public static Venda convert(VendaDTO vendaDTO) {
        Venda venda = new Venda();
        venda.setId(vendaDTO.getId());
        venda.setDataRegistro(vendaDTO.getDataRegistro());
        venda.setCliente(new Cliente(vendaDTO.getIdCliente()));
        venda.setItems(vendaDTO.getItens().stream().map(ItemDTO::convert).collect(Collectors.toList()));
        return venda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public List<ItemDTO> getItens() {
        return itens;
    }

    public void setItens(List<ItemDTO> itens) {
        this.itens = itens;
    }
}
