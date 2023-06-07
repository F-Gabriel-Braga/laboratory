package io.github.fgabrielbraga.vendas.services;

import io.github.fgabrielbraga.vendas.models.Item;
import io.github.fgabrielbraga.vendas.models.dto.ItemDTO;
import io.github.fgabrielbraga.vendas.models.dto.VendaDTO;
import io.github.fgabrielbraga.vendas.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item save(Item item) {
        return this.itemRepository.save(item);
    }

    public List<ItemDTO> findByVenda(VendaDTO dto) {
        List<Item> itens = this.itemRepository.findByVenda(dto.getId());
        List<ItemDTO> itensDTO = itens.stream().map(ItemDTO::new).collect(Collectors.toList());
        return itensDTO;
    }
}
