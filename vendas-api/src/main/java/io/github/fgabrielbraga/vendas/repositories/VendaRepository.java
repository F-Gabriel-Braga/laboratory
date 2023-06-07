package io.github.fgabrielbraga.vendas.repositories;

import io.github.fgabrielbraga.vendas.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VendaRepository extends JpaRepository<Venda, Long> {

    @Query(value = "SELECT * FROM venda WHERE cliente_id = ?", nativeQuery = true)
    public List<Venda> findByCliente(Long idCliente);
}
