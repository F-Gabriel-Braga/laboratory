package io.github.fgabrielbraga.vendas.repositories;

import io.github.fgabrielbraga.vendas.models.Item;
import io.github.fgabrielbraga.vendas.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query(value = "SELECT * FROM item WHERE venda_id = ?", nativeQuery = true)
    public List<Item> findByVenda(Long idVenda);
}
