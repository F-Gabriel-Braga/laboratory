package io.github.fgabrielbraga.eventosapp.repositories;

import io.github.fgabrielbraga.eventosapp.models.Convidado;
import io.github.fgabrielbraga.eventosapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

    public Iterable<Convidado> findByEvento(Evento evento);

    public Convidado findByCpf(String cpf);
}
