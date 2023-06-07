package io.github.fgabrielbraga.vendas.repositories;

import io.github.fgabrielbraga.vendas.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
