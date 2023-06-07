package io.github.fgabrielbraga.vendas.repositories;

import io.github.fgabrielbraga.vendas.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
