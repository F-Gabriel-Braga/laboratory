package io.github.fgabrielbraga.vendas.controllers;

import io.github.fgabrielbraga.vendas.models.dto.ItemDTO;
import io.github.fgabrielbraga.vendas.models.dto.VendaDTO;
import io.github.fgabrielbraga.vendas.services.ItemService;
import io.github.fgabrielbraga.vendas.services.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private VendaService vendaService;

    @GetMapping("/itens/venda/{idVenda}")
    public List<ItemDTO> findByVenda(@PathVariable Long idVenda) {
        VendaDTO dto = this.vendaService.findById(idVenda);
        return this.itemService.findByVenda(dto);
    }
}
