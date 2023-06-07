package io.github.fgabrielbraga.eventosapp.repositories;

import io.github.fgabrielbraga.eventosapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, Long> {
}
